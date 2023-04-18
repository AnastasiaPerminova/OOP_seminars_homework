import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {

    private String name; //Имя

    private String fathersName;//Отчество
    private String surname;//Фамилия

    private int age;//Возраст

    private Gender gender;//Пол

    private Person spouse;//Супруг(а)

    private ArrayList<Person> parents = new ArrayList<>();//Родители

    private ArrayList<Person> children = new ArrayList<>();//Дети

    private ArrayList<Person> ex_spouses = new ArrayList<>();//Бывшие супруги


    public Person(String name, String fathersName, String surname, int age, Gender gender) { // конструктор класса Person
        this.name = name;
        this.fathersName = fathersName;
        this.surname = surname;
        this.age = age;
        this.gender = gender;

    }
    public Person(String name, String fathersName, String surname, Gender gender) { // конструктор класса Person
        this.name = name;
        this.fathersName = fathersName;
        this.surname = surname;
        this.gender = gender;

    }
    public Person(String name,  String surname, Gender gender) { // конструктор класса Person
        this.name = name;
        this.surname = surname;
        this.gender = gender;

    }
    public Person(String name, Gender gender) { // конструктор класса Person
        this.name = name;
        this.gender = gender;

    }
    public Person(Gender gender) { // конструктор класса Person
         this.gender = gender;
    }
    public String getName(){
        return name;
    } // Возвращает имя из переменной name.

    public String getSurname(){
        return surname;
    } // Возвращает фамилию из переменной surname.

    /**
     * Преобразует метод вывода на печать для класса Person.
     */
    @Override
    public String toString() {
        return String.format("Имя:\033[1m%s\033[0m Отчество:\033[1m%s\033[0m Фамилия: \033[1m%s\033[0m Возраст: \033[1m%d\033[0m Пол:\033[1m%s\033[0m", name, fathersName, surname, age, gender);
    }

    /**
     * Создает hash.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, fathersName, surname, age);
    }


    /**
     Сравнивает экземпляры класса Person.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean objIsPerson = obj instanceof Person;
        if (!objIsPerson) {
            return false;
        }

        Person anotherPerson = (Person) obj;
        return Objects.equals(name, anotherPerson.name) && surname == anotherPerson.surname && age == anotherPerson.age && fathersName == anotherPerson.fathersName;
    }


    /**
     * Добавляет в качестве ребенка @param person1 в переменную children.
     */
    public void add_Children(Person person1) {
        children.add(person1);
        person1.parents.add(this);

    }


    /**
     * Добавляет в качестве родителя @param person1 в переменную parents.
     */
    public void add_Parents(Person person1) {
        parents.add(person1);
        person1.children.add(this);

    }


    /**
     * Возвращает список всех детей из переменной children.
     */
    public ArrayList<Person> getChildren() {
        return children;
    }

    /**
     * Выводит на печать список всех детей из переменной children.
     */
    public void printChildren(){
        System.out.printf("Дети %s %s : %s ", name, surname, getChildren());
        System.out.println();
    }


    /**
     * Возвращает список всех родителей из переменной parents.
     */
    public ArrayList<Person> getParents() {
        return parents;
    }

    /**
     * Возвращает список всех сестёр Person.
     */
    public Set<Person> getSisters() {
        Set<Person> sisters = new HashSet<>();
        for (Person person : getParents()) {

            for (Person child : person.getChildren()) {
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

    public Set<Person> getBrothers() {
        Set<Person> brothers = new HashSet<>();
        for (Person person : getParents()) {

            for (Person child : person.getChildren()) {
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

    public Set<Person> getGrandParents() {
        Set<Person> grandparents = new HashSet<>();
        for (Person person : getParents()) {

            for (Person parent : person.getParents()) {
                grandparents.add(parent);
            }
        }
        return grandparents;
    }

    /**
     * Добавляет в качестве супруга(и)  @param person1 в переменную spouse.
     */
    public void getMarried(Person person1) {
        if (spouse == null) {
            spouse = person1;
            person1.spouse = this;
        } else {
            System.out.println("Внесение изменений невозможно.");
        }
    }



    /**
     * Убирает @param person1 из переменной spouse, spouse = null.
     * Добавляет в качестве бывшего супруга(и)  @param person1 в переменную  ex_spouse.
     */
    public void getDivorced(Person person1) {
        if (spouse == person1) {
            spouse = null;
            ex_spouses.add(person1);
            person1.spouse = null;
            person1.ex_spouses.add(this);

        } else {
            System.out.println("Внесение изменений невозможно.");
        }
    }

    /**
     * Возвращает супруга(у) из переменной spouse Person.
     */
    public Person getSpouse() {
        return spouse;
    }

    /**
     * Возвращает список бывших супругов из переменной ex_spouses Person
     */
    public ArrayList<Person> getEx_spouses() {
        return ex_spouses;
    }

}