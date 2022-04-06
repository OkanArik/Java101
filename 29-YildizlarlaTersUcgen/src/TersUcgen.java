import  java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yıldızlar ters üçgen çizdirmek için istediğiniz üst üste yıldız sayısını giriniz: ");

        int yildiz=input.nextInt();

        for(int i=1 ; i<=yildiz ;i++)
        {
            for(int j=1 ; j<yildiz*2 ; j++)
            {
                if(j>=i && j<=(yildiz*2)-i )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}




