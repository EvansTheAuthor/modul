package modul.modul2.AgregasiPerpus;

public class Book {
    private String judul;
    private String author;

    public Book(String judul, String author){
        this.judul=judul;
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }

    public String getJudul() {
        return judul;
    }
}
