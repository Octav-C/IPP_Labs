package ChainOfResponsibilityPattern;

public class FilmHandler extends NewsHandler {
    @Override
    public void Handle(Viewer receiver) {
        if(receiver.isFilmNews()) {
            System.out.println("News about film!");
        } else {
            Succesor.Handle(receiver);
        }
    }
}
