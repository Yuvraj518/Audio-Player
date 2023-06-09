import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Album {
    private String title;
    private String artist;
    private List<Song> songs;

    public Album(String title, String artist, List<Song> songs) {
        this.title = title;
        this.artist = artist;
        this.songs = songs;
    }

    public Album(String title,String artist) {
        this.title = title;
        this.artist=artist;
        this.songs=new ArrayList<>();
    }
//    public boolean findSong(Song songToSearch){
//        for(Song song: songs){
//            if(song.getTitle().equals(songToSearch.getTitle())) &&
//            song.getArtist().equals(songToSearch.getArtist()))
//            {return true;}
//        }
//        return false;
//    }
    public Optional<Song> findSong(String title,String artist){
        for(Song song: songs){
            if(title.equals(song.getTitle()) && artist.equals(song.getArtist())){
                return Optional.of(song);
            }
        }
        return Optional.empty();
    }
    public Optional<Song> findSong(String title){
        for(Song song: songs){
            if(title.equals(song.getTitle())){
                return Optional.of(song);
            }
        }
        return Optional.empty();
    }
    public String addSong(Song song){
        Optional<Song> optionalsong=findSong(song.getTitle());
        if(optionalsong.isPresent()){
            return "Song already Exist in Album";
        }
        songs.add(song);
        return "Songs added sucessfully";
    }
}
