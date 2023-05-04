public class Mother extends Relative{

    public static final String name = "Мать ";


    @Override
    public Member get(Member member) {
        for (Member person : member.getParents()) {
            if (person.getGender() == Gender.женский) {
                return person;
            }
        }
        return new Member(Gender.женский);
    }

    @Override
    public void show(Member member) {
        Mother mother = new Mother();
        System.out.println(name+ " " + member.getName() + " " + member.getSurname() + " " + mother.get(member));
    }
}
