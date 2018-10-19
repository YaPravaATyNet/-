public class Query {
    private Type type = null;
    private String name = null;
    private String artist = null;
    private String genre = null;
    private int lenght = 0;

    public Query setType(Type type) {
        this.type = type;
        return this;
    }

    public Query setName(String name) {
        this.name = name;
        return this;
    }

    public Query setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public Query setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public Query setLenght(int lenght) {
        this.lenght = lenght;
        return this;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getLength() {
        return lenght;
    }
}

enum Type {
    ALBUM,
    COLLECTION,
    SONG
}
