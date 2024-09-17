package modul.modul3.Abstraksi.KendaraanAbstrak;
import java.util.Scanner;
public class MainKendaraan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Pilih kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println();
        System.out.print("Masukkan pilihan Anda: ");
        int choice=scanner.nextInt();

        System.out.print("Masukkan jenis mesin Anda:");
        String jenisMesin=scanner.next();

        Kendaraan kendaraan;

        if (choice==1) {
            kendaraan=new Mobil(jenisMesin);
        }else if(choice==2){
            kendaraan=new Motor(jenisMesin);
        }else{
            System.out.println("Invalid Choice!");
            return;
        }
        kendaraan.nyalakanMesin();
        kendaraan.matikanMesin();
        scanner.close();
    }
}
