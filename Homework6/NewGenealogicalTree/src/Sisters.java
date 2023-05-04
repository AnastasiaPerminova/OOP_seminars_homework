import java.util.HashSet;

public class Sisters extends Relative {

    public static final String name = "Сестра ";

    @Override
    public HashSet<Member> get(Member member) {
        HashSet<Member> sisters = new HashSet<>();
        for (Member person : member.getParents()) {

            for (Member child : person.getChildren()) {
                if (child.getGender() == Gender.женский) {
                    sisters.add(child);
                }
            }
        }
        return sisters;
    }


    @Override
    public void show(Member member) {
        Sisters sisters = new Sisters();
        HashSet<Member> sisters_set = sisters.get(member);
        for(Member sister : sisters_set){
            System.out.println(name+ " " + member.getName() + " " + member.getSurname() + " " + sister);
        }

    }
}
