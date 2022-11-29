public class AudioPlayer implements MusicPlayer {
   MediaAdapter mediaAdapter; 

   @Override
   public void playm(String audioType, String fileName) {		

      //inbuilt support to play mp3 music files
      if(audioType.equalsIgnoreCase("mp3")){
         System.out.println("Playing mp3 file. Name: " + fileName);			
      } 
      
      //mediaAdapter is providing support to play other file formats
      else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
         MusicAdapter = new MusicAdapter(audioType);
         musicAdapter.play(audioType, fileName);
      }
      
      else{
         System.out.println("Audio type not supported for the file"+filename);
      }
   }   
}
