package org.snake.client.sound;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Faris
 */
public class SFX {
    
    
    public SFX(){
        this.play();
        //ObjectAction.setMp3(this);
        musicPlaying = true;
    }
    
    /**
     * Used to handle music playback should stop or start
     */
    public static boolean musicPlaying;
    
    /**
     * Caches the musicPlayer
     */
    private Player musicPlayer; 
    
    /**
     * Uses a preset file location to play a chosen song
     */
    public void play() {
        try {
            FileInputStream fis = new FileInputStream("./Data/sounds/music.mp3");
            BufferedInputStream bis = new BufferedInputStream(fis);
            musicPlayer = new Player(bis);
        } catch (Exception e) {
            e.printStackTrace();
        }  
        new Thread() {
            public void run() {
                try { 
                    musicPlayer.play(); 
                } catch (Exception e) {
                    System.out.println(e); 
                }
            }
        }.start();
    }
    
    /**
     * Closes the connection between file and server and ends music playback
     */
    public void close() throws JavaLayerException { 
        if (musicPlayer != null){
            musicPlayer.close();
            musicPlayer = null;
            musicPlaying = false;
        }
    }

}
