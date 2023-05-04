import java.util.ArrayList;

public class Member extends Person {
    private Member spouse;//Супруг(а)
    private ArrayList<Member> ex_spouses = new ArrayList<>();//Бывшие супруги
    private ArrayList<Member> parents = new ArrayList<>();

    private ArrayList<Member> children = new ArrayList<>();//Дети

    public Member getSpouse() {
        return spouse;
    }
    protected void setSpouse(Member spouse) {
        this.spouse = spouse;
    }

    public ArrayList<Member> getEx_spouses() {
        return ex_spouses;
    }

    protected void setEx_spouses(Member ex_spouse) {
        ex_spouses.add(ex_spouse);
    }

    public Member(String name, String fathersName, String surname, int yearOfBirth, Gender gender) {
        super(name, fathersName, surname, yearOfBirth, gender);
    }

    public Member(String name, String fathersName, String surname, Gender gender) {
        super(name, fathersName, surname, gender);
    }

    public Member(String name, String surname, Gender gender) {
        super(name, surname, gender);
    }

    public Member(String name, Gender gender) {
        super(name, gender);
    }

    public Member(Gender gender) {
        super(gender);
    }

    public ArrayList<Member> getChildren() {
        return children;
    }

    public ArrayList<Member> getParents() {
        return parents;
    }
    public void add_Children(Member person1) {
        children.add(person1);
        person1.parents.add(this);

    }
    public void add_Parents(Member person1) {
        parents.add(person1);
        person1.children.add(this);

    }

}
