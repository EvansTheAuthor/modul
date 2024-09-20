package modul3.Abstraksi.RekeningAbstrak;

class RekTabungan extends Rekening{
    private double biayaAdmin=5000;

    public RekTabungan(String norek, double saldo){
        super(norek, saldo);
    }

    @Override
    void tarik(double amount){
        if(amount+biayaAdmin<=saldo){
            saldo-=(amount+biayaAdmin);
            System.out.println("Berhasil menarik: Rp"+amount);
            System.out.println("Biaya Administrasi: Rp"+biayaAdmin);
        }else{
            System.out.println("Saldo tidak cukup untuk melakukan penarikan");
        }
    }
}
