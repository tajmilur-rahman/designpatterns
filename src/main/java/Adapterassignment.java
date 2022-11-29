
public class Adapterassignment implements MusicPlayer {

    AdvancedMediaPlayer music;

    public Adapterassignment(String File){

        if(File.equalsIgnoreCase("vlc") ){
            music = new VlcPlayer();

        }else if (File.equalsIgnoreCase("mp4")){
            music = new Mp4Player();
        }
    }

    @Override
    public void playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")) {
            music.playVlcPlayer(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            music.playMp4Player(fileName);
        }
    }





}
