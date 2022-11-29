public class Driver {
    public static void main(String[] args) {
         AudioPlayer player = new AudioPlayer();

      player.playMusic("mp3", "ring.mp3");
      player.playMusic("mp4", "wait.mp4");
      player.playMusic("vlc", "movie.vlc");
      player.playMusic("wap", "mee.wap");
    }
}
