import  java.util.Scanner;

public class PolindromSayi {

    public static void polindromSayiMi(int sayi)
    {
        int kontrol=sayi,yeniSayi=0;
        while(kontrol!=0){
            yeniSayi=(yeniSayi*10)+kontrol%10;
            kontrol/=10;
        }
        if(sayi==yeniSayi)
            System.out.println(sayi+" sayısı polindrom bir sayıdır.");
        else
            System.out.println(sayi+" sayısı ploindrom bir sayı değildir.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı girin polindrom sayı mı bakalım.");
        System.out.print("Sayı giriniz : ");

        int sayi=input.nextInt();

        polindromSayiMi(sayi);
    }
}




