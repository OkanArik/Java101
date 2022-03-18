import java.util.Scanner;//java.util.Scanner kütüphanesini programımıza import(içe aktarım) ettik.

public class NotOrtalamasi {
    public static void main(String[] args) {

        // Değişkenleri oluştur:
        int matematik , fizik , kimya , turkce , tarih , muzik;

        // java nın util kütüphanesinin altındaki Scanner class'ının bir nesnesini yaratcaz bunu kullanarak console dan veri alacaz:
        Scanner input = new Scanner(System.in);//Scanner sınıfının input adında bir nesnesini yarattım.

        //Kullanıcıdan değerleri al:
        System.out.print("Matematik Notunuzu Giriniz:");//Ekrana Matematik Notunuzu Giriniz: yazırdık.
        matematik = input.nextInt();//Ekrandan girilen integer value yı , integer data type matematik variable ına assign ettik.
        System.out.println("Matematik Notunuz:"+matematik);//Ekrana Matematik Notunuz:<matematik değişkenine atadığımz değer> olacak şekilde yazdırdık.

        System.out.print("Fizik Notunuzu Giriniz:");
        fizik = input.nextInt();
        System.out.println("Fizik Notunuz:"+fizik);

        System.out.print("Kimya Notunuzu Giriniz:");
        kimya = input.nextInt();
        System.out.println("Kimya Notunuz:"+kimya);

        System.out.print("Türkçe Notunuzu Giriniz:");
        turkce = input.nextInt();
        System.out.println("Türkçe Notunuz:"+turkce);

        System.out.print("Tarih Notunuzu Giriniz:");
        tarih = input.nextInt();
        System.out.println("Tarih Notunuz:"+tarih);

        System.out.print("Müzik Notunuzu Giriniz:");
        muzik = input.nextInt();
        System.out.println("Müzik Notunuz"+muzik);

        //Notları toplucaz ve sonra ders sayısına bölerek ortalamasını bulacaz:
        double averageOfNotes=(double)(matematik+fizik+kimya+turkce+tarih+muzik)/6;

        //Not ortalamsını ekrana yazdıralım:
        System.out.println("Not Ortalamanız:"+averageOfNotes);

        //Ortalama 50 den büyükse Geçti, küçükse kaldı yazdıralım:
        String durum= averageOfNotes>=50 ? "Geçti!":"Kaldı!";//durum değişkenine averageOfNotes değişkenindeki değer 50 ye eşit veya büyükse Geçti! verisini atadık, aksi durumda ise Kaldı! verisini atadık.
        System.out.println(durum);
    }
}
