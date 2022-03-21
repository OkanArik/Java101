import java.util.Arrays;
import java.util.Scanner;

public class YildizlaUcgenYapimi {

      public static void yildizlarlaUcgen(int n)
    {
        System.out.println("Yıldızlarla üçgen : ");
        int satir=n , sutun=2*n;
        for (int i = 0; i <satir; i++) {
            for (int j = 0; j <sutun; j++) {
                if(j<=n+i&&j>=n-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
    }

    public static void yildizlarlaElmasYapimi(int n)
    {
        System.out.println("Yıldızlarla elmas : ");
        int satir=n , sutun=2*n;
        for (int i = 0; i <satir; i++) {
            for (int j = 0; j <sutun; j++) {
                    if(j<=n+i&&j>=n-i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
            }
        System.out.println();
        }
        for (int i = 0; i <sutun+1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i <satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if(j>i && j<sutun-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println("------------------------------------");

    }

    public static void main (String[] args) {
        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        yildizlarlaUcgen(n);
        yildizlarlaElmasYapimi(n);
    }
}


