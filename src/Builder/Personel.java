package Builder;

public class Personel {

    private String isim;
    private String soyisim;
    private int yas;
    private int maas;

    //BUİLDER
    public static class Builder {
        private String isim;
        private String soyisim;
        private int yas;
        private int maas;

        public Builder isim(String isim) {
            this.isim = isim;
            return this;
        }

        public Builder soyisim(String soyisim) {
            this.soyisim = soyisim;
            return this;
        }

        public Builder yas(int yas) {
            this.yas = yas;
            return this;
        }

        public Builder maas(int maas) {
            this.maas = maas;
            return this;
        }

        public Personel build() {
            return new Personel(this);
        }
    }

    private Personel(Builder builder) {
        this.isim = builder.isim;
        this.soyisim = builder.soyisim;
        this.yas = builder.yas;
        this.maas = builder.maas;
    }

    @Override
    public String toString() {
        return "Personel: İsim Soyisim - " + isim + " " + soyisim+
                ", Yaş - " + yas
                + ", Maaş - "+maas;
    }



    public static void main(String[] args) {
        Personel suleyman = new Builder()
                .isim("Süleyman")
                .soyisim("Demir")
                .yas(21)
                .maas(40000)
                .build();

        System.out.println(suleyman);
    }
}


//KARMAŞIK NESNELERİ OLUŞTURMAYI KOLAYLAŞTIRIR

//NESNE OLUŞTURMADA ESNEKLİK , ÖZELLEŞTİRME SAĞLAR.

// DAHA OKUNABİLİR VE KONTROL EDİLEBİLİR OLUR
