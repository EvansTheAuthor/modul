package modul3.Abstraksi.RekeningAbstrak;

public class MainRekening {
    public static void main(String[] args) {
        Rekening tabungan=new RekTabungan("123456", 1000000);
        Rekening deposito=new RekDeposito("123456", 1000000, System.currentTimeMillis()+60000);
        Rekening giro=new RekGiro("null", 1000000, 5000000);

        tabungan.setor(200000);
        tabungan.tarik(300000);

        giro.tarik(2500000);

        deposito.tarik(1000000);
    }
}
