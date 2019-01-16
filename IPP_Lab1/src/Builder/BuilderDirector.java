package Builder;

public class BuilderDirector {

    public void Build(PhoneBuilder PhoneBuilder) {
        PhoneBuilder.BuildCamera();
        PhoneBuilder.BuildScreen();
        PhoneBuilder.BuildTouchID();
    }
}
