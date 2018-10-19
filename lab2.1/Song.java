import java.util.ArrayList;

public class Song implements Searchable {
    private String name;
    private String artist;
    private Genre genre;
    private int length;

    public Song (String name, String artist, Genre genre, int length) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<String> getGenres() {
        return genre.getGenres();
    }

    public int getLength() {
        return length;
    }

    public String toString() {
        return "Song\n" +
                "name: " + name + '\n' +
                "artist: " + artist + '\n' +
                "genre: " + genre.getName() +
                '\n';
    }
}