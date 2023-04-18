public class Person {
    private String name; //Имя

    private String fathersName;//Отчество
    private String surname;//Фамилия

    public Person(String name, String fathersName, String surname) {
        this.name = name;
        this.fathersName = fathersName;
        this.surname = surname;
    }

    public Person(String name) {
        this.name = name;
    }

    /**
     * Преобразует метод вывода на печать для класса Person.
     */
    @Override
    public String toString() {
        return String.format("Имя:\033[1m%s\033[0m Отчество:\033[1m%s\033[0m Фамилия: \033[1m%s\033[0m", name, fathersName, surname);
    }

    /**
     *
     * Вызывает метод eat() для @param cat.
     */
    public void feedCat(Cat cat){
        cat.eat();
    }

    /**
     *
     * Вызывает метод drink() для @param cat.
     */
    public void giveWater(Cat cat){
        cat.drink();
    }

    /**
     *
     * Вызывает метод play() для @param cat.
     */
    public void playWithCat(Cat cat){
        cat.play();
    }
    /**
     *
     * Вызывает метод purr() для @param cat.
     */

    public void petCat(Cat cat){
        cat.purr();
    }

}

