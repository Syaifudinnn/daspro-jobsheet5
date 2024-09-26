//impor inputan
import java.util.Scanner;

public class PemilihanHari16 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        String dayName, dayType;

        //input hari
        System.out.print("input day name : ");
        dayName = input.nextLine();

        //percabangan switch case
        switch (dayName.toLowerCase()) {
            //kategori weekday
            case "monday" :
            case "tuesday":
            case "wednesday" :
            case "thursday" :
            case "friday" :
                dayType = "weekday";
                break;

            //kategori weekend
            case "saturday":
            case "sunday" :
                dayType = "weekend";    
                break;

            //set default
            default:
                dayType = "invalid day name";
        }

        //output
        System.out.println(dayName + " is a " + dayType);

    }

}
