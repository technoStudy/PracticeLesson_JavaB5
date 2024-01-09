package practiseLessons.stringDataAndAritmeticOperators;

import java.util.Scanner;

public class Ornek01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //length(): String'in uzunluğunu döndürür.
        String str = "Merhaba";
        int strUzunluk = str.length(); // uzunluk şimdi 7 olacak
        System.out.println("strUzunluk = " + strUzunluk);

        //charAt(int index): Belirli bir dizindeki karakteri döndürür.
        char karakter = str.charAt(0); // karakter şimdi 'M' olacak
        System.out.println("karakter = " + karakter);

        //Soru:
        //Girilen bir cümlenin 10. indexindeki karakteri yazdıran programı kodlayınız.
        System.out.print("En Az 11 karakterli bir cümle giriniz : ");
        String charCumle = scanner.nextLine();
        char OnuncuIndex = charCumle.charAt(10);
        System.out.println("OnuncuIndex = " + OnuncuIndex);

        //substring(int başlangıçIndex): Belirli bir dizinden sona kadar olan alt dizesini döndürür.
        String altDize1 = str.substring(3); // altDize şimdi "haba" olacak
        System.out.println("altDize1 = " + altDize1);
        //Soru:
        //Girilen cümlenin sondan 2 karakteri yazdıran programı kodlayınız.
        System.out.print("Bir cümle giriniz : ");
        String substringCumle = scanner.nextLine();
        String sonIkiKarakter = substringCumle.substring(substringCumle.length()-2);
        System.out.println("sonIkiKarakter = " + sonIkiKarakter);

        //substring(int başlangıçIndex, int bitişIndex): Belirli bir aralıktaki alt dizesini döndürür.
        String altDize2 = str.substring(0, 3); // altDize şimdi "Mer" olacak
        System.out.println("altDize2 = " + altDize2);
        //Soru:
        //Girilen cümlenin 2. karakterinden sondan 4 karakterine kadar olan aralığı yazdıran programı kodlayınız.
        System.out.print("Bir cümle giriniz : ");
        String substringCumle2 = scanner.nextLine();
        String substringAralik = substringCumle2.substring(1,substringCumle2.length()-4);
        System.out.println("substringAralik = " + substringAralik);


        //toLowerCase():Tüm harfleri küçük harfe çevirir.
        String kucukHarf = str.toLowerCase(); // kucukHarf şimdi "merhaba" olacak
        System.out.println("kucukHarf = " + kucukHarf);

        //toUpperCase():Tüm harfleri büyük harfe çevirir.
        String buyukHarf = str.toUpperCase(); // buyukHarf şimdi "MERHABA" olacak
        System.out.println("buyukHarf = " + buyukHarf);

        //concat metodu, String sınıfında bulunan bir metoddur ve iki stringi birleştirmek için kullanılır.
        String str1 = "Merhaba";
        String str2 = "Dünya";

        // concat metodu ile iki stringi birleştirme
        String birlesikString = str1.concat(str2);

        // Sonucu ekrana yazdırma
        System.out.println("Birleştirilmiş String: " + birlesikString);

        //indexOf metodu, bir String içinde belirli bir alt dizenin ilk indeksini bulmaya yarayan bir Java metodu.
        //Eğer alt dize bulunamazsa, -1 değerini döndürür.
        String ornekString1 = "Merhaba Dünya";

        // indexOf metodu ile bir alt dizenin ilk indeksini bulma
        int indeks1 = ornekString1.indexOf("Dünya");
        System.out.println("İlk İndeks: " + indeks1);
        // Aynı zamanda indexOf metodu, başka bir indexOf çağrısı ile belirli bir indeksten itibaren alt dize aramak için kullanılabilir.
        int ikinciIndeks1 = ornekString1.indexOf("a", indeks1 + 1);

        //lastIndexOf metodu, bir String içinde belirli bir alt dizenin en son bulunduğu indeksi bulmaya yarayan bir Java metodu.
        //Bu metot, alt dizenin sondan başlayarak aranmasını sağlar. Eğer alt dize bulunamazsa, -1 değerini döndürür.
        String ornekString2 = "Merhaba Dünya, Merhaba Java";

        // lastIndexOf metodu ile bir alt dizenin en son indeksini bulma
        int indeks2 = ornekString2.lastIndexOf("Merhaba");
        System.out.println("Alt Dize Bulundu, En Son İndeks: " + indeks2);
        //lastIndexOf metodu aynı zamanda başlangıç indeksi belirtilerek belirli bir indeksten başlayarak sondan itibaren alt dize aramak için de kullanılabilir
        int ikinciIndeks2 = ornekString2.lastIndexOf("Merhaba", indeks2 - 1);

//isEmpty metodu, bir String'in boş olup olmadığını kontrol etmek için kullanılır. Eğer string boş ise true, değilse false döndürür.

        String bosString = "";
        String doluString = "Merhaba";

        // isEmpty metodu ile bir String'in boş olup olmadığını kontrol etme
        boolean bosMu1 = bosString.isEmpty();
        boolean bosMu2 = doluString.isEmpty();

        // Sonuçları ekrana yazdırma
        System.out.println("bosString Boş mu? " + bosMu1); // true
        System.out.println("doluString Boş mu? " + bosMu2); // false


//trim metodu, bir String'in başındaki ve sonundaki boşlukları (whitespace karakterleri) temizlemek için kullanılır.
//Whitespace karakterleri, boşluk, tab, yeni satır gibi görünmeyen karakterleri içerir.

        String ornekString = "   Merhaba, Bu bir örnek!   ";

        // trim metodu ile başındaki ve sonundaki boşlukları temizleme
        String temizlenmisString = ornekString.trim();

        // Sonuçları ekrana yazdırma
        System.out.println("Orjinal String: \"" + ornekString + "\"");
        System.out.println("Temizlenmiş String: \"" + temizlenmisString + "\"");



        //Soru:
        //Kullanıcıdan bir kelime girmesini isteyen bir Java programı yazın.Program, girilen kelimenin uzunluğunu, ilk
        //harfini büyük harfe çevrilmiş olarak kelimenin son halini ekrana yazdıran  ve ikinci harfini ekrana yazdıran
        //programı kodlayınız.

        System.out.print("Bir kelime girin: ");
        String kelime = scanner.next();

        // Uzunluk
        int uzunluk = kelime.length();
        System.out.println("Uzunluk: " + uzunluk);

        // tamamını küçük harfe çevir
        String kucukHali = kelime.toLowerCase();

        // İlk harfi büyük harfe çevir
        char ilkHarf = kucukHali.charAt(0);
        String ilkHarfBuyuk = Character.toUpperCase(ilkHarf) + kucukHali.substring(1);
        System.out.println("İlk harfi büyük harfe çevrildi: " + ilkHarfBuyuk);

        // İkinci harf
        char ikinciHarf = kelime.charAt(1);
        System.out.println("İkinci harf: " + ikinciHarf);

        //Soru:
        //Kullanıcıdan ayrı ayrı iki kelime girmesini isteyen bir Java programı yazın.
        //Program, girilen kelimelerin uzunluklarını ve birleştirilmiş halini değişkenlere atadıktan sonra
        //ekrana yazdıran programı kodlayınız
        System.out.print("İlk kelimeyi girin: ");
        String ilkKelime = scanner.next();

        System.out.print("İkinci kelimeyi girin: ");
        String ikinciKelime = scanner.next();

        // Uzunlukları toplamadan ve birleştirilmiş halini ekrana yazdırmadan bilgileri elde etme
        int toplamUzunluk = ilkKelime.length() + ikinciKelime.length();
        String birlesikKelime = ilkKelime.concat(ikinciKelime);

        // Sonuçları ekrana yazdır
        System.out.println("Toplam Uzunluk: " + toplamUzunluk);
        System.out.println("Birleştirilmiş Kelimeler: " + birlesikKelime);

        //contains metodu, bir String'in belirli bir alt dizeyi içerip içermediğini kontrol etmek için kullanılır.
        //Eğer belirtilen alt dize string içinde bulunuyorsa, true değerini döndürür; aksi takdirde, false değerini döndürür.
        String ornekContains = "Merhaba, Bu bir örnek!";

        // contains metodu ile bir alt dizenin içerip içermediğini kontrol etme
        boolean iceriyorMu1 = ornekContains.contains("örnek");
        boolean iceriyorMu2 = ornekContains.contains("Java");

        // Sonuçları ekrana yazdırma
        System.out.println("\"örnek\" alt dizesi içeriyor mu? " + iceriyorMu1); // true
        System.out.println("\"Java\" alt dizesi içeriyor mu? " + iceriyorMu2); // false

        //equals metodu, iki String nesnesinin içeriğini karşılaştırmak için kullanılır.
        //Eğer iki stringin içeriği birbirine eşitse, yani aynı karakterlere ve sıraya sahiplerse, true değerini döndürür;
        //aksi takdirde, false değerini döndürür.
        String string1 = "Merhaba";
        String string2 = "Merhaba";
        String string3 = "Java";

        // equals metodu ile iki stringin eşit olup olmadığını kontrol etme
        boolean esitMi1 = string1.equals(string2);
        boolean esitMi2 = string1.equals(string3);

        // Sonuçları ekrana yazdırma
        System.out.println("\"Merhaba\" ve \"Merhaba\" eşit mi? " + esitMi1); // true
        System.out.println("\"Merhaba\" ve \"Java\" eşit mi? " + esitMi2); // false



        //equalsIgnoreCase metodu, iki String nesnesinin içeriğini karşılaştırmak için kullanılır,
        //ancak büyük/küçük harf duyarlılığını göz ardı eder. Yani, iki stringin içeriği aynı karakterlere sahipse
        //ve harf büyüklük küçüklükleri farklı olsa bile, true değerini döndürür; aksi takdirde, false değerini döndürür.

        String string4 = "Merhaba";
        String string5 = "MERHABA";
        String string6 = "Java";

        // equalsIgnoreCase metodu ile iki stringin eşit olup olmadığını, harf büyüklük küçüklüğünü göz ardı ederek kontrol etme
        boolean esitMi3 = string4.equalsIgnoreCase(string5);
        boolean esitMi4 = string4.equalsIgnoreCase(string6);

        // Sonuçları ekrana yazdırma
        System.out.println("\"Merhaba\" ve \"MERHABA\" eşit mi? " + esitMi3); // true
        System.out.println("\"Merhaba\" ve \"Java\" eşit mi? " + esitMi4); // false

        //startsWith metodu, bir String'in belirli bir alt dize ile başlayıp başlamadığını kontrol etmek için kullanılır.
        //Bu metot, eğer bir String, belirli bir başlangıç alt dizisi ile başlıyorsa true, başlamıyorsa false değerini döndürür.
        String ornekStartWith = "Merhaba, Bu bir örnek!";

        // startsWith metodu ile bir alt dize ile başlayıp başlamadığını kontrol etme
        boolean basliyorMu1 = ornekStartWith.startsWith("Merhaba");
        boolean basliyorMu2 = ornekStartWith.startsWith("Java");

        // Sonuçları ekrana yazdırma
        System.out.println("\"Merhaba\" ile başlıyor mu? " + basliyorMu1); // true
        System.out.println("\"Java\" ile başlıyor mu? " + basliyorMu2); // false

        //endsWith metodu, bir String'in belirli bir alt dize ile bitip bitmediğini kontrol etmek için kullanılır.
        //Bu metot, eğer bir String, belirli bir bitiş alt dizisi ile bitiyorsa true, bitmiyorsa false değerini döndürür.

        String ornekEndWith = "Merhaba, Bu bir örnek!";

        // endsWith metodu ile bir alt dize ile bitip bitmediğini kontrol etme
        boolean bitiyorMu1 = ornekEndWith.endsWith("örnek!");
        boolean bitiyorMu2 = ornekEndWith.endsWith("Java");

        // Sonuçları ekrana yazdırma
        System.out.println("\"örnek!\" ile bitiyor mu? " + bitiyorMu1); // true
        System.out.println("\"Java\" ile bitiyor mu? " + bitiyorMu2); // false

        //replace metodu, bir String içinde belirli bir karakteri veya alt dizesini
        //başka bir karakter veya alt dize ile değiştirmek için kullanılır.

        String ornekReplace = "Merhaba, Bu bir örnek cümle.";

        // replace metodu ile belirli bir karakteri veya alt dizesini değiştirme
        String yeniString1 = ornekString.replace('e', 'X'); // 'e' karakterini 'X' ile değiştir
        String yeniString2 = ornekString.replace("örnek", "farklı"); // "örnek" alt dizesini "farklı" ile değiştir

        // Sonuçları ekrana yazdırma
        System.out.println("Orjinal String: " + ornekReplace);
        System.out.println("Karakter Değişimi: " + yeniString1);
        System.out.println("Alt Dize Değişimi: " + yeniString2);

        //replaceFirst metodu, bir String içinde belirli bir deseni (pattern) veya karakteri başka bir
        //desen veya karakterle değiştirmek için kullanılır. Ancak, sadece ilk bulunan eşleşmeyi değiştirir.
        String ornekReplaceFirst = "Merhaba, Bu bir örnek cümle. Merhaba dünya!";

        // replaceFirst metodu ile belirli bir deseni veya karakteri değiştirme
        String yeniString = ornekReplaceFirst.replaceFirst("Merhaba", "Selam");

        // Sonucu ekrana yazdırma
        System.out.println("Orjinal String: " + ornekReplaceFirst);
        System.out.println("İlk Desen Değişimi: " + yeniString);


        //replaceAll metodu, bir String içinde belirli bir deseni (regex ifadesini) veya karakteri başka bir desen
        //veya karakterle değiştirmek için kullanılır. Regex ifadeleri, desenlerin tanımlanması ve eşleşmelerin
        //bulunması için kullanılan özel ifadelerdir.

        String ornekReplaceAll = "Merhaba 123 dünya! Bu bir örnek cümle.";

        // replaceAll metodu ile regex kullanarak sayıları temizleme
        String temizlenmisHali = ornekReplaceAll.replaceAll("\\d", "");

        // Sonucu ekrana yazdırma
        System.out.println("Orjinal String: " + ornekString);
        System.out.println("Sayıları Temizlenmiş String: " + temizlenmisHali);



                //----***** aritmetik operatorler *****----//

       //Java'da aritmetik operatörler, matematiksel hesaplamalarda kullanılan temel işlemleri gerçekleştirmek için kullanılır.
        // İşte Java'da bulunan aritmetik operatörler:

        //Toplama Operatörü (+):
        //İki sayıyı toplamak için kullanılır.

        int sayi1 = 5;
        int sayi2 = 3;
        int toplam = sayi1 + sayi2; // toplam = 8
        System.out.println("toplam = " + toplam);

        //Çıkarma Operatörü (-):
        //Bir sayıdan diğerini çıkarmak için kullanılır.
        int sayi3 = 8;
        int sayi4 = 3;
        int fark = sayi3 - sayi4; // fark = 5
        System.out.println("fark = " + fark);

        //Çarpma Operatörü (*):
        //İki sayıyı çarpmak için kullanılır.
        int sayi5 = 4;
        int sayi6 = 6;
        int carpim = sayi5 * sayi6; // carpim = 24
        System.out.println("carpim = " + carpim);

        //Bölme Operatörü (/):
        //Bir sayıyı diğerine bölmek için kullanılır. Eğer sayılar tam sayı tipinde ise bölme işlemi tam bölme yapar.
        int sayi7 = 10;
        int sayi8 = 2;
        int bolum = sayi7 / sayi8; // bolum = 5
        System.out.println("bolum = " + bolum);

        //Mod (Kalan) Operatörü (%):
        //Bir sayının diğerine bölümünden kalanı bulmak için kullanılır.
        int sayi9 = 10;
        int sayi10 = 3;
        int kalan = sayi9 % sayi10; // kalan = 1
        System.out.println("kalan = " + kalan);

        //Artırma Operatörü (++):
        //Bir değişkenin değerini bir artırmak için kullanılır.
        int sayi11 = 5;
        sayi11++; // sayi şimdi 6
        System.out.println("sayi11 = " + sayi11);

        //Azaltma Operatörü (--):
        //Bir değişkenin değerini bir azaltmak için kullanılır.
        int sayi12 = 8;
        sayi12--; // sayi şimdi 7
        System.out.println("sayi12 = " + sayi12);

        //Bu operatörlerle matematiksel hesaplamalar gerçekleştirilebilir ve değişkenler arasında değer değişimleri sağlanabilir.



    }
}
