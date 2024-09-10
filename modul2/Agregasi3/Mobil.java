package modul.modul2.Agregasi3;

class Mobil {
    private Mesin mesin;
    private Baterai baterai;

    public Mobil(Mesin mesin, Baterai baterai){
        this.mesin=mesin;
        this.baterai=baterai;
    }

    public void mulaiJalan(){
        System.out.println("Mobil mulai berjalan...");
        mesin.nyalakanMesin();
        baterai.cekBaterai();
    }
}
