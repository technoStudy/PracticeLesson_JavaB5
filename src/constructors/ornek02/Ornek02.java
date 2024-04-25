package constructors.ornek02;

public class Ornek02 {
    public static void main(String[] args) {

        // İlk kitap nesnesi oluşturuluyor: "Sefiller" kitabı, yazarı Victor Hugo
        Kitap kitap1 = new Kitap("Sefiller", "Victor Hugo");
        kitap1.bilgileriGoster(); // Kitap bilgileri ekrana yazdırılıyor

        // İkinci kitap nesnesi oluşturuluyor: İsim boş, yazarı Jules Verne, sayfa sayısı 500
        Kitap kitap2 = new Kitap("", "Jules Verne", 500);
        kitap2.bilgileriGoster(); // Kitap bilgileri ekrana yazdırılıyor

        // Üçüncü kitap nesnesi oluşturuluyor: İsim ve yazar bilgisi belirtilmemiş
        Kitap kitap3 = new Kitap(null, null);
        kitap3.bilgileriGoster(); // Kitap bilgileri ekrana yazdırılıyor
    }
}

/**
 *
 main metodu, programın başlangıç noktasıdır ve bu metot içerisinde kitap nesneleri oluşturulup
 bilgileri ekrana yazdırılmaktadır.

 İlk kitap nesnesi olan kitap1, "Sefiller" isimli kitabı ve yazarı Victor Hugo'yu temsil eder.
 Bu kitabın bilgileri bilgileriGoster() metodu kullanılarak ekrana yazdırılır.

 İkinci kitap nesnesi olan kitap2,
 ismi boş, yazarı Jules Verne olan ve 500 sayfadan oluşan bir kitabı temsil eder.
 Bu kitabın bilgileri yine bilgileriGoster() metodu kullanılarak ekrana yazdırılır.

 Üçüncü kitap nesnesi olan kitap3, isim ve yazar bilgileri belirtilmemiş bir kitabı temsil eder.
 Bu kitabın bilgileri yine bilgileriGoster() metodu kullanılarak ekrana yazdırılır.

 Bu sayede, her bir kitabın ismi, yazarı ve sayfa sayısı (belirtilmişse) kullanıcıya gösterilir.
 */
