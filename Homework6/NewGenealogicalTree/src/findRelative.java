public class findRelative {
    Member member;
    GenealogyTree genealogyTree;

    public findRelative(Member member) {
        this.member = member;
        genealogyTree = new GenealogyTree(member);
        genealogyTree.createGenealogyTree();
    }

    public void find(Relatives relative)
    {
        if (relative == Relatives.мать){System.out.println("Для "+ member.getName()+ " " + " мать - " + genealogyTree.mother);}
        else if (relative == Relatives.отец){System.out.println("Для "+ member.getName()+ " " + " отец - " + genealogyTree.father);}
        else if(relative == Relatives.супруг)System.out.println("Для " + member.getName() +"супруг(а)-" + genealogyTree.spouse);
        else if (relative == Relatives.бабушка_по_матери){System.out.println("Для "+ member.getName()+ " " + " бабушка по матери " + genealogyTree.mothers_mother);}
        else if (relative == Relatives.бабушка_по_отцу){System.out.println("Для "+ member.getName()+ " " + " бабушка по отцу " + genealogyTree.fathers_mother);}
        else if (relative == Relatives.дедушка_по_матери){System.out.println("Для "+ member.getName()+ " " + " дедушка по матери " + genealogyTree.mothers_father);}
        else if (relative == Relatives.ребенок){ for(Member child : genealogyTree.children){
            System.out.println("Для "+ member.getName() + " " + "ребенок"  + " " + child);}
        }
        else if (relative == Relatives.брат){for(Member brother : genealogyTree.brothers){
            System.out.println("Для "+ member.getName() +  " " + "брат - " + brother);}
        }
        else if (relative == Relatives.сестра){for(Member sister : genealogyTree.sisters){
            System.out.println("Для "+ member.getName() +  " " + "cестра - " + sister);}
        }
        else if (relative == Relatives.бывший_супруг_а){for(Member ex_spouse : genealogyTree.ex_spouses){
            System.out.println("Для "+ member.getName() +  " " + "бывший супруг(а) " + ex_spouse);}
        }


    }
}
