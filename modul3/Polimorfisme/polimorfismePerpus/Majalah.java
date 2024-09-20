package modul3.Polimorfisme.polimorfismePerpus;

class Majalah extends Perpustakaan{
    private String edition;
    private String genre;

    @Override
    void inputDataKoleksi(String title, int releaseYear){
        super.inputDataKoleksi(title, releaseYear);
        inputDataMajalah(edition, genre);
        System.out.println("Majalah berhasil didaftarkan!");
    }

    void inputDataMajalah(String edition, String genre){
        this.edition=edition;
        this.genre=genre;
    }

    @Override
    void tampilDataKoleksi(){
        super.tampilDataKoleksi();
        System.out.println("Edisi: "+edition);
        System.out.println("Genre: "+genre);
    }
}
