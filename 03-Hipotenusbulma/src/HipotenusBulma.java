import java.util.Scanner;//java.util.Scanner kütüphanesini programımıza import(içe aktarım) ettik.

public class HipotenusBulma {
    public static void main(String[] args) {
        // KDV Tutarını Hesaplayan Program
        // Java ile kullanıcıdan alınan para değerinin KDV'li ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        // Nor: Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18, tutar 1000'den büyük ise KDV oranını %8 olarak hesaplayın.

            Scanner input = new Scanner(System.in); //Programımıza nesnesini kullanarak veri girişi yapabilmek amacıyla Scanner sınıfının nesnesini yarattık.

            double a, b , c , u;//Kullanılacağım değişkenleri tanımladım.a ve b kenarları dik üçgendeki 90 derece komşu kenarların uzunluğunu atayacağımız değişkenler , c ise 90 derceye karşılık gelen kenar buna hipotenüs de denir.

            System.out.println("a ve b kenarları dik üçgendeki 90 derece komşu kenarların uzunluğunu atayacağımız değişkenler , c ise 90 derceye karşılık gelen kenar buna hipotenüs de denir.");

            System.out.print("a kenarının uzunluğunu giriniz:");
            a = input.nextDouble();

            System.out.print("b kenarının uzunluğunu giriniz:");
            b = input.nextDouble();

            c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));//Math classının sqprt methodunu karekök almak için ve pow methodunuda üs almak için kullanırız.

            System.out.println("Dik üçgenin hipotenüsü :"+c);

            //Üçgenin çevresi = 2u=a+b+c
            u=(a+b+c)/2;

            System.out.println("Üçgenin çevre uzunluğu :" + 2*u);

            //Üçgenin alanının karesi= alan*alan=u*(u-a)*(u-b)*(u-c)
            System.out.println("Üçgenin alanı :"+Math.sqrt(u*(u-a)*(u-b)*(u-c)));


    }
}
