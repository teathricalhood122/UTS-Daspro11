 import java.util.Scanner;

public class PenjualanOmset {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan omzet (Rp): ");
        double omzet = input.nextDouble();

        System.out.print("Masukkan rating (1-100): ");
        int rating = input.nextInt();

        System.out.print("Apakah bersertifikasi (ya/tidak): ");
        String sertifikasi = input.next();

        // Validasi input
        if (omzet < 0 || rating < 1 || rating > 100 || 
            (!sertifikasi.equalsIgnoreCase("ya") && !sertifikasi.equalsIgnoreCase("tidak"))) {
            System.out.println("Input tidak valid.");
            return;
        }

        // Hitung komisi
        double persentase = 0;
        double bonusSertifikasi = 0;

        if (rating >= 70) {
            // Tier omzet
            if (omzet < 50000000) {
                persentase = 0.10;
            } else if (omzet < 100000000) {
                persentase = 0.20;
            } else {
                persentase = 0.30;
            }

            // Tambahan rating tinggi
            if (rating >= 90) {
                persentase += 0.01;
            }

            // Tambahan sertifikasi
            if (sertifikasi.equalsIgnoreCase("ya")) {
                bonusSertifikasi = 500000;
            }
        }

        double komisi = persentase * omzet;
        double total = komisi + bonusSertifikasi;

        // Output
        System.out.println("=-=-= Rincian Komisi =-=-=-=");
        System.out.println("Persentase akhir: " + (persentase * 100) + "%");
        System.out.println("Jumlah komisi: Rp " + komisi);
        System.out.println("Bonus sertifikasi: Rp " + bonusSertifikasi);
        System.out.println("Total komisi: Rp " + total);
    }
}

