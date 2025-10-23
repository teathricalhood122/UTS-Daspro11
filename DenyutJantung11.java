import java.util.Scanner;

public class DenyutJantung11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Umur Anda: ");
        int umur = sc.nextInt();

        System.out.println("Masukan Detak Jantung Saat Latihan: ");
        int detakJantung = sc.nextInt();

        if(umur < 10 || umur > 100) {
            System.out.println("Masukan Umur Dengan Tepat Tidak kurang dari 10 dan Tidak Lebih Dari 100 Ya!");
        } else if (detakJantung <= 0 ){
            System.out.println("Masukan Detak Jantung Dengan Tepat Ya, Bilangan Tidak Boleh Negatif");
        } else {
            int mhr = 220-umur;
            double persenmhr = ((double) detakJantung/mhr)*100;
            long persenmhrbulat = Math.round(persenmhr);

            String Kategori = "";
            String Saran = "";

            if(persenmhr < 50) {
            Kategori = "Sangat Ringan";
            Saran = "Pemanasan, Manfaat Ringan";    
            } else if (persenmhr<60){
                Kategori = "Ringan";
                Saran = "Peningkatan Dasar Kebugaran";
            } else if (persenmhr < 70){
                Kategori = "Sedang";
                Saran = "Zona Aerobik Nyaman";
            }else if (persenmhr < 80){
                Kategori = "kuat";
                Saran = "Meningkatkan kapasitas kardiorespirasi.";
            } else {
                Kategori = "Sangat Berat";
                Saran = "Beresiko Bagi Pemula, Batasi Durasi";
            }
           
            System.out.println("=-=-= Hasil Analisis Latihan =-=-=");
            System.out.println("Detak Jantung Maksimal(MHR) " + mhr + "bpm");
            System.err.println("Presentase MHR anda " + persenmhrbulat + "%");
            System.out.println("kategori " + Kategori);
            System.out.println("Saran " + Saran);
        }


    }
}
