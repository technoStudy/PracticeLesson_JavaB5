package Gun_16._00_Playing;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class MusicDriving {


    public static void driver(String dosyaYolu) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(dosyaYolu).getAbsoluteFile());

        Clip clip = AudioSystem.getClip();

        clip.open(audioInputStream);

        clip.start();

        while (!clip.isRunning()) {

        }

        while (clip.isRunning()) {

        }

        clip.close();
        audioInputStream.close();
    }

    public static void rastgeleMusicCal(List<String> dosyaYollari) throws UnsupportedAudioFileException, LineUnavailableException, IOException {

        Random random = new Random();

        String rastgeleDosyaYolu = dosyaYollari.get(random.nextInt(dosyaYollari.size()));

        driver(rastgeleDosyaYolu);
    }
}
