public class Driver {
    public static void main(String[] args) {
         AudioPlayer player = new AudioPlayer();

      player.playMusic("mp3", "beyond the horizon.mp3");
      player.playMusic("mp4", "alone.mp4");
      player.playMusic("vlc", "far far away.vlc");
      player.playMusic("avi", "mind me.avi");
    }
}
