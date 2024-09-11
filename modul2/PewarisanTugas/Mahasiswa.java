package modul2.PewarisanTugas;

public class Mahasiswa {
    String nim;
    String nama;
    int NISN;

    public String getNim(String nim) {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNISN() {
        return NISN;
    }

    public void setNISN(int nISN) {
        NISN = nISN;
    }
}
