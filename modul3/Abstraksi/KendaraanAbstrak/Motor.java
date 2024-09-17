package modul.modul3.Abstraksi.KendaraanAbstrak;

public class Motor extends Kendaraan{
    private String jenisMesin;

    public Motor(String jenisMesin){
        this.jenisMesin=jenisMesin;
    }
    public void nyalakanMesin() {
        System.out.println(jenisMesin+" telah menyala...");
    }
}
