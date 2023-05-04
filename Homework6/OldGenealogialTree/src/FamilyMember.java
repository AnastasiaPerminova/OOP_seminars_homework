import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FamilyMember extends Person implements GenealogicalTree {
    private FamilyMember spouse;//Супруг(а)

    private ArrayList<FamilyMember> parents = new ArrayList<>();//Родители

    private ArrayList<FamilyMember> children = new ArrayList<>();//Дети

    private ArrayList<FamilyMember> ex_spouses = new ArrayList<>();//Бывшие супруги

    private FamilyMember mother;
    private FamilyMember father;

    private HashSet<FamilyMember> sisters = new HashSet<>();

    private HashSet<FamilyMember> brothers = new HashSet<>();

    private FamilyMember mothers_mother;

    private FamilyMember mothers_father;

    private FamilyMember fathers_mother;

    private FamilyMember fathers_father;


    public FamilyMember(String name, String fathersName, String surname, int age, Gender gender) {
        super(name, fathersName, surname, age, gender);
    }

    public FamilyMember(String name, String fathersName, String surname, Gender gender) {
        super(name, fathersName, surname, gender);
    }

    public FamilyMember(String name, String surname, Gender gender) {
        super(name, surname, gender);
    }

    public FamilyMember(String name, Gender gender) {
        super(name, gender);
    }

    public FamilyMember(Gender gender) {
        super(gender);
    }

    /**
     * Добавляет в качестве ребенка @param member в переменную children.
     */
    public void add_Children(FamilyMember member) {
        children.add(member);
        member.parents.add(this);


    }


    /**
     * Добавляет в качестве родителя @param member в переменную parents.
     */
    public void add_Parents(FamilyMember member) {
        parents.add(member);
        member.children.add(this);
        if (member.gender == Gender.женский) {
            this.mother = member;
        }
        if (member.gender == Gender.мужской) {
            this.father = member;
        }
    }



    /**
     * Возвращает список всех детей из переменной children.
     */
    public ArrayList<FamilyMember> getChildren() {
        return children;
    }

    /**
     * Выводит на печать список всех детей из переменной children.
     */
    public void printChildren() {
        System.out.printf("Дети %s %s : %s ", name, surname, getChildren());
        System.out.println();
    }



    /**
     * Возвращает список всех родителей из переменной parents.
     */
    public ArrayList<FamilyMember> getParents() {
        return parents;
    }

    /**
     *  Добавляет список всех сестёр в переменную sisters.
     */
    private void setSisters() {
        for (FamilyMember person : getParents()) {

            for (FamilyMember child : person.getChildren()) {
                if (child.gender == Gender.женский) {
                    sisters.add(child);
                }
            }
        }
    }
    /**
     *  Возвращает список всех сестёр из переменной sisters.
     */

    public HashSet<FamilyMember> getSisters() {
        setSisters();
        return sisters;
    }

    /**
     * Добавляет  cписок всех братьев в переменную brothers.
     */
    private void setBrothers() {
        for (FamilyMember person : getParents()) {

            for (FamilyMember child : person.getChildren()) {
                if (child.gender == Gender.мужской) {
                    brothers.add(child);
                }

            }
        }
    }

    /**
     * Возвращает список всех братьев из переменной brothers.
     */

    public HashSet<FamilyMember> getBrothers() {
        setBrothers();
        return brothers;
    }


    /**
     * Возвращает список всех бабушек и дедушек Person.
     */

    public Set<FamilyMember> getGrandParents() {
        Set<FamilyMember> grandparents = new HashSet<>();
        for (FamilyMember person : getParents()) {

            for (FamilyMember parent : person.getParents()) {
                grandparents.add(parent);
            }
        }
        return grandparents;
    }

    /**
     * Добавляет в качестве супруга(и)  @param member в переменную spouse.
     */
    public void getMarried(FamilyMember member) {
        if (spouse == null) {
            spouse = member;
            member.spouse = this;
        } else {
            System.out.println("Внесение изменений невозможно.");
        }
    }


    /**
     * Убирает @param member из переменной spouse, spouse = null.
     * Добавляет в качестве бывшего супруга(и)  @param member в переменную  ex_spouse.
     */
    public void getDivorced(FamilyMember member) {
        if (spouse == member) {
            spouse = null;
            ex_spouses.add(member);
            member.spouse = null;
            member.ex_spouses.add(this);

        } else {
            System.out.println("Внесение изменений невозможно.");
        }
    }

    /**
     * Возвращает супруга(у) из переменной spouse Person.
     */
    public FamilyMember getSpouse() {
        return spouse;
    }

    /**
     * Возвращает список бывших супругов из переменной ex_spouses Person
     */
    public ArrayList<FamilyMember> getEx_spouses() {
        return ex_spouses;
    }

    /**
     * Добавлят значение в переменную mother.
     */
    private void setMother() {
        if (mother == null) {
            for (FamilyMember person : getParents()) {
                if (person.gender == Gender.женский) {
                    this.mother = person;
                }
            }
        }
    }
    /**
     * Добавлят значение в переменную father.
     */
    private void setFather() {
        if (father == null) {
            for (FamilyMember person : getParents()) {
                if (person.gender == Gender.мужской) {
                    this.father = person;
                }
            }
        }
    }
    /**
     * Возвращает значение переменной mother.
     */
    public FamilyMember getMother() {
        return mother;
    }
    /**
     * Возвращает значение переменной father.
     */
    public FamilyMember getFather() {
        return father;
    }

    /**
     * Создает генеалогическое древо для member, внося значения в соотвтствующие переменные.
     */
    public void createGenealogicalTree() {
        if (mother == null) {
            setMother();
        }
        if (father == null) {
            setFather();
        }

        if (mother != null) {
            if (mothers_mother == null) {
                if (mother.mother == null) {
                    mother.setMother();
                }
                mothers_mother = mother.mother;
            }
            if (mothers_father == null) {
                if (mother.father == null) {
                    mother.setFather();
                }
                mothers_father = mother.father;
            }
        }

        if (father != null) {
            if (fathers_mother == null) {
                if (father.mother == null) {
                    father.setMother();
                }
                fathers_mother = father.mother;
            }

            if (fathers_father == null) {
                if (father.father == null) {
                    father.setFather();
                }
                fathers_father = father.father;
            }
        }

        setSisters();
        setBrothers();

   }

    /**
     * Выводит, кем является @param member для this.member.
     */
    @Override
    public void findRelation(FamilyMember member) {
        createGenealogicalTree();
        if(member == mother){System.out.println("Для "+ this.name+ " " + member.name + " " + member.surname +  " - мать");}
        else if(member == father){System.out.println("Для "+ this.name+ " " + member.name + " " + member.surname + " - отец");}
        else if(member == spouse){System.out.println("Для "+ this.name+ " " + member.name + " " + member.surname + " - cупруг");}
        else if(member == mothers_mother){System.out.println("Для "+ this.name+ " " + member.name + " " + member.surname + " - бабушка по материнской линии");}
        else if(member == mothers_father){System.out.println("Для "+ this.name+ " " + member.name + " " + member.surname +  " - дедушка по материнской линии");}
        else if(member == fathers_mother){System.out.println("Для "+ this.name+ " " + member.name + " " + member.surname + " - бабушка по отцовской линии");}
        else if(member == fathers_father){System.out.println("Для "+ this.name+ " " + member.name + " " + member.surname + " - дедушка по отцовской линии");}
        else if(children.contains(member)){System.out.println("Для "+ this.name+ " " + member.name + " " + member.surname + " - ребенок");}
        else if(sisters.contains(member)){System.out.println("Для "+ this.name+ " " + member.name + " " + member.surname + " - сестра");}
        else if(brothers.contains(member)){System.out.println("Для "+ this.name+ " " + member.name + " " + member.surname + " - брат");}
        else if(ex_spouses.contains(member)){System.out.println("Для "+ this.name+ " " + member.name + " " + member.surname + " - бывший супруг(а)");}

        else {System.out.println("Для "+ this.name+ " " + member.name + " " + member.surname +  " не является родственником");}
    }

    /**
     *  Выводит, кто является @param relative для this.member.
     */
    @Override
    public void findRelative(Relatives relative) {
        if (relative == Relatives.мать){System.out.println("Для "+ this.name+ " " + " мать - " + this.mother);}
        else if (relative == Relatives.отец){System.out.println("Для "+ this.name+ " " + " отец - " + this.father);}
        else if(relative == Relatives.супруг)System.out.println("Для " + this.name +"супруг(а)-" + this.spouse);
        else if (relative == Relatives.бабушка_по_матери){System.out.println("Для "+ this.name+ " " + " бабушка по матери " + this.mothers_mother);}
        else if (relative == Relatives.бабушка_по_отцу){System.out.println("Для "+ this.name+ " " + " бабушка по отцу " + this.fathers_mother);}
        else if (relative == Relatives.дедушка_по_матери){System.out.println("Для "+ this.name+ " " + " дедушка по матери " + this.mothers_father);}
        else if (relative == Relatives.ребенок){ for(FamilyMember child : children){
            System.out.println("Для "+ this.name+ " " + "ребенок"  + " " + child);}
        }
        else if (relative == Relatives.брат){for(FamilyMember brother : brothers){
                System.out.println("Для "+ this.name +  " " + "брат - " + brother);}
        }
        else if (relative == Relatives.сестра){for(FamilyMember sister : sisters){
            System.out.println("Для "+ this.name +  " " + "cестра - " + sister);}
        }
        else if (relative == Relatives.бывший_супруг_а){for(FamilyMember ex_spouse : ex_spouses){
            System.out.println("Для "+ this.name +  " " + "бывший супруг(а) " + ex_spouse);}
        }


    }

    /**
     * Выводит генеалогическое древо для this.member
     */
    @Override
    public void printCreatedGenealogicalTree() {
        createGenealogicalTree();
        System.out.println("Генеалогическое древо для " + this.name + " " + this.surname);
        System.out.println("Супруг(а)-" + this.spouse);
        for(FamilyMember ex_spouse : ex_spouses){
            System.out.println("Бывший супруг(а) " + ex_spouse);
        }

        for(FamilyMember child : children){
            System.out.println("Ребенок - " + child);
        }
        System.out.println("Мать -" + this.mother + "\nОтец -" + this.father);
        System.out.println("Бабушка по материнской линии - " + this.mothers_mother + "\nДедушка по материнской линии - " + this.mothers_father);
        System.out.println("Бабушка по отцовской линии - " + this.fathers_mother + "\nДедушка по отцовской линии - " + this.fathers_father);
        for(FamilyMember sister : sisters){
            System.out.println("Cестра - " + sister);
        }
        for(FamilyMember brother : brothers){
            System.out.println("Брат - " + brother);
        }



    }
}

