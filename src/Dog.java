public class Dog extends Animal implements Printable{
    private String ability;
    private int birthday;

    public Dog(String name, int age, String color, String ability, int birthday) {
        super(name, age, color);
        this.ability = ability;
        this.birthday = birthday;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getAbility() {
        return ability;
    }

    public int getBirthday() {
        return birthday;
    }

    @Override
    public void print() {
        System.out.println(ability + birthday);
    }
}
