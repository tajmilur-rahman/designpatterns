public class AudioPlayer implements MusicPlayer {
    MusicPlayer player;
    @Override
    public void playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Play music file: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {

            Adapterassignment aa= new Adapterassignment(audioType);
            aa.playMusic(audioType, fileName);
        }
        else {
            System.out.println("Audio does not support: " + audioType + "Invalid file");
        }
    }
}
