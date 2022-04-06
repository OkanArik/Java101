import  java.util.Scanner;

public class RecursiveMethodIleAsalSayibulma {

    public static boolean asalSayiMi(int sayi,int n)
    {
       if(n==1)
           return true;
       else if(sayi==1 || sayi%n==0)
           return false;
        return asalSayiMi(sayi,n-1);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;

        System.out.print("Pozitif tam sayi giriniz:");
        sayi=input.nextInt();

        if(asalSayiMi(sayi,sayi-1))
            System.out.println(sayi+" sayısı asal bir sayıdır.");
        else
            System.out.println(sayi+" sayısı asal bir sayı değildir.");
    }
}


