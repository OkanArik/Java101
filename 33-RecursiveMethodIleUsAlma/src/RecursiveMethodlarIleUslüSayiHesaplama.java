import  java.util.Scanner;

public class RecursiveMethodlarIleUslüSayiHesaplama {

    public static int usAlma(int sayi,int us)
    {
        if(us==0)
            return 1;
        else if(us==1)
            return sayi;
        return  usAlma(sayi,us-1)*sayi;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int us, sayi;

        System.out.println("Üssünü almak istediğiniz sayı ile üssü giriniz");

        System.out.print("Üssünü almak istediğiniz sayi :");
        sayi=input.nextInt();

        System.out.print("Üs :");
        us=input.nextInt();


        System.out.println("Sonuç : "+usAlma(sayi,us));

    }
}


