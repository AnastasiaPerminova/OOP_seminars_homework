import java.util.Objects;

public class Person {

    private String getName; //Имя

    private String fathersName;//Отчество
    private String surname;//Фамилия

    private int yearOfBirth;//Год Рождения

    private Gender gender;//Пол

    public String getFathersName() {
        return fathersName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public Person(String name, String fathersName, String surname, int yearOfBirth, Gender gender) { // конструктор класса Person
        this.getName = name;
        this.fathersName = fathersName;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;

    }

    public Person(String name, String fathersName, String surname, Gender gender) { // конструктор класса Person
        this.getName = name;
        this.fathersName = fathersName;
        this.surname = surname;
        this.gender = gender;

    }

    public Person(String name, String surname, Gender gender) { // конструктор класса Person
        this.getName = name;
        this.surname = surname;
        this.gender = gender;

    }

    public Person(String name, Gender gender) { // конструктор класса Person
        this.getName = name;
        this.gender = gender;

    }

    public Person(Gender gender) { // конструктор класса Person
        this.gender = gender;
    }

    public String getName() {
        return getName;
    } // Возвращает имя из переменной name.

    public String getSurname() {
        return surname;
    } // Возвращает фамилию из переменной surname.

    /**
     * Преобразует метод вывода на печать для класса Person.
     */
    @Override
    public String toString() {
        return String.format("Имя:\033[1m%s\033[0m Отчество:\033[1m%s\033[0m Фамилия: \033[1m%s\033[0m Год рождения: \033[1m%d\033[0m Пол:\033[1m%s\033[0m", getName, fathersName, surname, yearOfBirth, gender);
    }

    /**
     * Создает hash.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getName, fathersName, surname, yearOfBirth);
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
        return Objects.equals(getName, anotherPerson.getName) && surname == anotherPerson.surname && yearOfBirth == anotherPerson.yearOfBirth && fathersName == anotherPerson.fathersName;
    }

    public Member toMember(){

        String fName = this.getName;
        Gender fGender = gender;
        int fYearOfBirth = this.yearOfBirth;
        String fFathersName = this.fathersName;
        String fSurname = this.surname;

        Member member= new Member(fName, fFathersName, fSurname, fYearOfBirth, fGender);
        return member;

    }
}


