import  java.util.Scanner;

public class SinifGecme {
        public static void main(String[] args) {
                 int mat , fizik ,turkce , kimya ,muzik;
                 double averageOfNotes;

                 Scanner input = new Scanner(System.in);

                 System.out.println("Matematik notunuzu giriniz : ");
                 mat = input.nextInt();

                 System.out.println("Fizik notunuzu giriniz : ");
                 fizik = input.nextInt();

                 System.out.println("Türkçe notunuzu giriniz : ");
                 turkce = input.nextInt();

                 System.out.println("Kimya notunuzu giriniz : ");
                 kimya = input.nextInt();

                 System.out.println("Müzik notunuzu giriniz : ");
                 muzik = input.nextInt();

                 averageOfNotes = (mat+fizik+turkce+kimya+muzik)/5;

                 if(averageOfNotes<=55)
                 {
                         System.out.println("Sınıfta kaldınız seneye tekrar görüşmek üzere!");
                 }
                 else
                 {
                         System.out.println("Tebrikler sınıfı geçtiniz!");
                 }

                System.out.println("Ortalamanız : "+averageOfNotes);
        }
}