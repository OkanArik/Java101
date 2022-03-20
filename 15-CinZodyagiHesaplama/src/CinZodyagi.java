import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CinZodyagi {

    public static int modOniki(int dogumyili)
    {
        return dogumyili%12;
    }

    public static String burc(int sifir_onbir)
    {
        /* Map, Java Collections Framework 'un bir üyesidir. Map (gönderim) anahtarları değerlere eşleştiren bir nesnedir.
        Örneğin, bir ad listesinde her ada bir sıra numarası vermek bir Map (gönderim) işlemidir. 
        Bu işlemde sıra numaralarının her biri bir anahtar, her ad bir değer olur. */
        
        Map<Integer,String> burclar = new HashMap<>();
        burclar.put(0,"Maymun");
        burclar.put(1,"Horoz");
        burclar.put(2,"Köpek");
        burclar.put(3,"Domuz");
        burclar.put(4,"Fare");
        burclar.put(5,"Öküz");
        burclar.put(6,"Kaplan");
        burclar.put(7,"Tavşan");
        burclar.put(8,"Ejderha");
        burclar.put(9,"Yılan");
        burclar.put(10,"At");
        burclar.put(11,"Koyun");

        return burclar.get(modOniki(sifir_onbir));
    }

    public static void main (String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz : ");

        int dogumYili = input.nextInt();
        
        if(dogumYili<2022 && dogumYili>1922)
          System.out.println("Çin zodyağı burcunuz : "+burc(dogumYılı));
        else 
          System.out.println("Geçersiz bir doğum yılı girdiniz!");
    }

}


