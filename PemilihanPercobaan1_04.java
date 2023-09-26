import java.util.Scanner;
/**
 * PemilihanPercobaan1_04
 */
public class PemilihanPercobaan1_04 {

    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input04.nextInt();
        if (angka % 2 == 0)
        System.out.println("Angka "+angka+" bilangan genap");
        else
        System.out.println("Angka "+angka+" bilangan ganjil");
        

    }
}