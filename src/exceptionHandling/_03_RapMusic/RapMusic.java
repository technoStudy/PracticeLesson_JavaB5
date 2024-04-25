package exceptionHandling._03_RapMusic;

import exceptionHandling._00_Playing.MusicDriving;
import practiseLessons.exceptionHandling._00_Playing.IMusic;

import java.util.ArrayList;
import java.util.List;

public class RapMusic extends MusicDriving implements IMusic {
    @Override
    public void Cal() {

        List<String> dosyaYollari = new ArrayList<>();

        dosyaYollari.add("C:\\Users\\muhammed.mavus1\\IdeaProjects\\Practices_Lesson_B5\\src\\Gun_17\\_03_RapMusic\\1 Suspus.wav");
        dosyaYollari.add("C:\\Users\\muhammed.mavus1\\IdeaProjects\\Practices_Lesson_B5\\src\\Gun_17\\_03_RapMusic\\2 Toz Taneleri.wav");

        rastgeleMusicCal(dosyaYollari);



    }
}
