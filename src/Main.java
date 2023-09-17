public class Main {
    public static void main(String[] args) {

    }
}

class AnotherOne {
    String name;

    public String getName() {
        return name;
    }

    public AnotherOne(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnotherOne" +
                "name='" + name + '\'' +
                '}';
    }
}
