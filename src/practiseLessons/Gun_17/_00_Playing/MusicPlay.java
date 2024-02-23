package Gun_17._00_Playing;

import Gun_17._01_PopMusic.PopMusic;
import Gun_17._02_RockMusic.RockMusic;
import Gun_17._03_RapMusic.RapMusic;
import Gun_17._04_YabanciMusic.YabanciMusic;
import Gun_17._05_ArabeskMusic.ArabeskMusic;

import java.util.Scanner;

public class MusicPlay {
    public static void main(String[] args) {

//        ArrayList<IMusic> mp3 = new ArrayList<>();
//        Collections.addAll(mp3,new PopMusic(), new RockMusic(), new RapMusic(), new YabanciMusic(), new ArabeskMusic());
//
//        int randomIndex = new Random().nextInt(mp3.size());
//
//        IMusic selectMusic = mp3.get(randomIndex);
//
//        MusicDriving.rastgeleMusicCal(selectMusic);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Çalmak istediğiniz müzik türünü seçin:");
            System.out.println("1. Pop");
            System.out.println("2. Rock");
            System.out.println("3. Rap");
            System.out.println("4. Yabancı");
            System.out.println("5. Arabesk");
            System.out.println("0. Çalmayı Durdur");
            System.out.print("Seçim --> ");

            int secim = scanner.nextInt();
            if (secim == 0) {
                System.out.println("Müzik çalmayı durduruyor...");
                break;
            }
            switch (secim) {
                case 1:
                    PopMusic popMusic = new PopMusic();
                    popMusic.Cal();
                    break;
                case 2:
                    RockMusic rockMusic = new RockMusic();
                    rockMusic.Cal();
                    break;
                case 3:
                    RapMusic rapMusic = new RapMusic();
                    rapMusic.Cal();
                    break;
                case 4:
                    YabanciMusic yabanciMusic = new YabanciMusic();
                    yabanciMusic.Cal();
                    break;
                case 5:
                    ArabeskMusic arabeskMusic = new ArabeskMusic();
                    arabeskMusic.Cal();
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyiniz.");
            }
        }
    }
}
