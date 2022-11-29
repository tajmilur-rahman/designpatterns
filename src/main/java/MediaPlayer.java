
public class MediaPlayer implements MusicPlayer {
    MediaAdapter musicAdapter = new MediaAdapter("mp3");

    @Override
    public String playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            return "Playing mp3 file: " + fileName;
        } else {
            return musicAdapter.playMusic(audioType, fileName);
        }
    }
}