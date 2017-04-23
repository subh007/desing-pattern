package org.app.subh.org.app.subh.pattern.adapter;

/**
 * Created by subh on 16/04/17.
 */
public class MediaAdapter implements MediaPlayer {

    public void play(String file) {
        if (file.equalsIgnoreCase("audio")) {
            new AudioMediaPlayer().play(file);
        } else if(file.equalsIgnoreCase("mp4")){
           new VlcPlayer().playMp4(file);
        } else if (file.equalsIgnoreCase("vlc")) {
            new VlcPlayer().playVlc(file);
        }
    }
}
