public class Main {
    public static void main(String[] args) {
        Printable[] printables = {className("Dog"), className("Cat"), className("Parrot")};
        for (Printable printable : printables) {
            if (printable != null) {
                printable.print();
            }
        }
    }

    private static Printable className(String className) {
        switch (className) {
            case "Dog":
                Dog dog = new Dog("Rex", 33, "brown", "gav", 8);
                return dog;

            case "Cat":
                Cat cat = new Cat("Mia", 11, "white", "kisa", "Bishkek");
                return cat;

            case "Parrot":
                Parrot parrot = new Parrot("Kesha", 15, "blue", "talk", 7, 14);
                return parrot;
        }
        return null;
    }
}

