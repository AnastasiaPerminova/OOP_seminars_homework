public class findRelation {
    Member member1;
    Member member2;
    GenealogyTree geoTree1;
    GenealogyTree geoTree2;

    public findRelation(Member member1, Member member2) {
        this.member1 = member1;
        this.member2 = member2;
        geoTree1 = new GenealogyTree(member1);
        geoTree2 = new GenealogyTree(member2);
    }

    public void find(){
        geoTree1.createGenealogyTree();
        geoTree2.createGenealogyTree();
        if(member2.equals(geoTree1.mother)){System.out.println("Для "+ member1.getName()+ " " + member2.getName() + " " + member2.getSurname() +  " - мать");}
        else if(member2.equals(geoTree1.father)){System.out.println("Для "+ member1.getName()+ " " + member2.getName() + " " + member2.getSurname() + " - отец");}
        else if(member2.equals(geoTree1.spouse)){System.out.println("Для "+ member1.getName()+ " " + member2.getName() + " " + member2.getSurname() + " - cупруг");}
        else if(member2.equals(geoTree1.mothers_mother)){System.out.println("Для "+ member1.getName()+ " " + member2.getName() + " " + member2.getSurname() + " - бабушка по материнской линии");}
        else if(member2.equals(geoTree1.mothers_father)){System.out.println("Для "+ member1.getName()+ " " + member2.getName() + " " + member2.getSurname() +  " - дедушка по материнской линии");}
        else if(member2.equals(geoTree1.fathers_mother)){System.out.println("Для "+ member1.getName()+ " " + member2.getName() + " " + member2.getSurname() + " - бабушка по отцовской линии");}
        else if(member2.equals(geoTree1.fathers_father)){System.out.println("Для "+ member1.getName()+ " " + member2.getName() + " " + member2.getSurname() + " - дедушка по отцовской линии");}
        else if(geoTree1.children.contains(member2)){System.out.println("Для "+ member1.getName()+ " " + member2.getName() + " " + member2.getSurname() + " - ребенок");}
        else if(geoTree1.sisters.contains(member2)){System.out.println("Для "+ member1.getName()+ " " + member2.getName() + " " + member2.getSurname() + " - сестра");}
        else if(geoTree1.brothers.contains(member2)){System.out.println("Для "+ member1.getName()+ " " + member2.getName() + " " + member2.getSurname() + " - брат");}
        else if(geoTree1.ex_spouses.contains(member2)){System.out.println("Для "+ member1.getName()+ " " + member2.getName() + " " + member2.getSurname() + " - бывший супруг(а)");}
        else {System.out.println("Для "+ member1.getName()+ " " + member2.getName() + " " + member2.getSurname() +  " не является родственником");}

        if(member1.equals(geoTree2.mother)){System.out.println("Для "+ member2.getName()+ " " + member1.getName() + " " + member1.getSurname() +  " - мать");}
        else if(member1.equals(geoTree2.father)){System.out.println("Для "+ member2.getName()+ " " + member1.getName() + " " + member1.getSurname() + " - отец");}
        else if(member1.equals(geoTree2.spouse)){System.out.println("Для "+ member2.getName()+ " " + member1.getName() + " " + member1.getSurname() + " - cупруг");}
        else if(member1.equals(geoTree2.mothers_mother)){System.out.println("Для "+ member2.getName()+ " " + member1.getName() + " " + member1.getSurname() + " - бабушка по материнской линии");}
        else if(member1.equals(geoTree2.mothers_father)){System.out.println("Для "+ member2.getName()+ " " + member1.getName() + " " + member1.getSurname() +  " - дедушка по материнской линии");}
        else if(member1.equals(geoTree2.fathers_mother)){System.out.println("Для "+ member2.getName()+ " " + member1.getName() + " " + member1.getSurname() + " - бабушка по отцовской линии");}
        else if(member1.equals( geoTree2.fathers_father)){System.out.println("Для "+ member2.getName()+ " " + member1.getName() + " " + member1.getSurname() + " - дедушка по отцовской линии");}
        else if(geoTree2.children.contains(member1)){System.out.println("Для "+ member2.getName()+ " " + member1.getName() + " " + member1.getSurname() + " - ребенок");}
        else if(geoTree2.sisters.contains(member1)){System.out.println("Для "+ member2.getName()+ " " + member1.getName() + " " + member1.getSurname() + " - сестра");}
        else if(geoTree2.brothers.contains(member1)){System.out.println("Для "+ member2.getName()+ " " + member1.getName() + " " + member1.getSurname() + " - брат");}
        else if(geoTree2.ex_spouses.contains(member1)){System.out.println("Для "+ member2.getName()+ " " + member1.getName() + " " + member1.getSurname() + " - бывший супруг(а)");}
        else {System.out.println("Для "+ member2.getName()+ " " + member1.getName() + " " + member1.getSurname() +  " не является родственником");}

    }
}
