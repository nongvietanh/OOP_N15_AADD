package uet.oop.bomberman.audio;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

import static javax.sound.sampled.AudioSystem.getAudioInputStream;
import static uet.oop.bomberman.BombermanGame.*;

public class Audio {

    public Audio() {

    }

    //TODO: path là địa link file nhạc, loop là số lần lặp lại
    public void audioUpdate(String path, int loop) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File(path);
        Clip clip;
        try (AudioInputStream audioInputStream = getAudioInputStream(file)) {
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        }
        clip.start();
        clip.loop(loop);

    }

}
