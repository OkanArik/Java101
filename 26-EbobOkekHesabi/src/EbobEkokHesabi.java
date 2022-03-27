import java.util.Scanner;

public class EbobEkokHesabi {

    public static int ebob(int sayi1, int sayi2)
    {
        int kontrol , kucuk , buyuk , sonuc=1;
        if(sayi1<sayi2)
        {
            kucuk=sayi1;
            buyuk=sayi2;
        }
        else
        {
            kucuk=sayi2;
            buyuk=sayi1;
        }
        for(int i=kucuk ; i>0 ;i--)
        {
            if(kucuk%i==0 && buyuk%i==0)
            {
                sonuc= i;
                break;
            }
        }
        return sonuc;
    }

    public static int ekok(int sayi1,int sayi2)
    {
        int kontrol=1 , kucuk , buyuk , sonuc=1;
        if(sayi1==1||sayi2==1)
        {
            return 1;
        }
        else if(sayi1<sayi2)
        {
            kucuk=sayi1;
            buyuk=sayi2;
        }
        else
        {
            kucuk=sayi2;
            buyuk=sayi1;
        }
        kontrol=buyuk;
        while(true)
        {
            if(kontrol%buyuk==0 && kontrol%kucuk==0)
            {
                sonuc=kontrol;
                break;
            }
            kontrol++;
        }
        return sonuc;
    }

    public static void main (String[] args) {
       // EBOB : İki veya daha fazla sayının en büyük ortak böleni
       // EKOK : İki veya daha fazla sayının en küçük ortak katı
        int sayibir,sayiiki;
        Scanner input = new Scanner(System.in);

        System.out.println("Ebob'unu ev Ekok'unu almak istediğiniz iki sayıyı giriniz:");
        System.out.print("Sayı bir : ");
        sayibir = input.nextInt();
        System.out.print("Sayı iki : ");
        sayiiki = input.nextInt();

        System.out.println("Girdiğiniz iki sayının ebob u : "+ebob(sayibir,sayiiki));
        System.out.println("Girdiğiniz iki sayının ekok u : "+ekok(sayibir,sayiiki));
    }

}


