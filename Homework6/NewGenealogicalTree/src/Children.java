import java.util.ArrayList;

public class Children extends Relative{

    public static final String name = "Ребенок ";
    @Override
    public ArrayList<Member> get(Member member) {
        return member.getChildren();
    }

    @Override
    public void show(Member member) {
        for(Member child : member.getChildren()){
            System.out.println(name+ " " + member.getName() + " " + member.getSurname() + " " + child);
        }

    }
}
