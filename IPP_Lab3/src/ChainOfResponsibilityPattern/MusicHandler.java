package ChainOfResponsibilityPattern;

public class MusicHandler extends NewsHandler {
    @Override
    public void Handle(Viewer receiver) {
        if(receiver.isMusicNews()) {
            System.out.println("News about music!");
        } else {
            Succesor.Handle(receiver);
        }
    }
}
