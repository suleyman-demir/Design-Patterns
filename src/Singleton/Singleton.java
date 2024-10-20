package Singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){}


    public static Singleton getInstance(){

        if (instance == null) {
instance=new Singleton();
}
        return instance;
}

    public void baglan() {
        System.out.println("veritabanına bağlandı");
 }


    public static void main(String[] args) {
Singleton baglanti = Singleton.getInstance();
baglanti.baglan();
}
}
//BİR SINIFIN SADECE TEK BİR ÖRNEĞİNİN OLMASINI GARANTİ EDER

//HER YERDEN ERİŞİLEBİLİR

//GLOBAL YAPILANDIRMALAR VE KAYNAK YÖNETİMİ İÇİN KULLANILIR DB CONNECTİON GİBİ DURUMLAR ÖZELİNDE