import java.util.HashSet;


public class Grandmothers extends Relative{

    public static final String name = "Бабушка ";

    @Override
    public HashSet<Member> get(Member member) {

        HashSet<Member> grandmothers = new HashSet<>();
        for (Member person : member.getParents()) {

            for (Member parent : person.getParents()) {
                if (parent.getGender() == Gender.женский)
                {
                    grandmothers.add(parent);
                }
            }
        }
        return grandmothers;
    }

    @Override
    public void show(Member member) {

        Grandmothers grandmothers = new Grandmothers();
        HashSet<Member> grandmothers_set = grandmothers.get(member);
        for(Member grandmother : grandmothers_set){
            System.out.println(name+ " " + member.getName() + " " + member.getSurname() + " " + grandmother);
        }
    }

    public Member getMothersMother(Member member){

        Mother mother = new Mother();
        Member member_mother = mother.get(member);
        Member member_mothers_mother = mother.get(member_mother);
        return member_mothers_mother;
    }

    public Member getFathersMother(Member member){
        Father father = new Father();
        Mother mother = new Mother();
        Member member_father = father.get(member);
        Member member_fathers_mother = mother.get(member_father);
        return member_fathers_mother;
    }

}

