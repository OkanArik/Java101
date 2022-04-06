import java.util.Scanner;

public class MaxAndMinNumber {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n , maxNumber=0 , minNumber=0;

        System.out.print("En büyük ve en küçüklerini bulmak için kaç adet sayıyı karşılastıracaksınız : ");
        n=input.nextInt();

        int[] numberArray= new int[n];

        System.out.println("Sayıları giriniz : ");
        for(int i = 0 ; i<n ; i++)
        {
            System.out.print(i+1 +" Sayıyı giriniz : " );
            numberArray[i]=input.nextInt();
            maxNumber = numberArray[i]>maxNumber? numberArray[i]: maxNumber;
            minNumber = numberArray[i]<minNumber? numberArray[i]: minNumber;
        }
        System.out.println("En büyük sayi : "+maxNumber);
        System.out.println("En küçük sayi : "+minNumber);
         System.out.print("Girdiğiniz sayilar : ");
        for(int i =0 ; i<n ; i++)
        {
            System.out.print("\t"+numberArray[i]);
        }
    }

}


