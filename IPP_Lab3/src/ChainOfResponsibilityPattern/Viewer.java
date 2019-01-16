package ChainOfResponsibilityPattern;

public class Viewer {
    private boolean music;
    private boolean sport;
    private boolean film;

    public Viewer(boolean music, boolean sport, boolean film) {
        this.music = music;
        this.sport = sport;
        this.film = film;
    }

    public boolean isMusicNews() {
        return music;
    }

    public boolean isSportNews() {
        return sport;
    }

    public boolean isFilmNews() {
        return film;
    }
}
