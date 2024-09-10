package modul.modul2.Agregasi3;

class KomponenMobil {
    String namaKomponen;

    public KomponenMobil(String namaKomponen){
        this.namaKomponen=namaKomponen;
    }

    public void tampilkanInfo(){
        System.out.println("Komponen: "+namaKomponen);
    }
}
