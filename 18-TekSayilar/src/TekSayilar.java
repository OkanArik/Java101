import java.util.Scanner;

public class TekSayilar {

    public static void tekSayilar(int sayi)
    {
        System.out.println("Giriş yaptığınız sayıya kadar olan pozitif tek sayılar:");
        for (int i =1 ; i<=sayi ; i+=2)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
    }

    public static int ciftIseTopla(int sayi) {
        if (sayi % 2 == 0)
        {
            return sayi;
        }
        else
        {
            return 0;
        }
    }

    public static void main (String[] args) {
        int sayi,sonuc=0;
        boolean kontrol= true;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();

        tekSayilar(sayi);

        System.out.println("Gireceğin çift sayıları toplayalım sonucu verelim, sonlandırmak için herhangi bir tek sayi girmen yeterli :");
        while(true)
        {
            System.out.print("Sayı giriniz : ");
            sayi =input.nextInt();
            if(sayi%2==1)
                break;
            sonuc += ciftIseTopla(sayi);
        }
        System.out.println("Girdiğiniz çift sayıların toplamı : "+sonuc);
    }
}


