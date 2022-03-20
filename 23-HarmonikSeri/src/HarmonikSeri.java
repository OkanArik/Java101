import java.util.Scanner;

public class HarmonikSeri {
    public static double harmonikSeri(double n) {
        if(n==1)
            return 1;
        return harmonikSeri(n-1)+1/n;
    }
    public static void main (String[] args) {
        double n;

        Scanner input = new Scanner(System.in);

        System.out.println("Harmonik seri(n) ---> 1+(1/2)+(1/3)+(1/4)+.....+(1/n) şeklinde hesaplanır. ");
        System.out.print("n sayısını giriniz : ");
        n = input.nextDouble();

        System.out.println(harmonikSeri(n));
    }
}


