package practiseLessons.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ornek03 {

    public static void main(String[] args) {

        /**
         Soru:
         Bir LinkedHashSet oluşturun ve içine bazı öğrenci isimleri ekleyiniz.
         Daha sonra LinkedHashSet’i yineleyerek öğrenci isimlerini
         eklendikleri sıraya göre yazdırınız.
         */

        // Bir Scanner nesnesi oluşturun
        Scanner scanner = new Scanner(System.in);

        // Bir LinkedHashSet oluşturun
        LinkedHashSet<String> students = new LinkedHashSet<>();

        // Kaç öğrenci ekleneceğini kullanıcıdan alın
        System.out.print("Kaç öğrenci eklemek istiyorsunuz? ");
        int n = scanner.nextInt();

        // Her öğrenci ismini kullanıcıdan alın ve LinkedHashSet'e ekleyin
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". öğrencinin ismini girin: ");
            String name = scanner.next();
            students.add(name);
        }

        // Bir yineleyici oluşturun ve LinkedHashSet'i yineleyin
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            // Her öğrenci ismini yazdırın
            System.out.println(iterator.next());
        }
    }
}
