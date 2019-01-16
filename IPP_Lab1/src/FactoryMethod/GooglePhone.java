package FactoryMethod;

public class GooglePhone {

    public IPixel BuildPixelPhone(String tip) {

        IPixel Pixel;

        if (tip == "Pixel"){
            Pixel = new Pixel();
        }
        else{
            Pixel = new PixelXL();
        }
       return Pixel;
    }
}
