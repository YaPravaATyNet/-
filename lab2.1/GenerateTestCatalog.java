public class GenerateTestCatalog {
    public static Catalog generate(){
        Catalog catalog = new Catalog();

        Genre rock = new Genre("rock");
        Genre hardrock = new Genre("hardrock", rock);
        Genre alternative = new Genre("alternative", rock);
        Genre pop = new Genre("pop");
        Genre jazz = new Genre("jazz");
        Genre swing = new Genre("swing", jazz);
        Genre jazzRock = new Genre("jazz-rock", swing);

        Album help = new Album("Help!", "The Beatles", rock);
        Song yesterday = new Song("Yesterday", "The Beatles", rock, 300);
        Song tellMeWhatYouSee = new Song("TellMeWhatYouSee", "The Beatles", rock, 243);
        help.addSong(yesterday);
        help.addSong(tellMeWhatYouSee);
        catalog.addAlbum(help);

        Album machineHead = new Album("Machine head", "Deep purple", hardrock);
        Song higwayStar = new Song("Higway Star", "Deep purple", hardrock, 354);
        Song smokeOnTheWater = new Song("Smoke on the water", "Deep purple", hardrock, 401);
        machineHead.addSong(higwayStar);
        machineHead.addSong(smokeOnTheWater);
        catalog.addAlbum(machineHead);

        Album neverMind = new Album("Never mind", "Nirvana", alternative);
        Song smeelsLikeTeenSpirit = new Song("Smells like teen spirit", "Nirvana", alternative, 343);
        Song comeAsYouAre = new Song("Come as you are", "Nirvana", alternative,267);
        neverMind.addSong(smeelsLikeTeenSpirit);
        neverMind.addSong(comeAsYouAre);
        catalog.addAlbum(neverMind);

        Album likeAPrayer = new Album("Like a prayer", "Madonna", pop);
        Song expressYourself = new Song("Express yourself", "Madonna", pop, 276);
        Song cherish = new Song("Cherish", "Madonna", pop, 254);
        likeAPrayer.addSong(expressYourself);
        likeAPrayer.addSong(cherish);
        catalog.addAlbum(likeAPrayer);

        Album rayOfLight = new Album("Ray of light", "Madonna", pop);
        Song frozen = new Song("Frozen", "Madonna", pop, 312);
        Song rOfLight = new Song("Ray of light", "Madonna", pop, 327);
        rayOfLight.addSong(frozen);
        rayOfLight.addSong(rOfLight);
        catalog.addAlbum(rayOfLight);

        Collection someJazz = new Collection("Some Jazz");
        Song takeFive = new Song("Take five", "Dave Brubeck", jazz, 465);
        Song cantoloupIsland = new Song ("Cantoloup Island", "Herbie Hancock", jazzRock, 368);
        someJazz.addSongs(takeFive);
        someJazz.addSongs(cantoloupIsland);
        catalog.addCollection(someJazz);

        Collection random = new Collection("Random");
        Song howYouRemindMe = new Song("How you remind me", "nickelback", rock, 342);
        Song kingPorterStomp = new Song("King Porter Stomp", "Jelly Roll Morton", swing, 354);
        random.addSongs(howYouRemindMe);
        random.addSongs(kingPorterStomp);
        catalog.addCollection(random);

        return catalog;
    }
}
