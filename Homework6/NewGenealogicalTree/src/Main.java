public class Main {
    public static void main(String[] args) {
        Person person0 = new Person("Анастасия", "Анатольевна", "Виноградова", 1985, Gender.женский);
        Member member1 = person0.toMember();
        Member member2 = new Member("Анатолий", "Сергеевич", "Вершинин", 1960, Gender.мужской);
        Member member3 = new Member("Елена", "Николаевна", "Вершинина", 1961, Gender.женский);
        Member member4 = new Member("Иван", "Анатольевич", "Вершинин", 2000, Gender.мужской);
        Member member5 = new Member("Иван", "Петрович", "Виноградов", 2005, Gender.мужской);
        Member member6 = new Member("Анна", "Петровна", "Виноградова", 2012, Gender.женский);
        Member member7 = new Member("Петр", "Иванович", "Виноградов", 1982, Gender.мужской);
        Member member8 = new Member("Александр", "Викторович", "Уколов", 1985, Gender.мужской);


        member1.add_Children(member5);
        new Children().show(member1);
        System.out.println();

        member1.add_Children(member6);
        new Children().show(member1);
        System.out.println();

        member1.add_Parents(member2);
        member1.add_Parents(member3);

        new Parents().show(member1);
        System.out.println();

        System.out.println("Родители " + member6.getName() + " " + member6.getSurname() + ":" + member6.getParents());
        System.out.println();

        new Sisters().show(member5);

        new Brothers().show(member5);


        member3.add_Children(member4);
        new Brothers().show(member1);
        System.out.println();
        new Children().show(member3);
        System.out.println();

        new Grandmothers().show(member6);
        new Grandfathers().show(member6);
        System.out.println();

        Spouse s = new Spouse();
        s.getMarried(member1,member8);
        s.getDivorced(member1,member8);
        s.getMarried(member1,member7);
        s.show(member1);
        s.show(member7);
        new Ex_spouses().show(member1);
        System.out.println();



        Member member9 = new Member("Александр", "Иванович", "Кукушкин", 2018, Gender.мужской);
        member9.add_Parents(member1);
        member9.add_Parents(member8);

        new GenealogyTree(member6).printGenealogyTree();
        System.out.println();

        new GenealogyTree(member1).printGenealogyTree();
        System.out.println();

        new findRelation(member1,member6).find();
        System.out.println( );

        new findRelation(member3,member1).find();
        System.out.println("------------------------------------------------------------------");

        s.getMarried(member2, member3);
        new findRelation(member2, member3).find();
        System.out.println("------------------------------------------------------------------");

        findRelative fR_member6 = new findRelative(member6);
        fR_member6.find(Relatives.бабушка_по_отцу);
        fR_member6.find(Relatives.мать);
        System.out.println("------------------------------------------------------------------");

        findRelative fR_member1 = new findRelative(member1);
        fR_member1.find(Relatives.ребенок);
        fR_member1.find(Relatives.брат);
        System.out.println("------------------------------------------------------------------");

        new findRelation(member9, member8).find();



    }
}