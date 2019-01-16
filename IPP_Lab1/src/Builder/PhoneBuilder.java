package Builder;

public abstract class PhoneBuilder {

    protected Pixel _pixel;
    public Pixel Pixel;

    public abstract void BuildScreen();
    public abstract void BuildCamera();
    public abstract void BuildTouchID();
}
