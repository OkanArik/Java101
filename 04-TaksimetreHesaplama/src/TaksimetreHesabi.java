import java.util.Scanner;//java.util.Scanner kütüphanesini programımıza import(içe aktarım) ettik.

public class TaksimetreHesabi {
    public static void main(String[] args) {
            // Taksimetre Programı
            // Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
            //
            // Taksimetre KM başına 2.20 TL tutmaktadır.
            // Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
            // Taksimetre açılış ücreti 10 TL'dir.

            double pricePerKm=2.20 , distanceInKm , totalPrice =10 , result;
            int  lowestPrice=20;

            Scanner input = new Scanner(System.in);

            System.out.println("Taksimetre programı:");

            System.out.print("Taksi ile yolculuk edilen mesafeyi giriniz :");
            distanceInKm=input.nextDouble();

            totalPrice += distanceInKm*pricePerKm;

            result = totalPrice>lowestPrice ? totalPrice:lowestPrice;

            System.out.println("Taksi için ödenecek ücret : "+result);
    }
}
