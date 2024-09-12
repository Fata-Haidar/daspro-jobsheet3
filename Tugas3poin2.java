/**
 * Tugas3poin2
 */
import java.util.Scanner;
public class Tugas3poin2 {

    public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);

        double jamKerja;
        double upahPerJam;
        double totalGaji;
        double bonusGaji;
        double gajiKotor;
        double pajakGaji;
        double gajiBersih;
        

        System.out.print("Masukkan jumlah jam kerja:");
        jamKerja = masuk.nextDouble();
        System.out.print("Masukkan upah kerja:");
        upahPerJam = masuk.nextDouble();

        totalGaji = jamKerja * upahPerJam;
        bonusGaji = 0.10 * totalGaji;
        gajiKotor = totalGaji + bonusGaji;
        pajakGaji = 0.05 * gajiKotor;
        gajiBersih = gajiKotor - pajakGaji;

        System.out.println("Total gaji: Rp " + totalGaji);
        System.out.println("Dapat bonus: Rp" + bonusGaji);
        System.out.println("Gaji kotor: Rp" + gajiKotor) ;
        System.out.println("Kena pajak: Rp" + pajakGaji);
        System.out.println("Gaji bersih: Rp" + gajiBersih);

    }
}