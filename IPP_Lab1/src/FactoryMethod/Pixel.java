package FactoryMethod;

public class Pixel implements IPixel{

    public Pixel() {
        SetName();
        SetScreenSize();
    }

    @Override
    public void SetName() {
        System.out.println("Name is Pixel");
    }

    @Override
    public void SetScreenSize() {
        System.out.println("Screen 5 Inches\"");
    }
}
