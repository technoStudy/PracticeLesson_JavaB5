package Gun_16._02_RockMusic;

import Gun_16._00_Playing.IMusic;
import Gun_16._00_Playing.MusicDriving;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RockMusic extends MusicDriving implements IMusic {
    @Override
    public void Cal() throws UnsupportedAudioFileException, LineUnavailableException, IOException {

        List<String> dosyaYollari = new ArrayList<>();

        dosyaYollari.add("C:\\Users\\muhammed.mavus1\\IdeaProjects\\Practices_Lesson_B5\\src\\Gun_16\\_02_RockMusic\\1 Özgürce Yaşa.wav");
        dosyaYollari.add("C:\\Users\\muhammed.mavus1\\IdeaProjects\\Practices_Lesson_B5\\src\\Gun_16\\_02_RockMusic\\2 Senden Daha Guzel.wav");

        rastgeleMusicCal(dosyaYollari);



    }
}
