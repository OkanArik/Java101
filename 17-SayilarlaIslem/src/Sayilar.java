import java.util.Scanner;

public class Sayilar {

    public static void ciftSayilar(int sayi)
    {
        System.out.println("Giriş yaptığınız sayıya kadar olan pozitif çift sayılar:");
        for (int i =2 ; i<=sayi ; i+=2)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
    }

    public static void ucVeDortTamBolunenler(int sayi)
    {
        System.out.println("Giriş yaptınız sayıya kadar olan sayılardan 3'e tam bölünen pozitif sayılar:");
        for (int i =3; i<=sayi ; i+=3)
        {
            System.out.print(i+"\t");
        }
        System.out.println();

        System.out.println("Giriş yaptınız sayıya kadar olan sayılardan 4'e tam bölünen pozitif sayılar:");
        for (int i =4; i<=sayi ; i+=4)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
    }

    public static void main (String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();

        ciftSayilar(sayi);
        ucVeDortTamBolunenler(sayi);
    }
}


