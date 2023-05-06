import java.util.Random;

public abstract class Animal {
    String name; //кличка

    int age;//возраст

    Gender gender;//пол

    String breed;//порода

    Person owner;//владелец

    boolean hungry;//голод

    boolean thirsty;//жажда

    boolean sleepy;//сонливость

    boolean playful;//игривость
    public Animal(String name, int age, Gender gender, String breed) {//конструктор класса
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
        Random r = new Random();
        hungry = r.nextBoolean();
        thirsty = r.nextBoolean();
        sleepy = r.nextBoolean();
        playful = r.nextBoolean();


    }
    /**
     Установка *  @param owner.
     */
    public void setOwner(Person owner){
        this.owner = owner;
    }

    /**
     *
     * @return переменную owner.
     */
    public Person getOwner(){
        return owner;
    }

    /**
     *  Преобразует метод вывода на печать для класса Cat.
     */
    @Override
    public String toString() {
        return String.format("Кличка:\033[1m%s\033[0m  Возраст: \033[1m%d\033[0m Пол:\033[1m%s\033[0m Порода:\033[1m%s\033[0m Голодный : %b Хочет пить: %b Хочет спать: %b Хочет играть: %b " , name, age, gender, breed,hungry, thirsty, sleepy, playful );
    }

    /**
     * Возвращает значение isHappy = true по значению переменных hungry = false, thirsty = false, playful = false.
     */

    public boolean isHappy()
    {
        if(hungry || thirsty|| playful){
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * Выводит в консоль сообщение по значению isHappy.
     */
    public void printIsHappy() {
        if(isHappy()) {
            System.out.println("Cчастлив!");
        }
        else {
            System.out.println("Несчастен!");
        }
    }
    /**
     * Меняет значение переменной hungry. Выводит сообщение в консоль.
     */
    public void eat() {
        if(hungry) {
            hungry = false;
            System.out.println("Животное сыто!");
            isHappy();
        }
        else {
            System.out.println("Я не хочу есть!");
            isHappy();
        }
    }
    /**
     * Меняет значение переменной thirsty. Выводит сообщение в консоль.
     */
    public void drink() {
        if(thirsty) {
            thirsty = false;
            System.out.println("Животное не хочет пить!");
            isHappy();
        }
        else {
            System.out.println("Я не хочу пить!");
            isHappy();
        }

    }
    /**
     * Меняет значение переменной playful = false, sleepy = true, thirsty = true. Выводит сообщение в консоль.
     */
    public void play(){
        if(playful){
            playful = false;
            sleepy = true;
            thirsty = true;
            System.out.println("Наигрался! Теперь он хочет пить и спать!");
            isHappy();
        }
        else{
            System.out.println("Я не хочу играть!");
            isHappy();
        }
    }
    /**
     * Меняет значение переменной sleepy = false, hungry = true, thirsty = true, playful = true. Выводит сообщение в консоль.
     */
    public void sleep()
    {
        if(sleepy) {
            sleepy = false;
            hungry = true;
            thirsty = true;
            playful = true;
            System.out.println("Выспался! Теперь он хочет есть, пить и играть!");
        }
        else{
            System.out.println("Я не хочу спать!");
            isHappy();
        }
    }

}
