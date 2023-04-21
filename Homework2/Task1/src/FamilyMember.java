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
     * Возвращает список всех сестёр Person.
     */
    public Set<FamilyMember> getSisters() {
        Set<FamilyMember> sisters = new HashSet<>();
        for (FamilyMember person : getParents()) {

            for (FamilyMember child : person.getChildren()) {
                if (child.gender == Gender.женский) {
                    sisters.add(child);
                }
            }
        }
        return sisters;
    }


    /**
     * Возвращает список всех братьев Person.
     */

    public Set<FamilyMember> getBrothers() {
        Set<FamilyMember> brothers = new HashSet<>();
        for (FamilyMember person : getParents()) {

            for (FamilyMember child : person.getChildren()) {
                if (child.gender == Gender.мужской) {
                    brothers.add(child);
                }
            }
        }
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


    public void setMother(FamilyMember person1) {
        this.mother = person1;
    }

    public void setMother() {
        if (mother == null) {
            for (FamilyMember person : getParents()) {
                if (person.gender == Gender.женский) {
                    this.mother = person;
                }
            }
        }
    }

    public void setFather(FamilyMember person1) {
        this.father = person1;
    }

    public void setFather() {
        if (father == null) {
            for (FamilyMember person : getParents()) {
                if (person.gender == Gender.мужской) {
                    this.father = person;
                }
            }
        }
    }

    public FamilyMember getMother() {
        return mother;
    }

    public FamilyMember getFather() {
        return father;
    }

    @Override
    public void createGenealogicalTree() {
        if (mother == null) {
            setMother();
        }
        if (father == null) {
            setFather();
        }
        System.out.println("Мать -" + this.mother + "\nОтец -" + this.father);
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
        System.out.println("Бабушка по материнской линии - " + this.mothers_mother + "\nДедушка по материнской линии - " + this.mothers_father);
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
        System.out.println("Бабушка по отцовской линии - " + this.fathers_mother + "\nДедушка по отцовской линии - " + this.fathers_father);


    }

    @Override
    public void findRelation(FamilyMember member) {

    }

    @Override
    public void findRelative(Person person) {

    }
}

