public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Album album1=new Album("SmithAlbum","Smith");
        album1.addSong(new Song("Lal","smith",2));
        album1.addSong(new Song("Perfect","smith",3));
        album1.addSong(new Song("Miracle","smith",13));

        Album album2=new Album("LeeAlbum","Lee");
        album2.addSong(new Song("Moon","Lee",15));
        album2.addSong(new Song("SunShine","Lee",22));
        album2.addSong(new Song("Rock me","Lee",7));
        album2.addSong(new Song("Sparcle","Lee",23));

        PlayList p1=new PlayList("Deepak");
        p1.addSongfromAlbum(album1,"Mircle");
        p1.addSongfromAlbum(album1,"Sand");
        p1.addSongfromAlbum(album2,"Rock me");
        p1.addSongfromAlbum(album1,"Perfect");
        p1.addSongfromAlbum(album2,"Moon");
        p1.addSongfromAlbum(album2,"SunShine");
        p1.addSongfromAlbum(album2,"Moon");
        p1.addSongfromAlbum(album1,"Lal");

        p1.playCurrentSong();
        p1.playNextSong();
        p1.playNextSong();
        p1.playNextSong();
        //p1.playPreviousSong();
        p1.playNextSong();


    }
}