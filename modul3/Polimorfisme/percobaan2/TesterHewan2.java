package modul.modul3.Polimorfisme.percobaan2;
import java.util.Scanner;
public class TesterHewan2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Hewan[] hewanArray=new Hewan[3];
        hewanArray[0]=new Anjing();
        hewanArray[1]=new Kucing();
        hewanArray[2]=new Kucing();

        System.out.println("Pilih hewan dari 0 hingga 2");
        System.out.print("--->");
        int choice=scanner.nextInt();

        if(choice>=0&&choice<hewanArray.length){
            hewanArray[choice].suara();
        }else{
            System.out.println("Invalid Choice!");
        }
        scanner.close();
    }
}
