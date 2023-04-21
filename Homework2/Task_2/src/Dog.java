public class Dog extends Animal{
    boolean barking;//лаяние

    boolean licking;//лизание

    boolean tail_waging;// вилять хвостом;
    public Dog(String name, int age, Gender gender, String breed) {
        super(name, age, gender, breed);
    }


    @Override

    /**
     * Возвращает значение isHappy = true по значению переменных hungry = false, thirsty = false, playful = false.
     * Меняет значение переменной barking = true, если isHappy = false.
     */    public boolean isHappy()
    {
        if(hungry || thirsty|| playful){

            barking = true;
            return false;
        }
        else {
            barking = false;
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
        if(sleepy) {
            sleepy = false;
            hungry = true;
            thirsty = true;
            playful = true;
            barking = true;
            tail_waging = true;
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
    public void be_happy(){
        if(isHappy()){
            licking = true;
            tail_waging = true;
            System.out.println("Cобака счастлива, лижется и виляет хвостом!");
        }
        else{
            System.out.println("Собака несчастна!");

        }

    }


}
