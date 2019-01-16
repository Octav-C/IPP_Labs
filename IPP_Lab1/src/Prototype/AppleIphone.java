package Prototype;

public class AppleIphone implements Cloneable{

    public String Name;

    public Object clone() {

        Object Copy = null;

        try {
            Copy = super.clone() ;
        } catch (CloneNotSupportedException e) {
            System.out.println("Error");
        }
        return Copy;
    }
}
