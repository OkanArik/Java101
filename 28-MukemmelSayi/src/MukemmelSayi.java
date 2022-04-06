import java.util.Scanner;

public class MukemmelSayi {

    public static String mukemmelSayiMi(int sayi)
    {
        int kontrol=0;
        for(int i=sayi-1 ; i>0 ;i-- )
        {
            kontrol= sayi%i==0 ? kontrol+=i: kontrol;
        }
        if(kontrol==sayi)
            return sayi+" mükemmel sayıdır.";
        else
            return sayi+" mükemmel sayı değildir.";
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        while(true)
        {
            System.out.println("Gireceğiniz sayı mükemmel sayımı değil mi bakalım. ");
            System.out.println("Çıkış yapmak istiyorsanız sıfır veya negatif değer giriniz:");
            System.out.print("Sayıyı giriniz :");
            sayi=input.nextInt();
            if(sayi<=0)
            {
                System.out.println("Güle Güle");
                break;
            }
            else
                System.out.println(mukemmelSayiMi(sayi));

        }
    }

}


