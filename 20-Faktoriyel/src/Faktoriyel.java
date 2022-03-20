import java.util.Scanner;

public class Faktoriyel {

    public static int faktoriyel(int sayi) //Recursion Method
    {
        if (sayi<=1)
            return 1;

        return faktoriyel(sayi-1)*sayi;
    }

    public static int kombinasyon(int N, int r)
    {
        return faktoriyel(N)/(faktoriyel(r)*faktoriyel(N-r));
    }

    public static void main (String[] args) {
        int sayi , N , r;

        Scanner input = new Scanner(System.in);

        System.out.print("Faktöriyelini almak istediğiniz sayıyı giriniz : ");
        sayi = input.nextInt();

        if(sayi>=0)
            System.out.println(sayi+"! = "+faktoriyel(sayi));
        else
            System.out.println("Sadece pozitif tam sayıların faktöriyel hesabı olur!");

        System.out.println("N’in r’li kombinasyonu : ");
        System.out.print("N : ");
        N = input.nextInt();
        System.out.print("r :");
        r = input.nextInt();
        System.out.println("N’in r’li kombinasyonu ="+kombinasyon(N,r));

    }
}



