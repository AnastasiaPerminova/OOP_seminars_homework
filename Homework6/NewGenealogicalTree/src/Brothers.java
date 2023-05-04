import java.util.HashSet;

public class Brothers extends Relative {

    public static final String name = "Брат ";

    @Override
    public HashSet<Member> get(Member member) {
        HashSet<Member> brothers = new HashSet<>();
        for (Member person : member.getParents()) {

            for (Member child : person.getChildren()) {
                if (child.getGender() == Gender.мужской) {
                    brothers.add(child);
                }
            }
        }
        return brothers;
    }


    @Override
    public void show(Member member) {
        Brothers brothers = new Brothers();
        HashSet<Member> brothers_set = brothers.get(member);
        for(Member brother : brothers_set){
            System.out.println(name+ " " + member.getName() + " " + member.getSurname() + " " + brother);
        }

    }
}
