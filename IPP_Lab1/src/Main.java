import Builder.BuilderDirector;
import Builder.GoogleBuilder;
import Builder.PhoneBuilder;
import FactoryMethod.GooglePhone;
import Prototype.AppleIphone;
import Singleton.GoogleSingleton;

public class Main {
    public static void main(String[] args) {
        AbstractFactory.Producer _prod = null;
        String model = "Google";

        if(model == "Apple") {
            _prod = new AbstractFactory.Apple();
        } else if(model == "Google") {
            _prod = new AbstractFactory.Google();
        }

        if(_prod != null) {
            System.out.println("--- Abstract Factory ---");
            _prod.produceThePhone();
        }

        //-----------------------------FactoryMethod----------------------------
        System.out.println("\n--- Factory Method ---");
        GooglePhone Google = new GooglePhone();
        Google.BuildPixelPhone("Pixel");

        //------------------------------Singleton--------------------------------
        System.out.println("\n--- Singleton ---");
        GoogleSingleton GoogleSingleton1 = GoogleSingleton.GetInstance();
        System.out.println("We're trying to create an instance");
        GoogleSingleton GoogleSingleton2 = GoogleSingleton.GetInstance();

        //------------------------------Prototype--------------------------------
        System.out.println("\n--- Prototype ---");
        AppleIphone AppleIphone = new AppleIphone();
        AppleIphone.Name="AppleIphone";
        AppleIphone AppleIphone2 = (Prototype.AppleIphone) AppleIphone.clone();
        System.out.println("Original: "+ AppleIphone.Name);
        System.out.println("Clone: "+ AppleIphone2.Name);

        //--------------------------------Builder---------------------------------
        System.out.println("\n--- Builder ---");
        BuilderDirector BuilderDirector = new BuilderDirector();
        PhoneBuilder PhoneBuilder;
        PhoneBuilder = new GoogleBuilder();
        BuilderDirector.Build(PhoneBuilder);
        PhoneBuilder.Pixel.ShowData();
    }
}
