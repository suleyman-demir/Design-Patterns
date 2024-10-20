package ChainOfResponsibility;

abstract class DestekSeviyesi {
    protected DestekSeviyesi sonrakiSeviye;

    public void setSonrakiSeviye(DestekSeviyesi sonrakiSeviye) {
        this.sonrakiSeviye = sonrakiSeviye;
    }

    public abstract void destekTalebi(int seviye);
}

class Seviye1Destek extends DestekSeviyesi {
    public void destekTalebi(int seviye) {
        if (seviye == 1) {
            System.out.println("Seviye 1 desteği sağlanıyor.");
        } else if (sonrakiSeviye != null) {
            sonrakiSeviye.destekTalebi(seviye);
        }
    }
}

class Seviye2Destek extends DestekSeviyesi {
    public void destekTalebi(int seviye) {
        if (seviye == 2) {
            System.out.println("Seviye 2 desteği sağlanıyor.");
        } else if (sonrakiSeviye != null) {
            sonrakiSeviye.destekTalebi(seviye);
        }
    }



    public static void main(String[] args) {
        Seviye1Destek seviye1 = new Seviye1Destek();
        Seviye2Destek seviye2 = new Seviye2Destek();

        seviye1.setSonrakiSeviye(seviye2);


        seviye1.destekTalebi(2);
    }

}
