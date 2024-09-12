package modul2.PewarisanTugas;

public class mainMhsFak {
    public static void main(String[] args) {
        Fakultas fak=new Fakultas();

        fak.setNama("Irsyad");
        fak.setNim("090202342365");
        fak.setNISN(123405);
        fak.setFakultas("FST");
        fak.setKdProdi("SIF");
        fak.setSemester(3);
        System.out.println();
        fak.showData();
    }
}
