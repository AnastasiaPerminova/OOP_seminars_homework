public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();
        archers.addPersons(new Archer("Robin", 100, new Bow(20), new Kite()))
                .addPersons(new Archer("Bobin", 100, new Bow(15), new Kite()));
        knights.addPersons(new Knight("John", 150, new Knife(), new Round()))
                .addPersons(new Knight("Adam", 150, new Knife(), new Round()));
        Archer archer1 = new Archer("Robin", 100, new Bow(20), new Kite());
        Archer archer2 = new Archer("Bobin", 100, new Bow(15), new Kite());

        Battle fight = new Battle(archer1, archer2);
        fight.run();

        System.out.println();
        System.out.println("Минимальный щит команды" +knights.minDefence());


    }
}
