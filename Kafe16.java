//import inputan
import java.util.Scanner;

public class Kafe16 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        String menu;
        char size;
        int jumlah;
        boolean member;

        //judul
        System.out.println("==============================");
        System.out.println("======Welcome to Kafe 16======");
        System.out.println("==============================\n");

        System.out.println("List Menu : ");
        System.out.println("- kopi\t\t : Rp 12.000");
        System.out.println("- teh\t\t : Rp 7.000");
        System.out.println("- coklat\t : Rp 20.000 \n");

        System.out.println("==============================\n");

        //input
        System.out.print("Masukkan menu pesan\t\t : ");
        menu = input.nextLine();

        System.out.print("Masukkan size cup\t\t : ");
        size = input.next().charAt(0);

        System.out.print("Masukkan jumlah pesan\t\t : ");
        jumlah = input.nextInt();

        System.out.print("Status member (true/false)\t : ");
        member = input.nextBoolean();

        System.out.println("");
        System.out.println("==============================\n");

        //logic
        //penentuan harga menu
        double harga_menu = 0;
        switch (menu.toLowerCase()) {
            case "kopi":
                harga_menu = 12000;
                break;
            case "teh":
                harga_menu = 7000;
                break;
            case "coklat":
                harga_menu = 20000;
                break;
        }

        //hitung total harga
        double total_harga = harga_menu * jumlah;

        //hitung tambahan harga berdasarkan cup size
        switch (size) {
            case 'S' :
                break;
            case 'M':
                total_harga += 0.25 * total_harga;
                break;    
            case 'L':
                total_harga += 0.40 * total_harga;
                break;
            default:
                System.out.println("size cup yg dipilih tidak tersedia");
                return;
        }

        //hitung diskon
        double diskon = member ? 0.1 : 0;

        //hitung nominal bayar
        double nominal_bayar = total_harga - (diskon * total_harga);

        //output
        System.out.println("Item pembelian\t : " + jumlah + " " + menu + " size cup " + size);
        System.out.println("Nominal bayar\t : " + nominal_bayar);

    }

}
