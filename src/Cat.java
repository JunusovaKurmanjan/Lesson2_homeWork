public class Cat extends Animal implements Printable {
    private String nickname;
    private String location;

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Cat(String name, int age, String color, String nickname, String location) {
        super(name, age, color);
        this.nickname = nickname;
        this.location = location;
    }

    public String getNickname() {
        return nickname;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public void print() {
        System.out.println(nickname + location);
    }
}

