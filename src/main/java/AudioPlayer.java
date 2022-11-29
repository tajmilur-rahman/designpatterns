public class AudioPlayer implements MusicPlayer {
    private MediaAdapter mediaAdapter;
    @Override
    public void playMusic(String audioType, String fileName) {
    
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        }
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.playMusic(audioType, fileName);
        } else {
            System.out.println("The given format: " + audioType + " is not supported");
        }
    }
}
