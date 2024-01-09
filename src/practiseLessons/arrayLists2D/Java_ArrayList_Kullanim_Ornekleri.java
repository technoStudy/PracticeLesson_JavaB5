package practiseLessons.arrayLists2D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java_ArrayList_Kullanim_Ornekleri {
    public static void main(String[] args) {

        //ArrayList Oluşturma:
        //import java.util.ArrayList;
        ArrayList<String> myList = new ArrayList<String>();

        //Eleman Ekleme:
        myList.add("Eleman1");
        myList.add("Eleman2");
        myList.add("Eleman3");

        //Belirli Bir Indekse Eleman Ekleme:
        myList.add(1, "YeniEleman");

        //Elemanları Döngü İle Ekleme:
        String[] dizi = {"Eleman4", "Eleman5", "Eleman6"};
        Collections.addAll(myList, dizi);
        //veya 2. yöntem
        Collections.addAll(myList, "Eleman4", "Eleman5", "Eleman6");

        //Eleman Silme:
        myList.remove("Eleman2");

        //Belirli Bir Indeksteki Elemanı Silme:
        myList.remove(0);

        //Belirli Bir Elemanın İndeksini Bulma:
        int indeks = myList.indexOf("Eleman3");

        //ArrayList Boyutunu Alma:
        int boyut = myList.size();

        //Belirli Bir Indeksteki Elemanı Alma:
        String eleman = myList.get(2);

        //ArrayList'i Diziye Dönüştürme:
        String[] dizi2 = myList.toArray(new String[0]);

        //ArrayList'i Temizleme:
        myList.clear();

        //isEmpty(): ArrayList boşsa true, doluysa false döner.
        boolean bosMu = myList.isEmpty();

        //contains(Object o): Belirtilen elemanın ArrayList içinde olup olmadığını kontrol eder.
        boolean varMi = myList.contains("Eleman1");

        //addAll(Collection c): Başka bir koleksiyondaki tüm elemanları mevcut ArrayList'e ekler
        ArrayList<String> digerListe = new ArrayList<String>();
        digerListe.add("EkEleman1");
        digerListe.add("EkEleman2");
        myList.addAll(digerListe);

        //removeAll(Collection c): Belirtilen koleksiyondaki tüm elemanları ArrayList'den kaldırır.
        myList.removeAll(digerListe);

        //retainAll(Collection c): Belirtilen koleksiyondaki elemanlar dışındaki tüm elemanları kaldırır.
        myList.retainAll(digerListe);

        //subList(int fromIndex, int toIndex): Belirtilen indeks aralığındaki elemanları içeren alt bir List döner.
        List<String> altListe = myList.subList(1, 3);


    }
}
