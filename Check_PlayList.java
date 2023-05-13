import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Check_PlayList {
    private String title;
    private List<Song> playList;
    private Iterator<Song> itr;
    boolean right;
    public Check_PlayList(String title){
        this.title=title;
        playList=new ArrayList<>();
        itr=playList.iterator();
    }
    public boolean findSongInPlayList(String title){
        for(Song song: playList){
            if(title.equals(song.getTitle())){
                return true;
            }
        }
        return false;
    }
    public String addSongFromAlbum(String title,Album album){
        boolean find=findSongInPlayList(title);
        if(find){return "Song already exist in Playlist";}
        Optional<Song> op=album.findSong(title);
        if(op.isPresent()){
            playList.add(op.get());
            return "Song added sucessfully";
        }
        return "Song not found";
    }

     public String playCurrent(){
        if(right){
            right=false;
            itr.previous;
        }
     }
     public String playNext(){
        if(!right){
            itr.next();
        }
        if(itr.hasNext()){
            return "Next playing song is"+ itr.next();
        }
        return "Reached end of Playlist";
     }
     public String playPrevious(){
        if(right){
            itr.previous();
        }
        if(itr.hasNext())
     }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
