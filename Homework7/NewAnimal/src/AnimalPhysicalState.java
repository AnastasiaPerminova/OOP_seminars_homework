import java.util.Random;
public class AnimalPhysicalState {
    private boolean hungry;//голод

    private boolean thirsty;//жажда

    private boolean sleepy;//сонливость

    public AnimalPhysicalState() {
        Random r = new Random();
        hungry = r.nextBoolean();
        thirsty = r.nextBoolean();
        sleepy = r.nextBoolean();
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean isThirsty() {
        return thirsty;
    }

    public void setThirsty(boolean thirsty) {
        this.thirsty = thirsty;
    }

    public boolean isSleepy() {
        return sleepy;
    }

    public void setSleepy(boolean sleepy) {
        this.sleepy = sleepy;
    }
}
