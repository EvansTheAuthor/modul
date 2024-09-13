package modul.modul2.EnkapsulasiBank;

public class RekBank {
    //data sensitif yang modifier aksesnya di-private
    private String norek;
    private double saldo;
    private String nasabah;

    public RekBank(String norek, String nasabah){
        this.norek=norek;
        this.nasabah=nasabah;
        this.saldo=0.0;
    }

    public String getNorek() {
        return norek;
    }

    public String getNasabah() {
        return nasabah;
    }
    
    public double getSaldo() {
        return saldo;
    }

    void deposit(double jumlah){
        if(jumlah>0){
            saldo+=jumlah;
            System.out.println("Berhasil menyetorkan sejumlah "+jumlah);
        }else{
            System.out.println("Jumlah setoran harus lebih besar dari 0");
        }
    }

    void debit(double jumlah){
        if(jumlah>0&&jumlah<=saldo){
            saldo-=jumlah;
            System.out.println("Berhasil menarik sejumlah "+jumlah);
        }else{
            System.out.println("Jumlah penarikan tidak valid atau saldo tidak cukup");
        }
    }

    public String getMaskedNorek(){
        return "****"+norek.substring(norek.length()-4);
    }
}
