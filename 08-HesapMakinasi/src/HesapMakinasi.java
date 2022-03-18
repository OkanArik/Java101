import  java.util.Scanner;

public class HesapMakinasi {
        public static void main(String[] args) {
                double number1 , number2 , result;
                int selection;

                Scanner input = new Scanner(System.in);

                while(true){
                        System.out.println("Hesap Makinesi");
                        System.out.println("1) Çarpma:");
                        System.out.println("2) Bölme");
                        System.out.println("3) Mod alma");
                        System.out.println("4) Toplama");
                        System.out.println("5) Çıkarma");
                        System.out.println("6) Uygulamadan çık!");
                        System.out.print("Yapmak istediğiniz işlemin numarasını giriniz:");
                        selection = input.nextInt();
                        if(selection==6)
                        {
                                System.out.println("Güle güle...");
                                break;
                        }
                        System.out.println("Sırasıyla işleme sokmak isyediğiniz sayıları giriniz:");
                        System.out.print("Birinci sayı :");
                        number1 = input.nextDouble();
                        System.out.print("İkinci sayı  :");
                        number2 = input.nextDouble();

                        switch (selection)
                        {
                                case 1:
                                        result=number1*number2;
                                        System.out.println(number1+"*"+number2+"="+result);//Çıktıları user friendly olması açısından seçimlere özel halde yaptım.
                                        break;
                                case 2:
                                        result=number1/number2;
                                        System.out.println(number1+"/"+number2+"="+result);
                                        break;
                                case 3:
                                        result=number1%number2;
                                        System.out.println(number1+"%"+number2+"="+result);
                                        break;
                                case 4:
                                        result=number1+number2;
                                        System.out.println(number1+"+"+number2+"="+result);
                                        break;
                                case 5:
                                        result=number1-number2;
                                        System.out.println(number1+"-"+number2+"="+result);
                                        break;
                                default:
                                        System.out.println("Geçersiz seçim yaptınız! Tekrar deneyiniz...");

                        }
                }
        }
}
