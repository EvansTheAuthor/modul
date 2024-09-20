package modul3.Abstraksi.RekeningAbstrak;

class RekDeposito extends Rekening{
    private long jatuhTempo;

    public RekDeposito(String norek, double saldo, long jatuhTempo){
        super(norek, saldo);
        this.jatuhTempo=jatuhTempo;
    }

    @Override
    void tarik(double amount) {
        long currentTime=System.currentTimeMillis();
            if (currentTime>=jatuhTempo) {
                if (amount<=saldo) {
                    saldo-=amount;
                    System.out.println("Berhasil menarik: Rp"+amount);
                }else{
                    System.out.println("Saldo tidak mencukupi");
                }
            }else{
                System.out.println("Penarikan gagal, deposito belum jatuh tempo");
            }
    }
}
