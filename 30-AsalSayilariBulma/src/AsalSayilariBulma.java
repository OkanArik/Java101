import  java.util.Scanner;

public class AsalSayilariBulma {
    public  static String asalSayilar(int sayi)
    {
        String sonuc="";
        for (int i =2 ; i<=sayi ;i++)
        {
            if(asalSayiMi(i))
                sonuc+=i+" ";
        }
        return sonuc;
    }

    public static boolean asalSayiMi(int sayi)
    {
        for (int i= 2 ; i<sayi ; i++)
        {
            if(sayi%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("0 ile girdiğiniz sayı arasındaki asal sayıları bulalım;");
        System.out.print("Sayıyı giriniz :");
        int sayi=input.nextInt();

        String sonuc=asalSayilar(sayi);
        if(sonuc==" ")
            System.out.println(sayi+" ile "+0+" sayısı arasında asal sayısı yoktur.");
        else
            System.out.println(sonuc);
    }
}




