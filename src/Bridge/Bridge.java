package Bridge;

//Abstract ve implementasyonu birbirinden ayırır

// iki bileşen birbirinden bağımsız geliştirilebilir

//iki boyutlu genişleme yapılşabilir


public class Bridge {
    // Renk interfacesi
    public interface Renk {
        void boya();
    }

    // RENKLER
    public class Kirmizi implements Renk {
        @Override
        public void boya() {
            System.out.println("Kırmızı renkte boyandı.");
        }
    }

    // RENKLER
    public class Mavi implements Renk {
        @Override
        public void boya() {
            System.out.println("Mavi renkte boyandı.");
        }
    }

    // RENKLER
    public class Turuncu implements Renk {
        @Override
        public void boya() {
            System.out.println("Turuncu renkte boyandı.");
        }
    }




    //ARAÇ ABSTRACTI

    public abstract class Arac {
        protected Renk renk;

        public Arac(Renk renk) {
            this.renk = renk;
        }

        public abstract void boyaVeTanit();
    }

    // OTOMOBİL SINIFI
    public class Otomobil extends Arac {
        public Otomobil(Renk renk) {
            super(renk);
        }

        @Override
        public void boyaVeTanit() {
            System.out.print("Otomobil ");
            renk.boya();
        }
    }

    // KAMYON SINIFI
    public class Kamyon extends Arac {
        public Kamyon(Renk renk) {
            super(renk);
        }

        @Override
        public void boyaVeTanit() {
            System.out.print("Kamyon ");
            renk.boya();
        }
    }

    public static void main(String[] args) {
        Bridge ornek = new Bridge();

        // nesne oluşturma

        Arac turuncuOtomobil = ornek.new Otomobil(ornek.new Turuncu() );
        turuncuOtomobil.boyaVeTanit();

        Arac maviKamyon = ornek.new Kamyon(ornek.new Mavi());
        maviKamyon.boyaVeTanit();
    }


}
