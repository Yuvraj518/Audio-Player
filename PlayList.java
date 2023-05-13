import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class PlayList {
    private String title;
    private List<Song> songList;
    private Iterator<Song> itr;
    private boolean isNext;

    public PlayList(String title) {
        this.title = title;
        this.songList=new ArrayList<>();
        itr=songList.iterator();
    }
    public boolean findSongFromPlaylist(String songTitle){
        for(Song song: songList){
            if(songTitle.equals(song.getTitle())){
                return true;
            }
        }
        return false;
    }
    public String addSongfromAlbum(Album album, String songTitle){
        if(findSongFromPlaylist(songTitle)){
            return "Song already exist in PlayList";
        }
        Optional<Song> op1=album.findSong(songTitle);
        if(!op1.isPresent()){
            return "Song not present in Album";
        }
        songList.add(op1.get());
        return "Song added sucessfully";
    }
    public String playCurrentSong(){
//        if(isNext){
//            isNext=false;
//            return "Current Playing Song is :"+itr.previous();
//        }
        isNext=true;
        return "Current Playing Song is :"+itr.next();
    }
    public String playNextSong(){
        if(isNext){}
        else{
            isNext=true;
            itr.next();
        }
        if(itr.hasNext()){
            isNext=true;
            return "Next Song has been played: "+itr.next();
        }
        return "You have reached end of PlatList";
    }
//    public String playPreviousSong(){
//        if(isNext){
//            isNext=false;
//            itr.previous();
//        }
//        else{}
//        if(itr.hasPrevious()){
//            isNext=false;
//            return "Previous Song has been Played :"+itr.previous();
//        }
//        return "You have reached start of Playlist";
//    }
}
