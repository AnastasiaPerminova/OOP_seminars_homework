public class Task1 {

        public static void main(String[] args) {

            Person person1 = new Person("Анастасия", "Анатольевна", "Виноградова", 35, Gender.женский);
            Person person2= new Person("Анатолий", "Сергеевич", "Вершинин", 57, Gender.мужской);
            Person person3 = new Person("Елена","Николаевна", "Вершинина", 56, Gender.женский);
            Person person4 = new Person("Иван", "Анатольевич","Вершинин", 18, Gender.мужской);
            Person person5 =  new Person("Иван", "Петрович","Виноградов", 16, Gender.мужской);
            Person person6 = new Person("Анна", "Петровна","Виноградова", 10, Gender.женский);
            Person person7 = new Person("Петр", "Иванович","Виноградов", 40, Gender.мужской);
            Person person8 = new Person("Александр", "Викторович","Уколов", 35, Gender.мужской);

            person1.add_Children(person5);
            person1.printChildren();

            person1.add_Children(person6);
            person1.printChildren();

            person1.add_Parents(person2);
            person1.add_Parents(person3);

           person2.printChildren();
            System.out.println("Родители "+ person6.getName() + " " + person6.getSurname() + ":"+ person6.getParents());
            System.out.println("Cестры "+ person5.getName() + " " + person5.getSurname() +":" + person5.getSisters());
            System.out.println("Братья " + person6.getName() + " " + person6.getSurname() + ":" +person6.getBrothers());

            person3.add_Children(person4);
            System.out.println("Братья " + person1.getName() + " " + person1.getSurname() + ":" + person1.getBrothers());
            person3.printChildren();
            System.out.println("Бабушки и дедушки " + person6.getName() + " " + person6.getSurname()  + ":" + person6.getGrandParents());

            person1.getMarried(person8);
            person1.getDivorced(person8);
            person1.getMarried(person7);
            System.out.println("Супруг "  + person1.getName() + " " + person1.getSurname() +  ":" + person1.getSpouse());
            System.out.println("Бывшие супруги " + person1.getName() + " " + person1.getSurname() +  ":" + person1.getEx_spouses());

        }
    }

