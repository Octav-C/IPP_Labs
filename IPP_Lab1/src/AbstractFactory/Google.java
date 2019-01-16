package AbstractFactory;

public class Google implements  Producer {

    GooglePixel _pixel;
    GooglePixelXL _pixelxl;

    @Override
    public void produceThePhone() {
         _pixel= new GooglePixel();
         _pixelxl = new GooglePixelXL();
    }
}
