package modul.modul3.Abstraksi.KendaraanAbstrak;

class Mobil extends Kendaraan{
    private String jenisMesin;

    public Mobil(String jenisMesin){
        this.jenisMesin=jenisMesin;
    }

    public void nyalakanMesin() {
        System.out.println(jenisMesin+" telah menyala...");
    }
}
