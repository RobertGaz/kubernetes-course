package my.model;

public class SongMetadata {
    private String title;
    private String artist;
    private String album;
    private String duration;
    private String genre;
    private int resourceId;

    public SongMetadata(String title, String artist, String album, String duration, String genre, int resourceId) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.genre = genre;
        this.resourceId = resourceId;
    }

    public SongMetadata() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "SongMetadata{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", duration='" + duration + '\'' +
                ", genre='" + genre + '\'' +
                ", resourceId=" + resourceId +
                '}';
    }
}
