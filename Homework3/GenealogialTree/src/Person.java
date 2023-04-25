import java.util.Objects;

public class Person {

    protected String name; //Имя

    protected String fathersName;//Отчество
    protected String surname;//Фамилия

    protected int age;//Возраст

    protected Gender gender;//Пол


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

    public Person(String name, String surname, Gender gender) { // конструктор класса Person
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

    public String getName() {
        return name;
    } // Возвращает имя из переменной name.

    public String getSurname() {
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
     * Сравнивает экземпляры класса Person.
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

    public FamilyMember toFamilyMember(){

      String fName = this.name;
      Gender fGender = gender;
      int fAge = this.age;
      String fFathersName = this.fathersName;
      String fSurname = this.surname;

      FamilyMember member= new FamilyMember(fName, fFathersName, fSurname, fAge, fGender);
      return member;

    }
}


