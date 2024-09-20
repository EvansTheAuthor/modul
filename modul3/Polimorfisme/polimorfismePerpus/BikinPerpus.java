package modul3.Polimorfisme.polimorfismePerpus;

import java.time.Duration;

public class BikinPerpus {
    public static void main(String[] args) {
        Buku buku1=new Buku();

        buku1.inputDataBuku("Nidzom", 205, "e-Book");
        buku1.inputDataKoleksi("Null", 2024);
        buku1.tampilDataKoleksi();
        System.out.println("=====================");
        System.out.println();

        Majalah majalah=new Majalah();
        majalah.inputDataMajalah("XIV", "Politik-Sosial");
        majalah.inputDataKoleksi("Tempo", 2019);
        majalah.tampilDataKoleksi();
        System.out.println("====================");
        System.out.println();

        DV dvd=new DV();
        Duration durasi=Duration.ofHours(1).plusMinutes(20);
        dvd.inputDataDVD(durasi, "Dokumenter");
        dvd.inputDataKoleksi("Timor Lorosae: The Unseen Massacre", 2001);
        dvd.tampilDataKoleksi();
        System.out.println("================");
    }
}
