package Adapter;
// iki farklı interfaceyi arayüzü birbirine entegre eder

//iki uyumsuz sınıf arasında köprü görevi görür

//hali hazırda olan sınıfta değişiklik yapmadan yeni sistem entegre edebiliriz

public class Odemeler {

    public interface KrediKarti {
        void odemeYap(double miktar);
    }
    // HALİHAZIRDA KREDİ KARTI ÖDEME SİSTEMİ
    public class GercekKrediKarti implements KrediKarti {
        @Override
        public void odemeYap(double miktar) {
            System.out.println("Kredi kartı ile "+ miktar+" TL ödeme yapıldı.");
        }
    }
// EKLENECEK SİSTEM
    public class PayPal {
        public void paypalOdemeYap(double miktar) {
            System.out.println("PayPal ile " + miktar + " TL ödeme yapıldı.");
        }
    }

        // adapteer sınıfı
    public class PayPalAdapter implements KrediKarti {
        private PayPal paypal;


        public PayPalAdapter (PayPal paypal) {
            this.paypal = paypal;
        }

        @Override

        public void odemeYap (double miktar) {
            paypal.paypalOdemeYap(miktar); //paypalla ödemek için
        }

    }

    public static void main(String[] args) {
        Odemeler odeme = new Odemeler();

        // KK ile ödeme

        KrediKarti krediKarti = odeme.new GercekKrediKarti();
        krediKarti.odemeYap(185.75);


        // paypalla ödeme

        PayPal payPal = odeme.new PayPal();
        KrediKarti paypalAdapter = odeme.new PayPalAdapter(payPal);
        paypalAdapter.odemeYap(245.0);

    }




}
