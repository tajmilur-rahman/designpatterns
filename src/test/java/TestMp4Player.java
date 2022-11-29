import org.junit.Assert;
import org.junit.Test;

import org.junit.runners.JUnit4;


public class MusicplayerTest {
    @Test
    public void test_playm() {
        Musicplayer m = new musicplayer();
        String audioType = "mp3";
        String fileName = "inthandam.mp3";

        String in1="inthandam.mp3"
        Assert.assertEquals("Playing mp3 file: " + fileName, in1);
    }
}
