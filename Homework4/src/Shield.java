public class Shield implements Armour {

    @Override
    public String toString() {
        return "Shield{" +
               " protect= " + defend() +
                '}';
    }

    @Override
    public int defend() {
        return 0;
    }
}
