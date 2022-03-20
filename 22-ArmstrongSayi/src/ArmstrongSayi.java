import java.sql.SQLOutput;
import java.util.Scanner;

public class ArmstrongSayi {

    public static int basamakSayisi(int sayi)
    {
        if(sayi<10)
            return 1;
        return basamakSayisi(sayi/10)+1;
    }


    public static int  usAlma(int sayi , int us)
    {
        if(us==1)
            return sayi;
        return usAlma(sayi,us-1)*sayi;
    }

    public static boolean isArmstong(int sayi ,int basamakSayi)
    {
        int sonuc=0 , kontrol=sayi;
        do{
            sonuc+=usAlma(kontrol%10,basamakSayi);
            kontrol/=10;
        }while(kontrol>0);
        if(sonuc == sayi)
            return true;
        else
            return false;
    }

    public static int basamakSayilariToplami(int sayi)
    {
        int sonuc=0;
        do{
            sonuc+=sayi%10;
            sayi/=10;
        }while(sayi>0);
        return sonuc;
    }

    public static void main (String[] args) {
        int sayi,basamakSayi;

        Scanner input = new Scanner(System.in);

        System.out.println("Armstrong sayı mı? ");
        System.out.print("Sayıyı giriniz : ");
        sayi = input.nextInt();

        basamakSayi = basamakSayisi(sayi);

        if(isArmstong(sayi,basamakSayi))
            System.out.println(sayi+" sayısı bir Armstrong sayıdır!");
        else
            System.out.println(sayi+" sayısı bir Armstrong sayı değildir!");

        System.out.println("Girdiğiniz sayının basamak sayılarının toplamı = "+basamakSayilariToplami(sayi));
    }
}


