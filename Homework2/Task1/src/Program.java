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

        member1.add_Children(member6);
        member1.printChildren();

        member1.add_Parents(member2);
        member1.add_Parents(member3);

        member2.printChildren();
        System.out.println("Родители " + member6.getName() + " " + member6.getSurname() + ":" + member6.getParents());
        System.out.println("Cестры " + member5.getName() + " " + member5.getSurname() + ":" + member5.getSisters());
        System.out.println("Братья " + member6.getName() + " " + member6.getSurname() + ":" + member6.getBrothers());

        member3.add_Children(member4);
        System.out.println("Братья " + member1.getName() + " " + member1.getSurname() + ":" + member1.getBrothers());
        member3.printChildren();
        System.out.println("Бабушки и дедушки " + member6.getName() + " " + member6.getSurname() + ":" + member6.getGrandParents());

        member1.getMarried(member8);
        member1.getDivorced(member8);
        member1.getMarried(member7);
        System.out.println("Супруг " + member1.getName() + " " + member1.getSurname() + ":" + member1.getSpouse());
        System.out.println("Бывшие супруги " + member1.getName() + " " + member1.getSurname() + ":" + member1.getEx_spouses());

        FamilyMember member9 = new FamilyMember("Александр", "Иванович", "Кукушкин", 5, Gender.мужской);
        member9.setMother(member1);
        member9.add_Parents(member8);

        member6.createGenealogicalTree();
        member1.createGenealogicalTree();
    }
}

