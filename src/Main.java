import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalPrice, km, startPrice=10, minDeger=20, startKm =2.20;
        System.out.print("Gidilen KM : ");
        km = sc.nextDouble();

        totalPrice = startPrice +(km * startKm) ;
        totalPrice = totalPrice<20 ? minDeger:totalPrice;

        System.out.println("----------------------------------");
        System.out.println("Toplam gidilen Km : "+km);
        System.out.println("Taksimetre Ücreti : "+ totalPrice);
    }
}