package exceptionHandling._01_PopMusic;


import exceptionHandling._00_Playing.MusicDriving;
import practiseLessons.exceptionHandling._00_Playing.IMusic;

import java.util.ArrayList;
import java.util.List;

public class PopMusic extends MusicDriving implements IMusic {
    @Override
    public void Cal()  {

        List<String> dosyaYollari = new ArrayList<>();

            dosyaYollari.add("C:\\Users\\muhammed.mavus1\\IdeaProjects\\Practices_Lesson_B5\\src\\Gun_17\\_01_PopMusic\\1 Janti.wav");
            dosyaYollari.add("C:\\Users\\muhammed.mavus1\\IdeaProjects\\Practices_Lesson_B5\\src\\Gun_17\\_01_PopMusic\\2 Sor.wav");

        rastgeleMusicCal(dosyaYollari);



    }
}
