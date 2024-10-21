package Strategy;

// bir işlemi yapmak içi farklı strateji (algoritma) seçmemizi sağlar
interface DownloadStrategy{
    void indir (double dosyaBoyutu);
}

class GoogleDriveDownload implements DownloadStrategy{
    @Override
    public void indir(double dosyaBoyutu) {
        System.out.println("Google Drive'dan " + dosyaBoyutu + " GB dosya indiriliyor...");
    }
}

class DropboxDownload implements DownloadStrategy{
    @Override
    public void indir(double dosyaBoyutu) {
        System.out.println("Dropbox'dan " + dosyaBoyutu + " GB dosya indiriliyor...");
    }

}

class TorrentDownload implements DownloadStrategy{
    @Override
    public void indir(double dosyaBoyutu) {
        System.out.println("Torrent'dan " + dosyaBoyutu + " GB dosya indiriliyor...");
    }
}

class indirme{
    private DownloadStrategy downloadStrategy;

    public void setDownloadStrategy(DownloadStrategy downloadStrategy) {
        this.downloadStrategy = downloadStrategy;
    }
    public void indir(double dosyaboyutu){
        downloadStrategy.indir(dosyaboyutu);
    }
}

public class Main {
    public static void main(String[] args) {
        indirme indirme=new indirme();

        indirme.setDownloadStrategy(new DropboxDownload());
        indirme.indir(2.4);

        indirme.setDownloadStrategy(new GoogleDriveDownload());
        indirme.indir(2.4);

        indirme.setDownloadStrategy(new TorrentDownload());
        indirme.indir(2.4);



    }
}
