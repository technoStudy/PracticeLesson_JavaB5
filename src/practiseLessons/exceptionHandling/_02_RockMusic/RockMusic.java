package Gun_17._02_RockMusic;

import Gun_17._00_Playing.IMusic;
import Gun_17._00_Playing.MusicDriving;

import java.util.ArrayList;
import java.util.List;

public class RockMusic extends MusicDriving implements IMusic {
    @Override
    public void Cal(){

        List<String> dosyaYollari = new ArrayList<>();

        dosyaYollari.add("C:\\Users\\muhammed.mavus1\\IdeaProjects\\Practices_Lesson_B5\\src\\Gun_17\\_02_RockMusic\\1 Özgürce Yaşa.wav");
        dosyaYollari.add("C:\\Users\\muhammed.mavus1\\IdeaProjects\\Practices_Lesson_B5\\src\\Gun_17\\_02_RockMusic\\2 Senden Daha Guzel.wav");

        rastgeleMusicCal(dosyaYollari);



    }
}
