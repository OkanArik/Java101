import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArtikYil {

    public static void artikYil(int yil)
    {
        if(yil %100 ==0)
        {
            if(yil%400==0)
                System.out.println(yil+" bir artık yıldır !");
            else
                System.out.println(yil+" bir artık yıl değildir !");
        }
        else if (yil%4==0)
            System.out.println(yil+" bir artık yıldır !");
        else
            System.out.println(yil+" bir artık yıl değildir !");
    }

    public static void main (String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);

        System.out.println("Yılı Giriniz : ");
        yil = input.nextInt();

        artikYil(yil);
    }
}


