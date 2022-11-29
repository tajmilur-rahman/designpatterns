package com.company;

public class VlcPlayer implements AdvancedMediaPlayer {

    public void playVlcPlayer(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }

    public void playMp4Player(String fileName) {
        //do nothing
    }
}
