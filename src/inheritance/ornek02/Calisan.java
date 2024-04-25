package inheritance.ornek02;

// Çalışan sınıfı
class Calisan {
    private final String ad;
    private final double maas;

    // Çalışan sınıfının yapıcı metodu (constructor)
    public Calisan(String ad, double maas) {
        this.ad = ad;
        this.maas = maas;
    }

    public double getMaas() {
        return maas;
    }

    // Çalışan sınıfının bilgilerini ekrana yazdıran metodu
    public void bilgileriYazdir() {
        System.out.println("Çalışan Adı: " + ad);
        System.out.println("Maaş: " + maas);
    }
}