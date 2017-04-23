package org.app.subh.org.app.subh.pattern.adapter;

/**
 * Created by subh on 16/04/17.
 */
public class VlcPlayer implements  AdvanceMediaPlayer{
    public void playVlc(String file) {
        System.out.println("plaing vlc");
    }

    public void playMp4(String file) {
        System.out.println("playing mp4");
    }
}
