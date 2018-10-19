import java.util.ArrayList;

public class Album implements Searchable {
    private String name;
    private String artist;
    private Genre genre;
    private ArrayList<Searchable> songs = new ArrayList<>();

    public Album(String name, String artist, Genre genre) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
    }

    public void addSong(Song song) {
        songs.add(song);
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

    public ArrayList<Searchable> getSongs() {
        return songs;
    }

    public int getLength() {
        int lenghtOfAlbum = 0;
        for (Searchable song : songs) {
            lenghtOfAlbum += song.getLength();
        }
        return lenghtOfAlbum;
    }

    public String toString() {
        StringBuilder string = new StringBuilder("Album\n" +
                "name: " + name + '\n' +
                "artist: " + artist + '\n' +
                "genre: " + genre.getName() + '\n' +
                "songs:\n");
        for (Searchable song : songs) {
            string.append(song.getName() + '\n');
        }
        return string.toString();
    }
}
