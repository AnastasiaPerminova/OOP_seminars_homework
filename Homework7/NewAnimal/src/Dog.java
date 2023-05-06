public class Dog extends PetAnimal implements Barking, Licking, Playing, TailWaging {
    private boolean barking;//лаяние

    private boolean licking;//лизание

    private boolean playful;

    private boolean tailWaging;// вилять хвостом;
    public Dog(String name, int age, Gender gender, String breed) {
        super(name, age, gender, breed);
    }


    @Override

    /**
     * Возвращает значение isHappy = true по значению переменных hungry = false, thirsty = false, playful = false.
     * Меняет значение переменной barking = true, если isHappy = false.
     */    public boolean isHappy() {

        if(physicalState.isHungry() || physicalState.isThirsty() || physicalState.isSleepy()){

            bark();
            return false;
        }
        else {
            stopBarking();
            return true;
        }
    }

    /**
     * Выводит в консоль сообщение по значению isHappy.
     */

    @Override
    public void printIsHappy() {
        if(isHappy()) {
            System.out.println("Cобака счастлива!");
        }
        else {
            System.out.println("Собака несчастна!");
        }
    }

    /**
     * Выводит в консоль сообщение по значению переменной barking.
     */
    public void printIsBarking() {

        if(barking){System.out.println("Собака лает!"); }

        else {
            System.out.println("Собака задумалась.");
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
            bark();
            wagTail();
            System.out.println("Собака выспалась! Теперь хочет есть, пить и играть!");
        }
        else{
            System.out.println("Я не хочу спать!");
            isHappy();
        }
    }

    /**
     * Меняет значение переменной licking = true; tail_waging = true;. Выводит сообщение в консоль.
     */

    public void beHappyDog(){
        if(isHappy()){
            lick();
            wagTail();
            System.out.println("Cобака счастлива, лижется и виляет хвостом!");
        }
        else{
            System.out.println("Собака несчастна!");

        }

    }


    @Override
    public void bark() {
        barking = true;

    }

    @Override
    public void stopBarking() {
        barking = false;
    }

    @Override
    public void lick() {
        licking = true;

    }

    @Override
    public void stopLicking() {
        licking = false;

    }

    @Override
    public void play() {
        playful = false;

    }

    @Override
    public void wagTail() {
        tailWaging = true;

    }

    @Override
    public void stopWagTail() {
        tailWaging = false;

    }
}
