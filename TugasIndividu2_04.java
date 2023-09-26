import java.util.Scanner;
/**
 * TugasIndividu2_04
 */
public class TugasIndividu2_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int username = 101;
        int password = 444;
        System.out.println("Masukkan username dan Password");
        System.out.print("Username  : ");
        int user = input.nextInt();
        System.out.print("Password  : ");
        int pw = input.nextInt();
        if (user == username && pw == password){
            System.out.println("Selamat anda berhasil login!");
        }else{
            System.out.println("Harap cek kembali username dan password anda");
        }
        }
    }