public class Task2 {
    public static void main(String[] args) {
        Closet closet1 = new Closet(Purpose.chemicals);
        System.out.println(closet1);//Назначение шкафа: chemicals, размер шкафа: , занято: , cвободное место:
        Object object1 = new Object("стиральный порошок",Purpose.chemicals);
        Object object2 = new Object("анальгин", Purpose.drugs);
        Object object3 = new Object("кастрюля", Purpose.utensils);

        closet1.takeObject(object1);//Откройте дверцы!
        closet1.openDoors();
        closet1.takeObject(object2);//Это не тот шкаф!
        closet1.takeObject(object1);//Ура!Взяли!(или Шкаф пуст!)
        System.out.println(closet1);//Назначение шкафа: chemicals, размер шкафа: , занято: -1 , cвободное место: +1

        Closet closet2 = new Closet(Purpose.drugs);
        System.out.println(closet2);//Назначение шкафа: drugs, размер шкафа: , занято: , cвободное место:
        closet2.putObject(object3);//Это не тот шкаф!
        closet2.putObject(object2);//Откройте дверцы!
        closet2.openDoors();
        closet2.putObject(object2);//Ура! Положили!(или Шкаф полон!)
        System.out.println(closet2);//Назначение шкафа: drugs, размер шкафа: , занято: +1, cвободное место: -1

    }
}
