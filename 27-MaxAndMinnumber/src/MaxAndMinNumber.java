import java.util.Scanner;

public class MaxAndMinNumber {
    public static int maxNumberOfNumberArray(int[] numbers,int n)
    {
        for (int i= 0 ; i<n ; i++)
        {
            numbers[0] = numbers[0] > numbers[i]? numbers[0]:numbers[i];
        }
        return numbers[0];
    }

    public static int minNumberOfNumberArray(int[] numbers,int n)
    {
        for (int i= 0 ; i<n ; i++)
        {
            numbers[0] = numbers[0] < numbers[i]? numbers[0]:numbers[i];
        }
        return numbers[0];
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n , maxNumber , minNumber;

        while(true)
        {
            System.out.println("En büyük ve en küçüklerini bulmak için kaç adet sayıyı karşılastıracaksınız : ");
            System.out.println("Çıkış yapmak istiyorsanız 0 giriniz:");

            n=input.nextInt();
            if(n<0)
            {
                System.out.println("Geçersiz değer girdiniz tekrar deneyiniz!");
                continue;
            }
            else if(n==0)
            {
                System.out.println("Güle Güle");
                break;
            }

            int[] numberArray= new int[n];

            System.out.println("Sayıları giriniz : ");
            for(int i = 0 ; i<n ; i++)
            {
                System.out.print(i+1 +" Sayıyı giriniz : " );
                numberArray[i]=input.nextInt();
            }
            maxNumber=maxNumberOfNumberArray(numberArray,n);
            minNumber=minNumberOfNumberArray(numberArray,n);
            System.out.println("En büyük sayi : "+maxNumber);
            System.out.println("En küçük sayi : "+minNumber);
            System.out.print("Girdiğiniz sayilar : ");
            for(int i =0 ; i<n ; i++)
            {
                System.out.print("\t"+numberArray[i]);
            }
            System.out.println();
        }
    }
}



