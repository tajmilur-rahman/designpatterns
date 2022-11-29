public class AudioPlayer implements MusicPlayer {
    MediaPlayer mediaPlayer;
    @Override
    public void playFile(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Play music file: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {

            mediaPlayer = new MediaPlayer(audioType);
            mediaPlayer.play(audioType, fileName);
        }
        else {
            System.out.println("Audio does not support: " + audioType + "Invalid file");
        }
    }
}
