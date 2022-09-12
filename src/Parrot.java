public class Parrot extends Animal implements Printable{
    private String ability;
    private int height;



    private int weight;

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public Parrot(String name, int age, String color, String ability, int height, int weight) {
        super(name, age, color);
        this.ability = ability;
        this.height = height;
        this.weight = weight;
    }

    public String getAbility() {
        return ability;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void print() {
        System.out.println(ability + height);
    }
}
