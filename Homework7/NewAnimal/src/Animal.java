public abstract class Animal implements Eating, Drinking, Sleeping, BeingHappy{
    AnimalPhysicalState physicalState;
    int age;//возраст

    Gender gender;//пол

    String breed;//порода


    public Animal(int age, Gender gender, String breed) {//конструктор класса
        physicalState = new AnimalPhysicalState();
        this.age = age;
        this.gender = gender;
        this.breed = breed;

    }


    @Override
    public String toString() {
        return String.format(" Возраст: \033[1m%d\033[0m Пол:\033[1m%s\033[0m Порода:\033[1m%s\033[0m Голодный : %b Хочет пить: %b Хочет спать: %b" , age, gender, breed,physicalState.isHungry(), physicalState.isThirsty(), physicalState.isSleepy());
    }


    /**
     * Меняет значение переменной hungry. Выводит сообщение в консоль.
     */
    public void eat() {
        if(physicalState.isHungry()) {
            physicalState.setHungry(false);
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
        if(physicalState.isThirsty()) {
            physicalState.setThirsty(false);
            System.out.println("Животное не хочет пить!");
            isHappy();
        }
        else {
            System.out.println("Я не хочу пить!");
            isHappy();
        }

    }

//    public void play(){
//        if(playful){
//            playful = false;
//            sleepy = true;
//            thirsty = true;
//            System.out.println("Наигрался! Теперь он хочет пить и спать!");
//            isHappy();
//        }
//        else{
//            System.out.println("Я не хочу играть!");
//            isHappy();
//        }
//    }
    /**
     * Меняет значение переменной sleepy = false, hungry = true, thirsty = true, playful = true. Выводит сообщение в консоль.
     */
    public void sleep()
    {
        if(physicalState.isSleepy()) {
            physicalState.setSleepy(false);
            physicalState.setHungry(true);
            physicalState.setThirsty(true);
            System.out.println("Выспался! Теперь он хочет есть и пить.");
        }
        else{
            System.out.println("Я не хочу спать!");
            isHappy();
        }
    }

    @Override
    public boolean isHappy() {
        if(physicalState.isHungry() || physicalState.isThirsty() || physicalState.isSleepy()){
            return false;
        }
        return true;
    }
    public void printIsHappy() {
        if(isHappy()) {
            System.out.println("Cчастлив!");
        }
        else {
            System.out.println("Несчастен!");
        }
    }

}
