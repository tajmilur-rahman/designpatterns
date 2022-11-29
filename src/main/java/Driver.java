public class Driver {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.playMusic("mp3", "djbravomp3");
        audioPlayer.playMusic("mp4", "champion.mp4");
        audioPlayer.playMusic("vlc", "sunflower.vlc");
        audioPlayer.playMusic("xyz", "pasori.avi");
    }
}
