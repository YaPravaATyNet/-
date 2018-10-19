import java.util.ArrayList;

public class Genre {
    private String name;
    private Genre parent = null;

    public Genre(String name) {
        this.name = name;
    }

    public Genre(String name, Genre parent) {
        this.name = name;
        this.parent = parent;
    }

    public ArrayList<String> getGenres() {
        ArrayList<String> genres = new ArrayList<>();
        Genre genre = this;
        while (genre != null) {
            genres.add(genre.name);
            genre = genre.parent;
        }
        return genres;
    }

    public String getName() {
        return name;
    }
}
