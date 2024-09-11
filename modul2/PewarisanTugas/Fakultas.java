package modul2.PewarisanTugas;

public class Fakultas extends Mahasiswa{
    String fakultas;
    char kdProdi;
    int semester;

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
        System.out.println("Fakultas: "+fakultas);
    }

    public char getKdProdi() {
        return kdProdi;
    }

    public void setKdProdi(char kdProdi) {
        this.kdProdi = kdProdi;
        System.out.println("Kode Prodi: "+kdProdi);
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
        System.out.println("Semester: "+semester);
    }

    void showData(){
        System.out.println("DATA MAHASISWA");
        System.out.println();
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("NISN Sekolah Asal: "+NISN);
        System.out.println("====================================");
        System.out.println("Fakultas: "+fakultas);
        System.out.println("Kode Prodi: "+kdProdi);
        System.out.println("Semester: "+semester);
    }
}
