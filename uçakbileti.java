import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int age, yolculukTipi;
        double kmFiyati = 0.10, normalTutar, km, ageIndirimi, ageIndirimTutari, indirimliTutar, yolculukTipiIndirimi, yolculukTipiIndirimOrani = 0.20, toplamTutar, ageIndirimOrani = 0.0;


        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz : ");
        yolculukTipi = input.nextInt();



        normalTutar = km * kmFiyati;
        ageIndirimi = normalTutar * ageIndirimOrani;
        indirimliTutar = normalTutar - ageIndirimi;
        yolculukTipiIndirimi = indirimliTutar * yolculukTipiIndirimOrani;
        toplamTutar = 


        if((age >=0) && (age < 12)){
            ageIndirimOrani = 0.5;
        }else if ((age >=12) && (age <=24)){
            ageIndirimOrani = 0.10;
        }else if(age > 65){
            ageIndirimOrani = 0.30;
        }
        if (yolculukTipi == 1){
        yolculukTipiIndirimi = 1;
        }else if(yolculukTipi ==2){
            yolculukTipiIndirimi = 0.20;
        }







    }
}