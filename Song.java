public class Song {
    private String title;
    private String artist;
    private String album; 

public Song(String title, String album, String artist){

    this.title = title;
    this.artist = artist;
    this.album = album;

    }

    public String getTitile(){
        return title;
    }

    public void  setTitle(String title){
        this.title = title;
    }

    public String getAlbum(){
        return album;
    }

    public void  setAlbum(String album){
        this.album = album;
    }

    public String getArtist(){
        return artist;
    }

    public void  setArtist(String artist){
        this.artist = artist;
    }

    public String toString(){
        
        return 
        "Artist " + artist + "\n" + "Title " + title + "\n" + "Album " + album;


    }
}
