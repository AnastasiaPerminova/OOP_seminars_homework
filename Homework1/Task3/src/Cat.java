import java.util.Random;

public class Cat {
    String name; //кличка

    int age;//возраст

    Gender gender;//пол

    String breed;//порода

    Person owner;//владелец

    boolean hungry;//голод

    boolean thirsty;//жажда

    boolean sleepy;//сонливость

    boolean playful;//игривость

    boolean purring;//урчание

    boolean mewing;//мяукание

    public Cat(String name, int age, Gender gender, String breed) {//конструктор класса
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
     * Меняет значение переменной mewing = true, если isHappy = false.
     */
    public boolean isHappy()
    {
        if(hungry || thirsty|| playful){

            mewing = true;
            return false;
        }
        else {
            mewing = false;
            return true;
        }
    }

    /**
     * Выводит в консоль сообщение по значению isHappy.
     */
    public void printIsHappy() {
        if(isHappy()) {
            System.out.println("Котик счастлив!");
        }
        else {
            System.out.println("Котик несчастен!");
        }
    }
    /**
     * Выводит в консоль сообщение по значению переменной mewing.
     */
    public void printIsMewing() {

        if(mewing){System.out.println("Котик мяукает!"); }

        else {
            System.out.println("Котик погружен в свои мысли и молчит.");
        }
    }

    /**
     * Меняет значение переменной hungry. Выводит сообщение в консоль.
     */
    public void eat() {
        if(hungry) {
        hungry = false;
        System.out.println("Теперь котик сыт!");
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
            System.out.println("Теперь котик не хочет пить!");
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
            System.out.println("Котик наигрался! Теперь он хочет пить и спать!");
            isHappy();
        }
        else{
            System.out.println("Я не хочу играть!");
            isHappy();
        }
    }
    /**
     * Меняет значение переменной sleepy = false, hungry = true, thirsty = true, playful = true, mewing = true. R. Выводит сообщение в консоль.
     */
    public void sleep()
    {
        if(sleepy) {
            sleepy = false;
            hungry = true;
            thirsty = true;
            playful = true;
            mewing = true;
            System.out.println("Котик выспался! Теперь он хочет есть, пить и играть!");
        }
        else{
            System.out.println("Я не хочу спать!");
            isHappy();
        }
    }

    /**
     * Меняет значение переменной purring = true. Выводит сообщение в консоль.
     */
    public void purr(){
        if(isHappy()){
            purring = true;
            System.out.println("Котик счастлив и урчит!");
        }
        else{
            System.out.println("Котик несчастен!");

        }

    }
}
