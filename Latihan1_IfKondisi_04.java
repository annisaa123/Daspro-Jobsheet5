import java.util.Scanner;
/**
 * Latihan1_IfKondisi_04
 */
public class Latihan1_IfKondisi_04 {

    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        System.out.println("Masukkan suhu : ");
        int suhu = sc04.nextInt();

        if (suhu < 16) {
            System.out.println("Silahkan menggunakan jaket");
        }if (suhu < 20){
                System.out.println("Masukkan pakai baju tebal");
        }else {
                    System.out.println("Silahkan pakai topi");
                }
            }
        }