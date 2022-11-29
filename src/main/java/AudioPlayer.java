package com.company;

public class AudioPlayer implements MusicPlayer {




    public void playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            System.out.println("Playing mp4 file. Name: " + fileName);
        }
       else if(audioType.equalsIgnoreCase("vlc")){
            System.out.println("Playing vlc file. Name: " + fileName);
        }



        else{
            System.out.println("Audio type not supported for the file" + fileName);
        }

    }

}
