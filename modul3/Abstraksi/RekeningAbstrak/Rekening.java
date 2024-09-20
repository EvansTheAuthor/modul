package modul3.Abstraksi.RekeningAbstrak;

abstract class Rekening {
    protected String norek;
    protected double saldo;

    public Rekening(String norek, double saldo){
        this.norek=norek;
        this.saldo=saldo;
    }

    public String getNorek() {
        return norek;
    }

    public double getSaldo() {
        return saldo;
    }

    void setor(double amount){
        if(amount>0){
            saldo+=amount;
            System.out.println("Berhasil menyetor: Rp"+amount);
        }else{
            System.out.println("Jumlah setor harus lebih dari 0");
        }
    }

    abstract void tarik(double amount);
}
