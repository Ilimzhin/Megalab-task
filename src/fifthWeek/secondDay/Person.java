package fifthWeek.secondDay;

public abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayHello() {
        System.out.println();
    }
    public abstract void goTO(String destination);

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }
}
