public class Driver {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new MediaPlayer();
        audioPlayer.playMusic("mp3", "/path/to/file.mp3");

        Mp4Player mp4Player = new Mp4Player();
        mp4Player.playMp4Player("/path/to/file.mp4");

        VlcPlayer vlcPlayer = new VlcPlayer();
        vlcPlayer.playVlcPlayer("/path/to/file.vlc");
    }
}
