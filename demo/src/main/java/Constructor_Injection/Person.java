package Constructor_Injection;

public class Person {
    private String name;
    private int PersonId;
    public Person(String name, int personId) {
        this.name = name;
        this.PersonId = personId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", PersonId=" + PersonId +
                '}';
    }
}
