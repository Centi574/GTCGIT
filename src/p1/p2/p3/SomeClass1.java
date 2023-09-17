package p1.p2.p3;

public class SomeClass1 {
    int id;
    String name;

    public SomeClass1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SomeClass1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
