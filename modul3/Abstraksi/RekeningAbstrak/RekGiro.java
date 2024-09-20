package modul3.Abstraksi.RekeningAbstrak;

class RekGiro extends Rekening{
    private double overdraftLimit;

    public RekGiro(String norek, double saldo, double overdraftLimit){
        super(norek, saldo);
        this.overdraftLimit=overdraftLimit;
    }

    @Override
    void tarik(double amount){
        if(saldo+overdraftLimit>=amount){
            saldo-=amount;
            System.out.println("Berhasil menarik: Rp"+amount);
        }else{
            System.out.println("Saldo dan limit overdraft tidak mencukupi");
        }
    }
}
