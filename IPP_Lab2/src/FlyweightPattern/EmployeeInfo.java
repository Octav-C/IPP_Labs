package FlyweightPattern;

import java.util.Random;

public class EmployeeInfo {
    private static final String[] names = {"Petru", "Andrei", "Alexandru", "Ghenadie"};

    public static String getRandomName() {
        int randomName = new Random().nextInt(names.length);
        return names[randomName];
    }

    public static int getRandomAge() {
        return (int)(Math.random()*80);
    }
}
