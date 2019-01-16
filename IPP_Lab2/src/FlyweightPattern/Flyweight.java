package FlyweightPattern;

public class Flyweight implements Employee{
    private String name;
    private int age;

    public Flyweight(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void aboutEmployee() {
        System.out.println(name + " have " + age + " years old!");
    }
}
