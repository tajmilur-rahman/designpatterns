public class Adapter implements MusicPlayer {

   AdvancedMediaPlayer adapter;

   public Adapter(String audio){
   
      if(audio.equalsIgnoreCase("vlc") ){
         adapter = new VlcPlayer();			
         
      }else if (audio.equalsIgnoreCase("mp4")){
         adapter = new Mp4Player();
      }	
   }

   @Override
   public void playMusic(String audioType, String fileName) {
   
      if(audioType.equalsIgnoreCase("vlc")){
         adapter.playVlcPlayer(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4")){
         adapter.playMp4Player(fileName);
      }
   }
}
