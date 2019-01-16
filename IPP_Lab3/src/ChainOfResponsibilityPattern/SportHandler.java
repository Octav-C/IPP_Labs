package ChainOfResponsibilityPattern;

public class SportHandler extends NewsHandler {
    @Override
    public void Handle(Viewer receiver) {
        if(receiver.isSportNews()) {
            System.out.println("News about sport!");
        } else {
            Succesor.Handle(receiver);
        }
    }
}
