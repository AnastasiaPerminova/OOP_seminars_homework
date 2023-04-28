public class Archer extends Warrior<Throwing, Kite>{
    public Archer(String name, int hp, Throwing weapon, Kite shield) {
        super(name, hp, weapon, shield);
    }
    public int getRange(){
       return rand.nextInt(weapon.getDistance() + 1);
    }

    @Override
    public String toString() {
        return "Archer{" +
                super.toString()+ "}";
    }
}
