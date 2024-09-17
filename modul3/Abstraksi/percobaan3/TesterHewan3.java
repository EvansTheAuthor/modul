package modul.modul3.Abstraksi.percobaan3;
import java.util.Scanner;
public class TesterHewan3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Pilih hewan:");
        System.out.println("1. Anjing");
        System.out.println("2. Kucing");
        System.out.println();
        System.out.print("Masukkan pilihan Anda: ");
        int choice=scanner.nextInt();

        Hewan hewan;

        if(choice==1){
            hewan=new Anjing();
        }else if(choice==2){
            hewan=new Kucing();
        }else{
            System.out.println("Invalid Choice!");
            return;
        }

        hewan.suara();

        scanner.close();
    }
}
