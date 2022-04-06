import  java.util.Scanner;

public class FibanocciSerisi {

    public static int fibanocciSerisiNinciSayi(int n)
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;

            return fibanocciSerisiNinciSayi(n-1)+fibanocciSerisiNinciSayi(n-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibanocci serisinin kaçıncı sayısını istiyorsunuz : ");

        int n=input.nextInt();
        System.out.println("Fibanocci Serisinde n. sayı : "+fibanocciSerisiNinciSayi(n));

        System.out.print(n+" elemanlı fibanocci serisi :");
        for(int i=0 ; i<=n ; i++ )
        {
            System.out.print("\t"+fibanocciSerisiNinciSayi(i));
        }
    }
}




