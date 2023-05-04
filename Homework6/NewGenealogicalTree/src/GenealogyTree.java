import java.util.ArrayList;
import java.util.HashSet;

public class GenealogyTree {
    private Member main_person;

    protected Member spouse;
    protected Member mother;

    protected Member father;

    protected ArrayList<Member> children = new ArrayList<>();

    protected ArrayList<Member> ex_spouses = new ArrayList<>();

    protected HashSet<Member> sisters = new HashSet<>();
    protected HashSet<Member> brothers = new HashSet<>();

    protected Member mothers_mother;

    protected Member fathers_mother;

    protected Member mothers_father;

    protected Member fathers_father;

    protected GenealogyTree(Member main_person) {
        this.main_person = main_person;
    }

    public void createGenealogyTree(){

        spouse = new Spouse().get(main_person);
        ex_spouses = new Ex_spouses().get(main_person);

        mother = new Mother().get(main_person);
        father= new Father().get(main_person);
        children = new Children().get(main_person);
        sisters = new Sisters().get(main_person);
        brothers = new Brothers().get(main_person);
        mothers_mother = new Grandmothers().getMothersMother(main_person);
        mothers_father = new Grandfathers().getMothersFather(main_person);
        fathers_mother = new Grandmothers().getFathersMother(main_person);
        fathers_father = new Grandfathers().getFatherFather(main_person);

    }

    public void printGenealogyTree(){

        createGenealogyTree();
        System.out.println(" Генеалогическое древо для " + main_person.getSurname() + " " + main_person.getName() + " .");
        System.out.println("Супруг(а)-" + this.spouse);
        for(Member ex_spouse : ex_spouses){
            System.out.println("Бывший супруг(а) " + ex_spouse);
        }

        for(Member child : children){
            System.out.println("Ребенок - " + child);
        }
        System.out.println("Мать -" + this.mother + "\nОтец -" + this.father);
        System.out.println("Бабушка по материнской линии - " + this.mothers_mother + "\nДедушка по материнской линии - " + this.mothers_father);
        System.out.println("Бабушка по отцовской линии - " + this.fathers_mother + "\nДедушка по отцовской линии - " + this.fathers_father);
        for(Member sister : sisters){
            System.out.println("Cестра - " + sister);
        }
        for(Member brother : brothers){
            System.out.println("Брат - " + brother);
        }
    }
}
