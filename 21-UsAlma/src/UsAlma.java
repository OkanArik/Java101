import java.util.Scanner;

public class Faktoriyel {

    public static double pow(double sayi, double us)
    {
        if (us>=0)
        {
            if(us==0)
                return 1;
            return pow(sayi,us-1)*sayi;
        }
        else
        {
            if(us==0)
                return 1;
            return pow(sayi,us+1)*(1/sayi);
        }


    }

    public static void main (String[] args) {
        double n , r;

        Scanner input = new Scanner(System.in);

        System.out.println("Üssü alınacak sayı(n) , üs olarak alınacak sayı(r) : ");
        System.out.print("n : ");
        n = input.nextInt();
        System.out.print("r :");
        r = input.nextInt();
        System.out.println(n+"^"+r+"="+pow(n,r));

    }
}


