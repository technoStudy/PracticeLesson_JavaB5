package Gun_17._00_Playing;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class MusicDriving {


    public static void driver(String dosyaYolu) {

        try {

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(dosyaYolu).getAbsoluteFile());

            Clip clip = AudioSystem.getClip();

            clip.open(audioInputStream);

            clip.start();

            while (!clip.isRunning()) {

                Thread.sleep(10);

            }

            while (clip.isRunning()) {

                Thread.sleep(10);
            }

            clip.close();
            audioInputStream.close();
        }
        catch (Exception e){
            System.out.println("Dosya yolu hatalı.");

        }
    }

    public static void rastgeleMusicCal(List<String> dosyaYollari){

        Random random = new Random();

        String rastgeleDosyaYolu = dosyaYollari.get(random.nextInt(dosyaYollari.size()));

        driver(rastgeleDosyaYolu);
    }
}
