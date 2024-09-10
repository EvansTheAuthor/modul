package modul.modul2.Agregasi3;

public class Main {
    public static void main(String[] args) {
        Mesin mesin=new Mesin("Mesin V8");
        Baterai baterai=new Baterai("Baterai Lithium-ion");

        Mobil mobil=new Mobil(mesin, baterai);

        mobil.mulaiJalan();
    }
}
