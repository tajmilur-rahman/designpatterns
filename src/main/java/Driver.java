public class Driver {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();

        ap.playMusic("mp3", "unstoppable.mp3");
        ap.playMusic("mp4", "cradles.mp4");
        ap.playMusic("vlc", "the box.vlc");
    }
}

