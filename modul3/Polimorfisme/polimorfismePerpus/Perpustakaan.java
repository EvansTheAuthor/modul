package modul3.Polimorfisme.polimorfismePerpus;

class Perpustakaan {
    private String title;
    private int releaseYear;

    void inputDataKoleksi(String title, int releaseYear){
        this.title=title;
        this.releaseYear=releaseYear;
    }

    void tampilDataKoleksi(){
        System.out.println("Judul: "+title);
        System.out.println("Tahun Terbit: "+releaseYear);
    }
}
