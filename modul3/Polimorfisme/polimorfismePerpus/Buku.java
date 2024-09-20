package modul3.Polimorfisme.polimorfismePerpus;

class Buku extends Perpustakaan{
    private String author;
    private int page;
    private String type;

    @Override
    void inputDataKoleksi(String title, int releaseYear){
        super.inputDataKoleksi(title, releaseYear);
        inputDataBuku(author, page, type);
        System.out.println("Buku berhasil didaftarkan!");
    }

    void inputDataBuku(String author, int page, String type){
        this.author=author;
        this.page=page;
        this.type=type;
    }

    @Override
    void tampilDataKoleksi(){
        super.tampilDataKoleksi();
        System.out.println("Penulis: "+author);
        System.out.println("Jumlah Halaman: "+page);
    }
}
