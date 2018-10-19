import java.util.ArrayList;

public class Catalog {
    private ArrayList<Searchable> albums = new ArrayList<>();
    private ArrayList<Searchable> collections = new ArrayList<>();

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void addCollection(Collection collection) {
        collections.add(collection);
    }

    public ArrayList<Searchable> search(Query query) {
        ArrayList<Searchable> result = new ArrayList<>();
        if ((query.getType() == Type.ALBUM) || (query.getType() == null)) {
            result.addAll(getList(query, albums));
        }
        if ((query.getType() == Type.COLLECTION) || (query.getType() == null)) {
            result.addAll(getList(query, collections));
        }
        if ((query.getType() == Type.SONG) || (query.getType() == null)) {
            for (Searchable album : albums) {
                result.addAll(getList(query, ((Album)album).getSongs()));
            }
            for (Searchable collection : collections) {
                result.addAll(getList(query, ((Collection)collection).getSongs()));
            }
        }
        return result;
    }

    private ArrayList<Searchable> getList (Query query, ArrayList<Searchable> list){
        ArrayList<Searchable> result = new ArrayList<>();
        for (Searchable object : list) {
            if ((query.getName() == null || query.getName().equals(object.getName()))
                    && (query.getArtist() == null || query.getArtist().equals(object.getArtist()))
                    && (query.getGenre() == null || object.getGenres().contains(query.getGenre()))
                    && (query.getLength() == 0 || query.getLength() == object.getLength()))
                result.add(object);
        }
        return result;
    }
}
