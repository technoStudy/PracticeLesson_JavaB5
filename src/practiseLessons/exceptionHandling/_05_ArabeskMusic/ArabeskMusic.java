package Gun_17._05_ArabeskMusic;

import Gun_17._00_Playing.IMusic;
import Gun_17._00_Playing.MusicDriving;

import java.util.ArrayList;
import java.util.List;

public class ArabeskMusic extends MusicDriving implements IMusic {
    @Override
    public void Cal()  {

        List<String> dosyaYollari = new ArrayList<>();

        dosyaYollari.add("C:\\Users\\muhammed.mavus1\\IdeaProjects\\Practices_Lesson_B5\\src\\Gun_17\\_05_ArabeskMusic\\1 Bir Avuç Gözyaşı.wav");
        dosyaYollari.add("C:\\Users\\muhammed.mavus1\\IdeaProjects\\Practices_Lesson_B5\\src\\Gun_17\\_05_ArabeskMusic\\2 Sevda Yelleri.wav");

        rastgeleMusicCal(dosyaYollari);



    }
}
