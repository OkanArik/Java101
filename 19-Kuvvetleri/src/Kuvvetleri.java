import java.util.Scanner;

public class Kuvvetleri {

    public static void ikininKuvvetleri(int sayi)
    {
        for(int i=0 ; Math.pow(2,i)<=sayi ; i++)
        {
            System.out.print("\t2'nin kuvvetleri :"+"2^"+i+"="+Math.pow(2,i)+"\t");
        }
        System.out.println();
    }

    public static void dordunKuvvetleri(int sayi)
    {
        for(int i=0 ; Math.pow(4,i)<=sayi ; i++)
        {
            System.out.print("\t4'nin kuvvetleri :"+"4^"+i+"="+Math.pow(4,i)+"\t");
        }
        System.out.println();
    }

    public static void besinKuvvetleri(int sayi)
    {
        for(int i=0 ; Math.pow(5,i)<=sayi ; i++)
        {
            System.out.print("\t5'nin kuvvetleri :"+"5^"+i+"="+Math.pow(5,i)+"\t");
        }
        System.out.println();
    }

    public static void main (String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.println("Gireceğin sayıya kadar olan 2'nin , 4'ün ve 5'in kuvvetlerini olan sayıları ekrana yazıdracağız:");
        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();

        ikininKuvvetleri(sayi);
        dordunKuvvetleri(sayi);
        besinKuvvetleri(sayi);
    }
}


