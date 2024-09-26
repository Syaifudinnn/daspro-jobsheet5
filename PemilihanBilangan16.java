//impor inputan
import java.util.Scanner;

public class PemilihanBilangan16 {

    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //input bilangan
        System.out.print("input bilangan\t : ");
        int bilangan = input.nextInt();
        
        //percabangan
        // if (bilangan % 2 == 0) {
        //     System.out.println(bilangan + " adalah bilangan genap");
        // }
        // else {
        //     System.out.println(bilangan + " adalah bilangan ganjil");
        // }

        //modifikasi tenary operator
        String hasil = (bilangan % 2 == 0) ? bilangan + " adalah bilangan genap" : bilangan + " adalah bilangan ganjil";
        System.out.println(hasil);

    }

}