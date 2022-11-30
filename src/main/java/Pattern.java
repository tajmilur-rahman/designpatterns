public class Pattern implements MusicPlayer {

   AdvancedMediaPlayer musicplayer;

   @Override
   public void playMusic(String audioType, String fileName) {
   
      if(audioType.equalsIgnoreCase("vlc")){
         musicplayer.playVlcPlayer(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4")){
         musicplayer.playMp4Player(fileName);
      }
   }  
  public Pattern(String audio){
   
      if(audio.equalsIgnoreCase("vlc") ){
         musicplayer = new VlcPlayer();			
         
      }else if (audio.equalsIgnoreCase("mp4")){
         musicplayer = new Mp4Player();
      }	
   }

  
}
