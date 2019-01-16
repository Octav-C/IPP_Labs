package FlyweightPattern;


import java.util.HashMap;

public class FlyweightFactory {
    private static final HashMap employees = new HashMap();

    public static Employee getEmployee(String name) {
        Flyweight employee = (Flyweight)employees.get(name);
        if(employee == null) {
            employee = new Flyweight(name);
            employees.put(name, employee);
            System.out.println("Engagement a new member: " + name);
        }
        return employee;
    }
}
