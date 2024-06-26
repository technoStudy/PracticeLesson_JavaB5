package stringMethods;

public class Ornek01 {
    public static void main(String[] args) {

        String str = "Merhaba";

        //toLowerCase():Tüm harfleri küçük harfe çevirir.
        String kucukHarf = str.toLowerCase();
        System.out.println("kucukHarf = " + kucukHarf);

        //toUpperCase():Tüm harfleri büyük harfe çevirir.
        String buyukHarf = str.toUpperCase();
        System.out.println("buyukHarf = " + buyukHarf);

        // concat metodu ile iki stringi birleştirme
        String str1 = "Merhaba";
        String str2 = "Dünya";
        String str3 = " ";
        String birlesikConcat = str1.concat(str3.concat(str2));
        System.out.println("birlesikConcat = " + birlesikConcat);

        //indexOf metodu, bir String içinde belirli bir alt dizenin ilk indeksini bulmaya yarayan bir Java metodu.
        //Eğer alt dize bulunamazsa, -1 değerini döndürür.
        String ornekString1 = "Merhaba Dünya";
        int index1 = ornekString1.indexOf("a");
        System.out.println("index1 = " + index1);
        int index2 = ornekString1.indexOf("a", index1 + 1);
        System.out.println("index1 + 1 = " + index2);

        //lastIndexOf metodu, bir String içinde belirli bir alt dizenin en son bulunduğu indeksi bulmaya yarayan bir Java metodu.
        //Bu metot, alt dizenin sondan başlayarak aranmasını sağlar. Eğer alt dize bulunamazsa, -1 değerini döndürür.

        String ornekString2 = "Merhaba Dünya, Merhaba Java 26";
        int index3 = ornekString2.lastIndexOf("Merhaba");
        System.out.println("index3 = " + index3);
        System.out.println("index3 = " + ornekString2.lastIndexOf("a"));
        System.out.println("index3 = " + ornekString2.indexOf("26"));
        System.out.println("index3 = " + (ornekString2.length() - 1));

        //isEmpty metodu, bir String'in boş olup olmadığını kontrol etmek için kullanılır.
        // Eğer string boş ise true, değilse false döndürür.
        String bosString = "";
        String doluString = "Merhaba";

        boolean bosMu1 = bosString.isEmpty();
        boolean bosMu2 = doluString.isEmpty();
        System.out.println("bosMu1 = " + bosMu1);
        System.out.println("bosMu2 = " + bosMu2);

        //trim metodu, bir String'in başındaki ve sonundaki boşlukları (whitespace karakterleri) temizlemek için kullanılır.
        //Whitespace karakterleri, boşluk, tab, yeni satır gibi görünmeyen karakterleri içerir.  

        String ornekTrim = "     Merhaba, Bu bir örnek!     ";
        String temizlenmisTrim = ornekTrim.trim();
        System.out.println("ornekTrim = " + ornekTrim);
        System.out.println("temizlenmisTrim = " + temizlenmisTrim);

        //contains metodu, bir String'in belirli bir alt dizeyi içerip içermediğini kontrol etmek için kullanılır.
        //Eğer belirtilen alt dize string içinde bulunuyorsa, true değerini döndürür; aksi takdirde, false değerini döndürür.

        String ornekContains = "Merhaba, bu bir örnektir!";
        boolean iceriyorMu1 = ornekContains.contains("örnek");
        boolean iceriyorMu2 = ornekContains.contains("java");
        System.out.println("iceriyorMu1 = " + iceriyorMu1);
        System.out.println("iceriyorMu2 = " + iceriyorMu2);

        //equals metodu, iki String nesnesinin içeriğini karşılaştırmak için kullanılır.
        //Eğer iki stringin içeriği birbirine eşitse, yani aynı karakterlere ve sıraya sahiplerse, true değerini döndürür;
        //aksi takdirde, false değerini döndürür.

        String string1 = "Merhaba";
        String string2 = "Merhaba";
        String string3 = "Java";
        boolean esitMi1 = string1.equals(string2);
        boolean esitMi2 = string1.equals(string3);
        System.out.println("esitMi1 = " + esitMi1);
        System.out.println("esitMi2 = " + esitMi2);

        //equalsIgnoreCase metodu, iki String nesnesinin içeriğini karşılaştırmak için kullanılır,
        //ancak büyük/küçük harf duyarlılığını göz ardı eder. Yani, iki stringin içeriği aynı karakterlere sahipse
        //ve harf büyüklük küçüklükleri farklı olsa bile, true değerini döndürür; aksi takdirde, false değerini döndürür.
        String string4 = "Merhaba";
        String string5 = "MERHABA";
        String string6 = "Java";

        boolean esitMi3 = string4.equalsIgnoreCase(string5);
        boolean esitMi5 = string4.equals(string5);
        boolean esitMi4 = string4.equalsIgnoreCase(string6);
        System.out.println("esitMi3 t = " + esitMi3);
        System.out.println("esitMi5 f= " + esitMi5);
        System.out.println("esitMi4 f = " + esitMi4);
    }
}
