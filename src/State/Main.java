package State;


interface Durum {
    void işlemYap();
}

class Beklenenİstek implements Durum{
    @Override
    public void işlemYap() {
        System.out.println("İstek Bekleme Durumunda.");
    }
}

class Reddedilenİstek implements Durum{
    @Override
    public void işlemYap() {
        System.out.println("İstek Reddedildi.");
    }
}

class KabulEdilenİstek implements Durum{
     @Override
     public void işlemYap() {
         System.out.println("İstek Kabul Edildi.");
     }
}
class Gonderilenİstek implements Durum{
    @Override
    public void işlemYap() {
        System.out.println("İstek Gönderildi.");
    }
}

class Istek {
    private Durum durum;

    public void setDurum(Durum durum) {
        this.durum = durum;
    }
    public void işlemYap(){
        durum.işlemYap();
    }
}


public class Main {
    public static void main(String[] args) {
        Istek istek = new Istek();
        istek.setDurum(new Gonderilenİstek());
        istek.işlemYap();

        istek.setDurum(new Beklenenİstek());
        istek.işlemYap();

        istek.setDurum(new Reddedilenİstek());
        istek.işlemYap();

        istek.setDurum(new KabulEdilenİstek());
        istek.işlemYap();


    }
}
