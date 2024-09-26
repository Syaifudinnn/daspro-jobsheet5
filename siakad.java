//import inputan
import java.util.Scanner;

public class siakad {

    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi nilai tetap
        double nilai_setara = 0;
        String nilai_huruf = "";
        String kualifikasi = "";

        //judul
        System.out.println("=========================================");
        System.out.println("=============Aplikasi SiAkad=============");
        System.out.println("=========================================");

        //input nama, nim, kelas, no absen
        System.out.println("");

        System.out.print("Masukkan nama mahasiswa\t\t : ");
        String nama = input.nextLine();

        System.out.print("Masukkan nim\t\t\t : ");
        String nim = input.nextLine();

        System.out.print("Masukkan kelas\t\t\t : ");
        char kelas = input.next().charAt(0);

        System.out.print("Masukkan no. absen\t\t : ");
        byte absen = input.nextByte();

        //input kuis, tugas, ujian
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");

        System.out.print("Masukkan nilai kuis\t\t : ");
        double nilaiKuis = input.nextDouble();

        System.out.print("Masukkan nilai tugas\t\t : ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS\t\t : ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan nilai UAS\t\t : ");
        double nilaiUAS = input.nextDouble();

        //logic
        double nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35);

        //definisi nilai huruf, nilai setara, dan kualifikasi
        if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
            nilai_huruf = "A";
            nilai_setara = 4;
            kualifikasi = "Sangat Baik";
        }
        else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
            nilai_huruf = "B+";
            nilai_setara = 3.5;
            kualifikasi = "Lebih dari Baik";
        }
        else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
            nilai_huruf = "B";
            nilai_setara = 3;
            kualifikasi = "Baik";
        }
        else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
            nilai_huruf = "C+";
            nilai_setara = 2.5;
            kualifikasi = "Lebih dari Cukup";
        }
        else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
            nilai_huruf = "C";
            nilai_setara = 2;
            kualifikasi = "Cukup";
        }
        else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
            nilai_huruf = "D";
            nilai_setara = 1;
            kualifikasi = "Kurang";
        }
        else if (nilaiAkhir <= 39) {
            nilai_huruf = "E";
            nilai_setara = 0;
            kualifikasi = "Gagal";
        }

        //output
        System.out.println("");
        System.out.println("==================Hasil==================");
        System.out.println("");

        System.out.println("Nama\t : " + nama + "\t\t NIM\t : " + nim);
        System.out.println("Kelas\t : " + kelas + "\t\t Absen\t : " + absen);
        System.out.println("Nilai Akhir\t : " + nilaiAkhir);
        System.out.println("Nilai Huruf\t : " + nilai_huruf);
        System.out.println("Nilai Setara\t : " + nilai_setara);
        System.out.println("Kualifikasi\t : " + kualifikasi);

    }
    
}