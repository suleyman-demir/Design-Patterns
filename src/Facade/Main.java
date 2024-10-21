package Facade;

// Karmaşık alt sistemleri basit bir arayüzle kontrol etmek için kullanılır

public class Main {
    public static void main(String[] args) {

        Ekmek ekmek = new Ekmek();
        Peynir peynir = new Peynir();


        Cephe cephe = new Cephe(ekmek, peynir);
        cephe.facadeBaslat();
    }
}

class Ekmek {
    public void ye() {
        System.out.println("Ekmek yeniyor...");
    }
}

class Peynir {
    public void ye() {
        System.out.println("Peynir yeniyor...");
    }
}

class Cephe {
    private Ekmek ekmek;
    private Peynir peynir;

    public Cephe(Ekmek ekmek, Peynir peynir) {
        this.ekmek = ekmek;
        this.peynir = peynir;
    }

    public void facadeBaslat() {
        ekmek.ye();
        peynir.ye();
    }
}
