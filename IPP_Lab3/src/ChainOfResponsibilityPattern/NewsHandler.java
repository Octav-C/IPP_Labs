package ChainOfResponsibilityPattern;

public abstract class NewsHandler {

    protected NewsHandler Succesor;
    public abstract void Handle(Viewer receiver);

    public NewsHandler getSuccesor() {
        return Succesor;
    }

    public void setSuccesor(NewsHandler succesor) {
        Succesor = succesor;
    }
}
