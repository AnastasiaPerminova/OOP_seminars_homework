
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Person> implements Iterable<T>{
    List<T> persons = new ArrayList<>();


    @Override
    public Iterator<T> iterator() {
        return persons.iterator();
    }

    public Team<T> addPersons(T person){
        persons.add(person);
        return this;
    }

    @Override
    public String toString() {
        return "Team{" +
                "persons=" + persons +
                '}';
    }
    public int maxRange(){
        int max = 0;
        for(T person:this) {
            if (person instanceof Archer) {
                Archer archer = (Archer) person;
                if (archer.getRange() > max) {
                    max = archer.getRange();
                }
            }
        }
        return max;
    }

    public int minDefence(){
        int min = 10000000;
        for(T person: this){
            if(person instanceof Warrior<?,?>){
                Warrior warrior = (Warrior) person;
                if (warrior.getRangeDefence() < min){
                    min = warrior.getRangeDefence();
                }
            }
        }
        return min;
    }

}
