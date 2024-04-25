package interface_._05_ArabeskMusic;

import interface_._00_Playing.IMusic;
import interface_._00_Playing.MusicDriving;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArabeskMusic extends MusicDriving implements IMusic {
    @Override
    public void Cal() throws UnsupportedAudioFileException, LineUnavailableException, IOException {

        List<String> dosyaYollari = new ArrayList<>();

        dosyaYollari.add("C:\\Users\\muhammed.mavus1\\IdeaProjects\\Practices_Lesson_B5\\src\\Gun_16\\_05_ArabeskMusic\\1 Bir Avuç Gözyaşı.wav");
        dosyaYollari.add("C:\\Users\\muhammed.mavus1\\IdeaProjects\\Practices_Lesson_B5\\src\\Gun_16\\_05_ArabeskMusic\\2 Sevda Yelleri.wav");

        rastgeleMusicCal(dosyaYollari);



    }
}
