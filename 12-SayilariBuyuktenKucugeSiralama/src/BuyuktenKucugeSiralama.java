import  java.util.Scanner;

public class BuyuktenKucugeSiralama {
        public static void main(String[] args) {
                 int a,b,c;

                 Scanner input = new Scanner(System.in);

                 System.out.print("Birinci sayıyı giriniz :");
                 a = input.nextInt();
                 System.out.print("İkinci sayıyı giriniz :");
                 b = input.nextInt();
                 System.out.print("Üçüncü sayıyı giriniz :");
                 c = input.nextInt();

                 if(a>b)
                 {
                         if(a>c && b>c)
                                 System.out.print(a+">"+b+">"+c);
                         else if(a>c && c>b)
                                 System.out.print(a+">"+c+">"+b);
                         else
                                 System.out.println(c+">"+a+">"+b);
                 }
                 else if(b>a)
                 {
                         if(b>c && a>c)
                                 System.out.print(b+">"+a+">"+c);
                         else if(b>c && c>a)
                                 System.out.print(b+">"+c+">"+a);
                         else
                                 System.out.println(c+">"+b+">"+a);
                 }
        }
}