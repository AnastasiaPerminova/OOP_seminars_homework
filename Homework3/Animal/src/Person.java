public class Person implements PetCaring{
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


    @Override
    public void feedAnimal(Animal animal) {
        animal.eat();

    }

    @Override
    public void giveWater(Animal animal) {
        animal.drink();

    }

    @Override
    public void playWithPet(Animal animal) {
        animal.play();

    }

    @Override
    public void petAnimal(Cat cat) { cat.purr(); }

    @Override
    public void petAnimal(Dog dog) { dog.be_happy();

    }



}

