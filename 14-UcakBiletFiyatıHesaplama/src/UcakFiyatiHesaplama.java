import java.util.Scanner;

public class UcakFiyatiHesaplama {

    public static double[] appMonitor()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hoşgeldiniz bilgilerinizi  giriniz!");
        double[] selections = new double[3];
        System.out.print("Mesafe (km) : ");
        selections[0]= input.nextDouble();
        System.out.print("Yaş :");
        selections[1]= input.nextDouble();
        System.out.print("Tek yön için 1 Gidiş-Dönüş için 2 girişi yapınız :");
        selections[2]= input.nextDouble();
        return selections;
    }

    public static double normalTutar(double km)
    {
        double tutar = km * 0.1 ;
        System.out.println("Normal Tutar = Mesafe * 0.10 = "+km+" * 0.10 = "+tutar+" TL");
        return tutar;
    }

    public static double yasIndirimi(double yas,double normalTutar)
    {
        double indirim,indirimOrani,indirimliFiyat;
        if(yas<12)
        {
            indirim=normalTutar/2;
            indirimOrani=0.5;
        }
        else if(yas<24)
        {
            indirim=normalTutar*0.1;
            indirimOrani=0.1;
        }
        else
        {
            indirim=normalTutar*0.3;
            indirimOrani=0.3;
        }
        indirimliFiyat=normalTutar-indirim;
        System.out.println("Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı ="+normalTutar+" * "+indirimOrani+" = "+normalTutar*indirimOrani+" TL");
        System.out.println("İndirimli Tutar = Normal Tutar – Yaş İndirimi ="+normalTutar+" - "+indirim+" = "+indirimliFiyat+" TL");
        return indirimliFiyat;
    }

    public static double ciftYonInirim(double tutar)
    {
        double indirim= tutar*0.2, indirimli=tutar*0.8;
        System.out.println("Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = "+tutar+" * 0.20 = "+indirim+" TL");
        return indirimli*2;
    }

    public static void main(String[] args){

        double[] selections= appMonitor();
        double km=selections[0],yas=selections[1],secim=selections[2],tutar, yasIndirimli;
        if(km<0 && yas<0 && (secim<0|| secim>2))
        {
            System.out.println("Hatalı giriş yaptınız !");
        }
        else{
            tutar=normalTutar(km);
            if(yas<24||yas>65)
            {
                tutar=yasIndirimi(yas,tutar);
            }

            if(secim==2)
                tutar=ciftYonInirim(tutar);

            System.out.println("Toplam Tutar ="+tutar);
        }
    }


}
