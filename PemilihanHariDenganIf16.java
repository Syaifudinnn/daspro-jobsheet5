//impor inputan
import java.util.Scanner;

public class PemilihanHariDenganIf16 {

    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        String dayType;

        //input hari
        System.out.print("input day number (1-5) : ");
        int dayNumber = input.nextInt();

        //percabangan switch case
        switch (dayNumber) {
            //kategori weekday
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                dayType = "weekday";
                break;

            //kategori weekend
            case 6:
            case 7 :
                dayType = "weekend";    
                break;

            //set default
            default:
                dayType = "invalid day number";
        }

        //output
        System.out.println(dayNumber + " is a " + dayType);

    }
    
}
