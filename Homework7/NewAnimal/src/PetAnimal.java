public abstract class PetAnimal extends Animal{
    private String name; //кличка

    private Person owner;//владелец

    public PetAnimal(String name, int age, Gender gender, String breed) {
        super(age, gender, breed);
        this.name = name;

    }




    /**
     Установка *  @param owner.
     */
    public void setOwner(Person owner){
        this.owner = owner;
    }

    /**
     *
     * @return переменную owner.
     */
    public Person getOwner(){
        return owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
