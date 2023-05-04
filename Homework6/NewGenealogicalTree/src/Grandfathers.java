import java.util.HashSet;

public class Grandfathers extends Relative {
    public static final String name = "Дедушка ";

    @Override
    public HashSet<Member> get(Member member) {

        HashSet<Member> grandfathers = new HashSet<>();
        for (Member person : member.getParents()) {

            for (Member parent : person.getParents()) {
                if (parent.getGender() == Gender.мужской)
                {
                    grandfathers.add(parent);
                }
            }
        }
        return grandfathers;
    }

    @Override
    public void show(Member member) {

        Grandfathers grandfathers = new Grandfathers();
        HashSet<Member> grandfathers_set = grandfathers.get(member);
        for(Member grandfather : grandfathers_set){
            System.out.println(name+ " " + member.getName() + " " + member.getSurname() + " " + grandfather);
        }
    }

    public Member getMothersFather(Member member){

        Mother mother = new Mother();
        Father father = new Father();
        Member member_mother = mother.get(member);
        Member member_mothers_father = father.get(member_mother);
        return member_mothers_father;

    }

    public Member getFatherFather(Member member){
        Father father = new Father();
        Member member_father = father.get(member);
        Member member_fathers_father = father.get(member_father);
        return member_fathers_father;

    }
}
