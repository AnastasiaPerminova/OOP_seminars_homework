import java.util.Random;

public class Cat extends Animal {

    boolean purring;//урчание

    boolean mewing;//мяукание

    public Cat(String name, int age, Gender gender, String breed) {
        super(name, age, gender, breed);
    }


    @Override
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

    @Override
    /**
     * Возвращает значение isHappy = true по значению переменных hungry = false, thirsty = false, playful = false.
     * Меняет значение переменной mewing = true, если isHappy = false.
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

    @Override
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
