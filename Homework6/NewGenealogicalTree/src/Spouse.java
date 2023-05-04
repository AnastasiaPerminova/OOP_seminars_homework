public class Spouse extends Relative{
    public static final String name = "Cупруг/Супруга ";

    public Spouse() {
    }

    @Override
    public Member get(Member member) {
        return member.getSpouse();
    }

    @Override
    public void show(Member member) {
        System.out.println(name+ " " + member.getName() + " " + member.getSurname() + " " + member.getSpouse());
    }

    public void getMarried(Member member, Member member1){
        if (member.getSpouse() == null) {
            member.setSpouse(member1);
            member1.setSpouse(member);
        } else {
            System.out.println("Внесение изменений невозможно.");
        }
    }

    public void getDivorced(Member member, Member member1) {
        if (member.getSpouse() == member1) {
            member.setSpouse(null);
            member.setEx_spouses(member1);
            member1.setSpouse(null);;
            member1.setEx_spouses(member);

        } else {
            System.out.println("Внесение изменений невозможно.");
        }
    }
}
