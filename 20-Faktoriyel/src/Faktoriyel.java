import java.util.Scanner;

public class Faktoriyel {

    public static int faktoriyel(int sayi)
    {
        if (sayi<=1)
            return 1;

        return faktoriyel(sayi-1)*sayi;
    }
    public static void main (String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Faktöriyelini almak istediğiniz sayıyı giriniz : ");
        sayi = input.nextInt();

        if(sayi>=0)
            System.out.println(sayi+"! = "+faktoriyel(sayi));
        else
            System.out.println("Sadece pozitif tam sayıların faktöriyel hesabı olur!");
    }
}


