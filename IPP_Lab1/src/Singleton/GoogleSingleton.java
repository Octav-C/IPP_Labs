package Singleton;

public final class GoogleSingleton {

    private static GoogleSingleton instance;
    private static final Object acces = new Object();

    GoogleSingleton() {}

    public static GoogleSingleton GetInstance() {
        synchronized (acces){
            if (instance == null){
                instance = new GoogleSingleton();
                System.out.println("Google was created");
            }
            else System.out.println("Already exist a Google instance");
            return instance;
        }
    }

}
