package AbstractFactory;

public class Apple implements Producer {

    iPhone _iphone;
    iPhonePlus _iphonePlus;

    @Override
    public void produceThePhone() {
        _iphone =  new iPhone();
        _iphonePlus =  new iPhonePlus();
    }
}
