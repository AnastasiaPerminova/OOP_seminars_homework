public class Program {

    public static void main(String[] args) {

        Person person0 = new Person("Анастасия", "Анатольевна", "Виноградова", 35, Gender.женский);
        FamilyMember member1 = person0.toFamilyMember();
        FamilyMember member2 = new FamilyMember("Анатолий", "Сергеевич", "Вершинин", 57, Gender.мужской);
        FamilyMember member3 = new FamilyMember("Елена", "Николаевна", "Вершинина", 56, Gender.женский);
        FamilyMember member4 = new FamilyMember("Иван", "Анатольевич", "Вершинин", 18, Gender.мужской);
        FamilyMember member5 = new FamilyMember("Иван", "Петрович", "Виноградов", 16, Gender.мужской);
        FamilyMember member6 = new FamilyMember("Анна", "Петровна", "Виноградова", 10, Gender.женский);
        FamilyMember member7 = new FamilyMember("Петр", "Иванович", "Виноградов", 40, Gender.мужской);
        FamilyMember member8 = new FamilyMember("Александр", "Викторович", "Уколов", 35, Gender.мужской);


        member1.add_Children(member5);
        member1.printChildren();
        System.out.println("------------------------------------------------------------------");

        member1.add_Children(member6);
        member1.printChildren();
        System.out.println("------------------------------------------------------------------");

        member1.add_Parents(member2);
        member1.add_Parents(member3);

        member2.printChildren();
        System.out.println("------------------------------------------------------------------");

        System.out.println("Родители " + member6.getName() + " " + member6.getSurname() + ":" + member6.getParents());
        System.out.println("------------------------------------------------------------------");

        System.out.println("Cестры " + member5.getName() + " " + member5.getSurname() + ":" + member5.getSisters());
        System.out.println("------------------------------------------------------------------");

        System.out.println("Братья " + member6.getName() + " " + member6.getSurname() + ":" + member6.getBrothers());
        System.out.println("------------------------------------------------------------------");


        member3.add_Children(member4);
        System.out.println("Братья " + member1.getName() + " " + member1.getSurname() + ":" + member1.getBrothers());
        System.out.println("------------------------------------------------------------------");

        member3.printChildren();
        System.out.println("------------------------------------------------------------------");

        System.out.println("Бабушки и дедушки " + member6.getName() + " " + member6.getSurname() + ":" + member6.getGrandParents());
        System.out.println("------------------------------------------------------------------");

        member1.getMarried(member8);
        member1.getDivorced(member8);
        member1.getMarried(member7);
        System.out.println("Супруг " + member1.getName() + " " + member1.getSurname() + ":" + member1.getSpouse());
        System.out.println("------------------------------------------------------------------");

        System.out.println("Бывшие супруги " + member1.getName() + " " + member1.getSurname() + ":" + member1.getEx_spouses());
        System.out.println("------------------------------------------------------------------");


        FamilyMember member9 = new FamilyMember("Александр", "Иванович", "Кукушкин", 5, Gender.мужской);
        member9.add_Parents(member1);
        member9.add_Parents(member8);

        member6.printCreatedGenealogicalTree();
        System.out.println("------------------------------------------------------------------");

        member1.printCreatedGenealogicalTree();
        System.out.println("------------------------------------------------------------------");

        member6.findRelation(member1);
        System.out.println("------------------------------------------------------------------");

        member3.findRelation(member2);
        System.out.println("------------------------------------------------------------------");

        member3.getMarried(member2);
        member3.findRelation(member2);
        System.out.println("------------------------------------------------------------------");
        member2.findRelation(member3);
        System.out.println("------------------------------------------------------------------");
        member6.findRelative(Relatives.бабушка_по_отцу);
        System.out.println("------------------------------------------------------------------");

        member6.findRelative(Relatives.мать);
        System.out.println("------------------------------------------------------------------");

        member1.findRelative(Relatives.ребенок);
        System.out.println("------------------------------------------------------------------");

        member1.findRelative(Relatives.брат);
        System.out.println("------------------------------------------------------------------");

        member8.findRelation(member9);



    }
}

