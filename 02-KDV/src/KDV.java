import java.util.Scanner;      //java.util.Scanner kütüphanesini programımıza import(içe aktarım) ettik.

public class KDV {
    public static void main(String[] args) {
        // KDV Tutarını Hesaplayan Program
        // Java ile kullanıcıdan alınan para değerinin KDV'li ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        // Nor: Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18, tutar 1000'den büyük ise KDV oranını %8 olarak hesaplayın.

            Scanner input = new Scanner(System.in); //Programımıza nesnesini kullanarak veri girişi yapabilmek amacıyla Scanner sınıfının nesnesini yarattık.
            System.out.print("Ürünün KDV'siz fiyatını giriniz:");
            double kdvSizFiyat = input.nextDouble();
            System.out.println("KDV'siz tutar: " + kdvSizFiyat);
            double kdvLiFiyat = kdvSizFiyat < 1000 ? (((kdvSizFiyat / 100) * 18) + kdvSizFiyat) : (((kdvSizFiyat / 100) * 8) + kdvSizFiyat);
            System.out.println("KDV'li tutar : " + kdvLiFiyat);
            double kdvFiyat = kdvSizFiyat < 1000 ? (((kdvSizFiyat) / 100) * 18) : (((kdvSizFiyat) / 100) * 8);
            System.out.println("KDV tutarı   : " + kdvFiyat);
    }
}
