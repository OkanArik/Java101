import java.util.Scanner;      //java.util.Scanner kütüphanesini programımıza import(içe aktarım) ettik.

public class KDV {
    public static void main(String[] args) {
        // KDV Tutarını Hesaplayan Program
        // Java ile kullanıcıdan alınan para değerinin KDV'li ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        // Nor: Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18, tutar 1000'den büyük ise KDV oranını %8 olarak hesaplayın.

            Scanner input = new Scanner(System.in); //Programımıza nesnesini kullanarak veri girişi yapabilmek amacıyla Scanner sınıfının nesnesini yarattık.

            double kdvSizFiyat, kdvLiFiyat,kdvFiyat,kdvOranı;//Kullanılacağım değişkenleri tanımladım.

            System.out.print("Ürünün KDV'siz fiyatını giriniz:");
            kdvSizFiyat = input.nextDouble();

            String result=kdvSizFiyat<0 ? "Geçersiz fiyat girdiniz!": "İşlemler gerçekleştiriliyor:";
            System.out.println((result));

            if(kdvSizFiyat>=0) {
                kdvOranı=kdvSizFiyat<1000?0.18:0.08;
                System.out.println("KDV oranı    :"+kdvOranı);

                System.out.println("KDV'siz tutar: " + kdvSizFiyat);

                kdvLiFiyat = kdvSizFiyat * kdvOranı + kdvSizFiyat;
                System.out.println("KDV'li tutar : " + kdvLiFiyat);

                kdvFiyat = kdvSizFiyat * kdvOranı;
                System.out.println("KDV tutarı   : " + kdvFiyat);
            }
    }
}
