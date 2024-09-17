package modul.modul3.Antarmuka.percobaan6;
import java.util.Scanner;
public class MainMesin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Pilih jenis kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Masukkan pilihan Anda: ");
        int choice=scanner.nextInt();

        Kendaraan kendaraan;

        if(choice==1){
            kendaraan=new Mobil();
        }else if(choice==2){
            kendaraan=new Motor();
        }else{
            System.out.println("Invalid Choice!");
            return;
        }

        System.out.println("Pilih aksi yang diinginkan:");
        System.out.println("1. Nyalakan mesin");
        System.out.println("2. Matikan mesin");
        System.out.print("Masukkan pilihan Anda: ");
        int action=scanner.nextInt();

        if(action==1){
            kendaraan.startEngine();
        }else if(action==2){
            kendaraan.stopEngine();
        }else{
            System.out.println("Invalid Choice!");
        }

        scanner.close();
    }
}
