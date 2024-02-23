package exceptionHandling._04_YabanciMusic;

import exceptionHandling._00_Playing.IMusic;
import exceptionHandling._00_Playing.MusicDriving;


import java.util.ArrayList;
import java.util.List;

public class YabanciMusic extends MusicDriving implements IMusic {
    @Override
    public void Cal(){

        List<String> dosyaYollari = new ArrayList<>();

        dosyaYollari.add("C:\\Users\\muhammed.mavus1\\IdeaProjects\\Practices_Lesson_B5\\src\\Gun_17\\_04_YabanciMusic\\1 Na NA NA NA.wav");
        dosyaYollari.add("C:\\Users\\muhammed.mavus1\\IdeaProjects\\Practices_Lesson_B5\\src\\Gun_17\\_04_YabanciMusic\\2 Hulara.wav");

        rastgeleMusicCal(dosyaYollari);



    }
}
