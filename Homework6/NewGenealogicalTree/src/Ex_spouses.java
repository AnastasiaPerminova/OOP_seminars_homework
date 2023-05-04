import java.util.ArrayList;

public class Ex_spouses extends Relative{
    public static final String name = "Бывшие супруги ";
    @Override
    public ArrayList<Member> get(Member member) {
        return member.getEx_spouses();
    }

    @Override
    public void show(Member member) {
        System.out.println(name+ " " + member.getName() + " " + member.getSurname() + " " + member.getEx_spouses());
    }
}
