import java.util.Scanner;//java.util.Scanner kütüphanesini programımıza import(içe aktarım) ettik.

public class TaksimetreHesabi {
        public static void main(String[] args) {
                // Dairenin Alanını ve Çevresini Hesaplayan Program
                //Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın:
                //Alan Formülü : π * r * r;
                //Çevre Formülü : 2 * π * r;
                //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
                //𝜋 sayısını = 3.14 alınız.
                //Formül : (𝜋 * (r*r) * 𝛼) / 360

                Scanner input = new Scanner(System.in);

                Double pi = 3.14, r, alan, cevre, kesitAlan, a;

                System.out.print("Alan ve çevresini hesaplamak istediğiniz dairenin yarıçapını giriniz :");
                r = input.nextDouble();

                alan = pi * r * r;
                cevre = 2 * pi * r;

                System.out.println("Dairenin alanı : "+alan);
                System.out.println("Dairenin çevresi : "+cevre);

                System.out.print("Dairenin belli merkez açısına sahip alanını hesaplamak istiyorsanın o merkez açısını giriniz, hesaplamak istemiyorsanız 0 giriniz:");
                a = input.nextDouble();

                if (a != 0) {
                        kesitAlan = (alan * a) / 360;
                        System.out.println("Merkez açısı " + a + " olan daire kesitinin alanı : " + kesitAlan);
                } else {
                        System.out.println("Kesit alan hesaplanmadı...");
                }
                System.out.println("Program sonlandırılıyor...");

        }
}
