
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    //@Override
    public boolean equals(Object compared) {
        if (compared instanceof Song) {
            return true;
        }
        if (!(compared instanceof Song)) {
            return false;

        }
        Song comparedSong = (Song) compared;

        return this.getArtist().equals(comparedSong.artist)
                && this.getName().equals(comparedSong.name)
                && this.durationInSeconds == comparedSong.durationInSeconds;
    }

//    public boolean equals(Object song, Object compared) {
////       return this.getArtist().equals(compared.artist)
////                && this.getName().equals(compared.name)
////                && this.durationInSeconds == compared.durationInSeconds;
//        if (this == compared) {
//            return true;
//        }
//
////    public boolean equals(String input){
////        if(this.equals(input)){
////        return true;
////    }
//        return false;
//    }
}
