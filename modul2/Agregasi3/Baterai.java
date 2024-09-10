package modul.modul2.Agregasi3;

class Baterai extends KomponenMobil{
    public Baterai(String namaBaterai){
        super(namaBaterai);
    }

    public void cekBaterai(){
        System.out.println(namaKomponen+" diperiksa.");
    }
}
