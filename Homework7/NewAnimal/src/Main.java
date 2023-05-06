public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 10, Gender.male, "персидский", 4.3);
        Cat cat2 = new Cat("Бася", 5, Gender.female, "дворовый", 5.1);
        System.out.println(cat1);
        System.out.println(cat2);
        cat1.printIsHappy();
        cat2.printIsHappy();
        cat1.printIsMewing();
        cat2.printIsMewing();
        Person person1 = new Person("Вася");
        Person person2 = new Person("Александр", "Васильевич", "Иванов");
        cat1.setOwner(person2);
        System.out.println(cat1.getOwner());
        cat2.setOwner(person1);
        System.out.println(cat2.getOwner());
        person1.feedAnimal(cat2);
        person1.petCat(cat2);
        person1.giveWater(cat2);
        person1.playWithCat(cat2);
        person1.giveWater(cat2);
        person1.petCat(cat2);
        cat2.sleep();
        cat2.printIsMewing();


        Dog dog1 = new Dog("Жучка", 10, Gender.female, "дворняжка");
        System.out.println(dog1);
        dog1.isHappy();
        dog1.printIsHappy();
        dog1.setOwner(person2);
        System.out.println(dog1.getOwner());
        person2.feedAnimal(dog1);
        person2.petDog(dog1);
        person1.giveWater(dog1);
        person1.playWithDog(dog1);
        person1.giveWater(dog1);
        person1.petDog(dog1);
        dog1.sleep();
        dog1.printIsBarking();


    }
}
