public class Cat extends PetAnimal implements Mewing, Purring, Playing{
    double weight;

    boolean playful;
    boolean purring;//урчание

    boolean mewing;//мяукание


    public Cat(String name, int age, Gender gender, String breed, double weight) {
        super(name, age, gender, breed);
        this.weight = weight;
    }


    @Override
    /**
     * Возвращает значение isHappy = true по значению переменных hungry = false, thirsty = false, playful = false.
     * Меняет значение переменной mewing = true, если isHappy = false.
     */
    public boolean isHappy() {

        if(physicalState.isHungry() || physicalState.isThirsty() || physicalState.isSleepy()){
            mew();
            return false;
        }
        else {
            stopMew();
            return true;
        }
    }

    /**
     * Выводит в консоль сообщение по значению isHappy.
     */

    @Override

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
        if(physicalState.isSleepy()) {
            physicalState.setSleepy(false);
            physicalState.setHungry(true);
            physicalState.setThirsty(true);
            playful = true;
            mew();
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

    @Override
    public void stopPurr() {
        purring = false;
    }


    @Override
    public void mew() {
        mewing = true;
    }

    @Override
    public void stopMew() {
        mewing = false;
    }



    @Override
    public void play() {
        playful = false;

    }
}
