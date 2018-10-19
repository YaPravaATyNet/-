import java.util.ArrayList;

public class Collection implements Searchable {
    private String name;
    private ArrayList<Searchable> songs = new ArrayList<>();

    public Collection(String name) {
        this.name = name;
    }

    public void addSongs(Song song) {
        songs.add(song);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Searchable> getSongs() {
        return songs;
    }

    public int getLength() {
        int lenghtOfCollection = 0;
        for (Searchable song : songs) {
            lenghtOfCollection += song.getLength();
        }
        return lenghtOfCollection;
    }

    public ArrayList<String> getGenres() {
        ArrayList<String> genres = new ArrayList<>();
        return genres;
    }

    public String getArtist() {
        return null;
    }

    public String toString() {
        StringBuilder string = new StringBuilder("Collection\n" +
                "name: " + name + '\n' +
                "songs:\n");
        for (Searchable song : songs) {
            string.append(song.getName() + '\n');
        }
        return string.toString();
    }
}
