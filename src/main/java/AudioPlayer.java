public class AudioPlayer implements MusicPlayer {
    MusicPlayer player;
    @Override
    public void playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Play music file: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {

            player = new player(audioType);
            player.play(audioType, fileName);
        }
        else {
            System.out.println("Audio does not support: " + audioType + "Invalid file");
        }
    }
}
