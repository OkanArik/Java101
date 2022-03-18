import java.util.Scanner;

public class ManavKasaProgrami {
        public static void main(String[] args) {
                 // Manav Kasa Programı
                // Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
                //
                // Meyveler ve KG Fiyatları
                //
                // Armut : 2,14 TL
                // Elma : 3,67 TL
                // Domates : 1,11 TL
                // Muz: 0,95 TL
                // Patlıcan : 5,00 TL

                Scanner input = new Scanner(System.in);

                double armutKg , elmaKg , domatesKg , muzKg , patlicanKg , totalPrice ;
                double armutPricePerKg=2.14 , elmaPricePerKg=3.67 , domatesPricePerKg=1.11 , muzPricePerKg=0.95 , patlicanPricePerKg=5;

                System.out.print("Kaç kilo armut alındı? : ");
                armutKg = input.nextDouble();

                System.out.print("Kaç kilo elma aldınız? :");
                elmaKg = input.nextDouble();

                System.out.print("Kaç kilo domates aldınız? :");
                domatesKg = input.nextDouble();

                System.out.print("Kaç kilo muz aldınız? :");
                muzKg = input.nextDouble();

                System.out.print("Kaç kilo patlıcan aldınız? :");
                patlicanKg = input.nextDouble();

                totalPrice = armutKg*armutPricePerKg + elmaKg*elmaPricePerKg + domatesKg*domatesPricePerKg + muzKg*muzPricePerKg + patlicanKg*patlicanPricePerKg;

                System.out.println("Toplam tutar : "+totalPrice+" TL");

        }
}