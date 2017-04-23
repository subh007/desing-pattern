package org.app.subh.org.app.subh.pattern.adapter;

import sun.audio.AudioPlayer;

/**
 * Created by subh on 16/04/17.
 */
public class AudioMediaPlayer implements MediaPlayer {
    public void play(String file) {
        if (file.equalsIgnoreCase("audio")) {
            System.out.println("audio file is playing.");
        } else {
            new MediaAdapter().play(file);
        }
    }
}
