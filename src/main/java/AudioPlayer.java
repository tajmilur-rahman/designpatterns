public class AudioPlayer implements MusicPlayer {
    MusicPlayer player;
    @Override
    public void playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        }
        else if (audioType.equalsIgnoreCase("vlc")||audioType.equals("mp4"))
        {
          Pattern pat=new Pattern(audioType);
          pat.playMusic(audioType, fileName);
        }
        else {
            System.out.println("Audio type not supported for the file: " + fileName);
        }
    }
}
