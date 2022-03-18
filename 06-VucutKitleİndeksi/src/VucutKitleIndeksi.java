import java.util.Scanner;

public class VucutKitleIndeksi {
        public static void main(String[] args) {
                //Vücut Kitle İndeksi Hesaplama
                //Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
                //Formül
                //Kilo (kg) / Boy(m) * Boy(m)

                Scanner girdi = new Scanner(System.in);

                double vucutKitleIndeksi , boy ,  kilo;

                System.out.print("Lütfen (kg cinsinden) kilonuzu giriniz : ");
                kilo = girdi.nextDouble();

                System.out.print("Lütfen (metre cinsinden) boyunuzu giriniz : ");
                boy = girdi.nextDouble();

                vucutKitleIndeksi = kilo/(Math.pow(boy,2));

                System.out.println("Vücut kitle indeksiniz : "+vucutKitleIndeksi);
        }
}