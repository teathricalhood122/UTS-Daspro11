import java.util.Scanner;

public class BilanganTerkecil11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Angka Pertama: ");
        int a = sc.nextInt();

        System.out.println("Masukan Angka Kedua: ");
        int b = sc.nextInt();

        System.out.println("Masukan Angka Ketiga: ");
        int c = sc.nextInt();

        int terkecil = a;
        if (a <= b && a <= c) {
            terkecil = a;
        } else if (b <= a && b <= c) {
            terkecil = b;
        } else {
            terkecil = c;
        }
        System.out.println("Bilangan Paling Kecil Adalah: " + terkecil);

         if ((a == terkecil && b == terkecil) || (a == terkecil && c == terkecil) || (b == terkecil && c == terkecil)) {
            System.out.println("Ada beberapa angka yang sama dan merupakan nilai terkecil.");}

    }
    
}