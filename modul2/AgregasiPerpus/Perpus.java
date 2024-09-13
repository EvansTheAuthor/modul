package modul.modul2.AgregasiPerpus;

public class Perpus {
    String Perpus;
    Book[] books;
    int jumlah;

    public Perpus(String Perpus, int maxBooks){
        this.Perpus=Perpus;
        this.books=new Book[maxBooks];
        this.jumlah=0;
    }

    void tambahBuku(Book book){
        if(jumlah<books.length){
            books[jumlah]=book;
            jumlah++;
        }else{
            System.out.println("Perpustakaan penuh, tidak bisa ditambah lagi koleksinya.");
        }
    }

    void tampilkanBuku(){
        System.out.println("Buku di Perpustakaan "+Perpus+":");
        for(int i=0; i<jumlah;i++){
            System.out.println("================");
            System.out.println("Judul: "+books[i].getJudul());
            System.out.println("Pengarang: "+books[i].getAuthor());
        }
    }
}
