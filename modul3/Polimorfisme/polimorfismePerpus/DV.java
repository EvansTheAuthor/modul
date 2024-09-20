package modul3.Polimorfisme.polimorfismePerpus;

import java.time.Duration;

class DV extends Perpustakaan{
    private Duration duration;
    private String genre;

    @Override
    void inputDataKoleksi(String title, int releaseYear){
        super.inputDataKoleksi(title, releaseYear);
        inputDataDVD(duration, genre);
        System.out.println("DVD berhasil didaftarkan!");
    }

    void inputDataDVD(Duration duration, String genre){
        this.duration=duration;
        this.genre=genre;
    }

    @Override
    void tampilDataKoleksi() {
        super.tampilDataKoleksi();
        System.out.println("Genre: "+genre);
        System.out.println("Durasi: "+duration);
    }
}
