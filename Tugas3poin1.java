/**
 * Tugas3poin1
 */

import java.util.Scanner;
public class Tugas3poin1 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        double tarifPerKwh = 1500.0;
        double totalTagihan;
        double penggunaanListirk;
        boolean melebihiBatas;

        System.out.print("Menambahkan penggunaan listrik: ");
        penggunaanListirk = inputScanner.nextDouble();

        totalTagihan = penggunaanListirk * tarifPerKwh;

        melebihiBatas = penggunaanListirk > 500;

        System.out.println("Total tagihan listrik: Rp"  + totalTagihan);
        System.out.println("Apakah penggunaan listrik melebihi batas 500 kWh ? "  + melebihiBatas);
             
    }
}