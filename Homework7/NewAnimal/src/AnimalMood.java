import java.util.Random;
public class AnimalMood <N extends Animal> implements BeingHappy{
    private N animal;

    private boolean hungry;//голод

    private boolean thirsty;//жажда

    private boolean sleepy;//сонливость

    private boolean playful;//игривость

    public AnimalMood(N animal) {
        this.animal = animal;
        Random r = new Random();
        hungry = r.nextBoolean();
        thirsty = r.nextBoolean();
        sleepy = r.nextBoolean();
        playful = r.nextBoolean();
    }

    @Override
    public boolean isHappy() {
            if(hungry || thirsty|| playful){
                return false;
            }
            else {
                return true;
            }
    }



    @Override
    public void printIsHappy() {
        if(isHappy()) {
            System.out.println("Cчастлив!");
        }
        else {
            System.out.println("Несчастен!");
        }

    }
}
