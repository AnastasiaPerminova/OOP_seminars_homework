public class Throwing implements Weapon{
    private int distance;

    public Throwing(int distance){
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Throwing{" +
                "distance=" + distance + "damage " + damage() +
                '}';
    }

    @Override
    public int damage() {
        return 0;
    }
}
