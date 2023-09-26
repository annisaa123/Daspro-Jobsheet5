import java.util.Scanner;
public class PemilihanPercobaan1_04_1 {

    public static void main (String[] args){
        Scanner input04 = new Scanner (System.in);

        System.out.println("Masukkan nilai:  ");
        int nilai = input04.nextInt();
        if (nilai < 75 ){
            System.out.println("Harus Remidi!!!");
        }
        else if (nilai <= 75){
            System.out.println("Selamat nilai anda mencukupi");
    }

}
}