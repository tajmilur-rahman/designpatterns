public class AudioPlayer implements MusicPlayer {
    @Override
    public void playFile(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Play music file: " + fileName);
        } else {
            System.out.println("Audio does not support: " + fileName);
        }
    }
}
