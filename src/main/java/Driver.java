package com.company;

public class Driver {
    public static void main(String[] args) {
        AudioPlayer in = new AudioPlayer();
        in.playMusic("vlc", "inthandam.vlc");
        in.playMusic("wma", "aaseethadevaina.wma");

        in.playMusic("mp3", "priyathama.mp3");
        in.playMusic("mp4", "nannakuprematho.mp4");


    }
}
