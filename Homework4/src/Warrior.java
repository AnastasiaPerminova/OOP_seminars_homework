import java.util.Random;

public abstract class Warrior<T extends Weapon, V extends Shield> extends Person {
    protected T weapon;

    public V shield;

    protected static Random rand = new Random();

    public Warrior(String name, int hp, T weapon, V shield) {
        super(name, hp);
        this.weapon = weapon;
        this.shield = shield;}



    public int harm(){
        boolean isHit = rand.nextBoolean();
        int damage = 0;
        int defence = 0;
        int harm = 0;
        if (isHit) {

            damage = rand.nextInt(weapon.damage() + 1);
            if (shield != null) {
            defence = rand.nextInt(shield.defend() + 1);
            }
            if (defence > damage) {
                harm =0;
            }
            else {
                harm = damage - defence;
            }
            System.out.println("{Hit : damage: " + damage + " defence: " + defence + "}");

        }
        return harm;
    }

    @Override
    public String toString() {
        return "Warrior{" + "name = " + getName() + " hp =  " + getHp() +
                " weapon = " + weapon +
                '}';
    }
    public int getRangeDefence(){
        return rand.nextInt(shield.defend() + 1);
    }

}

