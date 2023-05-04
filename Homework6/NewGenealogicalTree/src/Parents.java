import java.util.ArrayList;

public class Parents extends Relative{

    public static final String name = "Родители ";
    @Override
    public ArrayList<Member> get(Member member) {
        return member.getParents();
    }

    @Override
    public void show(Member member) {
        System.out.println(name+ " " + member.getName() + " " + member.getSurname()+ " " + member.getParents());
    }
}
