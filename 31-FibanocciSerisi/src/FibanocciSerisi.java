import  java.util.Scanner;

public class FibanocciSerisi {


    public static int fibonacciSerisiNinciSayi(int n)//Recursive ile Fibonacci serisi bulma.
    {
        if(n==1 || n==2)
            return 1;

        return fibonacciSerisiNinciSayi(n-1)+fibonacciSerisiNinciSayi(n-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibanocci serisinin kaçıncı sayısını istiyorsunuz : ");

        int n=input.nextInt();
        System.out.println("Fibanocci Serisinde n. sayı : "+fibonacciSerisiNinciSayi(n));

        System.out.print(n+" elemanlı fibanocci serisi :");
        for(int i=1 ; i<=n ; i++ )
        {
            System.out.print("\t"+fibonacciSerisiNinciSayi(i));
        }
    }
}



