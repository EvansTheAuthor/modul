package modul.modul3.Abstraksi.KendaraanAbstrak;

abstract class Kendaraan {
    abstract public void nyalakanMesin();

    public void matikanMesin(){
        System.out.println("Mesin telah dimatikan.");
    }
}
