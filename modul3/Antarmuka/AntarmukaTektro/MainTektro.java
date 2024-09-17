package modul.modul3.Antarmuka.AntarmukaTektro;
import java.util.Scanner;
public class MainTektro {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Pilih jenis alat elektronik:");
        System.out.println("1. TV");
        System.out.println("2. Radio");
        System.out.print("Masukkan pilihan Anda: ");
        int choice=scanner.nextInt();

        AlatElektronik alatElektronik;

        if (choice==1) {
            alatElektronik=new Televisi();
        }else if(choice==2){
            alatElektronik=new Radio();
        }else{
            System.out.println("Invalid Choice!");
            return;
        }
        alatElektronik.turnOn();
        alatElektronik.turnOff();
        scanner.close();
    }
}
