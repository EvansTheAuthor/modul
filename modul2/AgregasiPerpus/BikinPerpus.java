package modul.modul2.AgregasiPerpus;

public class BikinPerpus {
    public static void main(String[] args) {
        Book buku1=new Book("Omniscient Reader Viewpint", "Singshong");
        Book buku2=new Book("Harimau! Harimau!", "Mochtar Lubis");
        Book buku3=new Book("Harry Potter", "J. K. Rowling");
        Book buku4=new Book("Gagal Menjadi Manusia", "Osamu Dazai");

        Perpus perpus=new Perpus("Null", 5);

        perpus.tambahBuku(buku4);
        perpus.tambahBuku(buku3);
        perpus.tambahBuku(buku2);
        perpus.tambahBuku(buku1);

        perpus.tampilkanBuku();
    }
}
