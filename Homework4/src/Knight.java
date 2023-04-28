public class Knight extends Warrior<Knife, Round> {
    public Knight(String name, int hp, Knife weapon, Round shield) {
        super(name, hp, weapon, shield);
    }

    @Override
    public String toString() {
        return "Knight{" + super.toString() + "}";
    }
}
