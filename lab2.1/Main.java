public class Main {

    public static void main(String[] args) {
        Catalog catalog = GenerateTestCatalog.generate();

        Query query1 = new Query().setType(Type.ALBUM).setGenre("pop");
        for (Searchable object : catalog.search(query1)) {
            System.out.println(object);
        }

        query1 = query1.setLenght(639);
        for (Searchable object : catalog.search(query1)) {
            System.out.println(object);
        }

        Query query2 = new Query().setType(Type.COLLECTION).setName("Random");
        for (Searchable object : catalog.search(query2)) {
            System.out.println(object);
        }

        Query query3 = new Query().setType(Type.SONG).setGenre("jazz").setArtist("Herbie Hancock");
        for (Searchable object : catalog.search(query3)) {
            System.out.println(object);
        }

        Query query4 = new Query().setGenre("rock");
        for (Searchable object : catalog.search(query4)) {
            System.out.println(object);
        }
    }
}
