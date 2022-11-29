import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestMediaPlayer {

    @Test
    public void test_playMusic(){
        MediaAdapter maMp4 = new MediaAdapter("mp4");
        String fileType = "mp4";
        String filename = "file1.mp2";

        String output = maMp4.playMusic(fileType, filename);
        Assert.assertEquals("Playing mp4 file: "+ filename , output);
    }
    @Test
    public void test_playVlc(){
        MediaAdapter maVlc = new MediaAdapter("vlc");
        String fileType = "vlc";
        String filename = "file1.mp2";

        String output = maVlc.playMusic(fileType, filename);
        Assert.assertEquals("Playing vlc file: "+ filename , output);
    }

    @Test
    public void test_playMp4(){
        MediaAdapter maMp4 = new MediaAdapter("mp4");
        String fileType = "vlc";
        String filename = "file1.mp2";

        String output = maMp4.playMusic(fileType, filename);
        Assert.assertEquals("Playing mp4 file: "+ filename , output);
    }
}
