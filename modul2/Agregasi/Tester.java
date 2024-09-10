package modul.modul2.Agregasi;

public class Tester {
    public static void main(String[] args) {
        Speed speed=new Speed();
        speed.setMax(120);
        Van van=new Van();

        van.setVin("abcd1233");
        van.setSpeed(speed);
        van.print();
    }
}
