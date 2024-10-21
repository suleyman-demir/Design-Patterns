package Factory;

// Ekleme, oluşturma ve düzenlemenin kolay ve güvenli olduğu fabrika patterni
interface Arac {
    void kapilariEkle();

    void motoruEkle();

    void lastikleriEkle();
}

class Bmw implements Arac {
    @Override
    public void kapilariEkle() {
        System.out.println("BMW kapıları ekleniyor.");
    }

    @Override
    public void motoruEkle() {
        System.out.println("BMW motoru ekleniyor.");
    }

    @Override
    public void lastikleriEkle() {
        System.out.println("BMW lastikleri ekleniyor.");
    }
}

class Honda implements Arac {
    @Override
    public void kapilariEkle() {
        System.out.println("Honda kapıları ekleniyor.");
    }

    @Override
    public void motoruEkle() {
        System.out.println("Honda motoru ekleniyor.");
    }

    @Override
    public void lastikleriEkle() {
        System.out.println("Honda lastikleri ekleniyor.");
    }
}

class Mercedes implements Arac {
    @Override
    public void kapilariEkle() {
        System.out.println("Mercedes kapıları ekleniyor.");
    }

    @Override
    public void motoruEkle() {
        System.out.println("Mercedes motoru ekleniyor.");
    }

    @Override
    public void lastikleriEkle() {
        System.out.println("Mercedes lastikleri ekleniyor.");
    }
}

abstract class AracFabrikasi {

    public abstract Arac aracOlusturma(String aracTipi);

    public Arac monteEt(String aracTipi) {
        Arac arac = aracOlusturma(aracTipi); // Hata düzeltildi
        arac.kapilariEkle();
        arac.motoruEkle();
        arac.lastikleriEkle();
        return arac;
    }
}

class ConcretAracFabrikasi extends AracFabrikasi {
    @Override
    public Arac aracOlusturma(String aracTipi) {
        if (aracTipi.equalsIgnoreCase("BMW")) {
            return new Bmw();
        } else if (aracTipi.equalsIgnoreCase("HONDA")) {
            return new Honda();
        } else if (aracTipi.equalsIgnoreCase("MERCEDES")) {
            return new Mercedes();
        } else {
            throw new IllegalArgumentException("Bilinmeyen araç markası: " + aracTipi);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        AracFabrikasi aracFabrikasi = new ConcretAracFabrikasi();
        Arac bmw = aracFabrikasi.monteEt("BMW");
        Arac honda = aracFabrikasi.monteEt("HONDA");
        Arac mercedes = aracFabrikasi.monteEt("MERCEDES");
    }
}
