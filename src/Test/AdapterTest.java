package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;



class AdapterTest {

    @org.junit.jupiter.api.Test


    @Test
    public void playMusic() {
        Adapter a = new Adapter("vlc");
        String fileName = "song3.vlc";
        String audioType="vlc";

        String str = a.playMusic(fileName, audioType);
        Assert.assertEquals("vlc running " + fileName, str);
        assertEquals("Mp4", "Mp4");
        assertEquals("vlc", "vlc");
    }
}
