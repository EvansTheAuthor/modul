package modul.modul2.EnkapsulasiBank;

public class ATM {
    public static void main(String[] args) {
        RekBank nasabah=new RekBank("1234567890", "Ani Susanti");

        System.out.println("Nomor Rekening: "+nasabah.getMaskedNorek());
        nasabah.deposit(100000);
        nasabah.debit(50000);
    }
}
