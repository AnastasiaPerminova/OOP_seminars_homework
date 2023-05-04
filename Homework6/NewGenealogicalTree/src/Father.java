public class Father extends Relative{

    public static final String name = "Отец ";

    @Override
    public Member get(Member member) {
        for (Member person : member.getParents()) {
            if (person.getGender() == Gender.мужской) {
                return person;
            }
        }
        return new Member(Gender.мужской);
    }

    @Override
    public void show(Member member) {
        Father father = new Father();
        System.out.println(name+ " " + member.getName() + " " + member.getSurname() + " " + father.get(member));
    }
}
