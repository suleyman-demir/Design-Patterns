package Command;

//komut deseni işlemleri nesne olarak alır ve üzerlerinde işlem yapmayı sağlar (geri alma sıraya koyma gibi)

//tetikleyici ile çalışır

//her komut bir işlem olarak alınır



interface Komut {
    void calistir();
 }

 public class FirlatKomutu implements Komut {

     private Firlat firlat;

     public FirlatKomutu(Firlat firlat) {
         this.firlat = firlat;
     }

     @Override
     public void calistir() {
         firlat.firlat();
     }

     public static class Firlat {
         public void firlat() {
             System.out.println("Fırlatma Başladı...");
         }
     }

     public static class KomutaKumandası {
         private Komut komut;

         public void setKomut(Komut komut) {
             this.komut = komut;
         }

         public void calistirKomutu() {
             komut.calistir();
         }
     }


         public static void main(String[] args) {
             Firlat firlat = new Firlat();
             FirlatKomutu firlatKomutu = new FirlatKomutu(firlat);
             KomutaKumandası komutaKumandası = new KomutaKumandası();

             komutaKumandası.setKomut(firlatKomutu);
             komutaKumandası.calistirKomutu();


         }
     }
