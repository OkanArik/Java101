import  java.util.Scanner;

public class SinifGecme {
        public static void main(String[] args) {
                 int heat;

                 Scanner input = new Scanner(System.in);

                 System.out.print("Sıcaklık giriniz :");
                 heat = input.nextInt();

                 if(heat<-10)
                         System.out.println("Hava çok soğuk evde kalmalısın.");
                 else if(heat < 5)
                         System.out.println("Kayak yapabilirsiniz.");
                 else if(heat <10)
                         System.out.println("Sinemaya gidebilirsiniz.");
                 else if(heat <15)
                         System.out.println("Sinemaya veya pikniğe gidebilirsiniz.");
                 else if(heat < 25)
                         System.out.println("Pikniğe gidebilirsiniz.");
                 else if (heat <40)
                         System.out.println("Yüzmeye gidebilirsiniz.");
                 else
                         System.out.println("Hava çok sıcak bol su tüketmelisin ve evde kalmalısın.");
        }
}