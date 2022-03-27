import java.util.Scanner;

public class AtmProgrami {

    public static void main (String[] args) {
       String userName , password;
       int balance=1500 , right=3 , selection, exit=0, amount;

       Scanner input = new Scanner(System.in);

        while(right>0)
        {
            System.out.print("Kullanıcı adınınız : ");
            userName=input.nextLine();

            System.out.print("Parolanız :");
            password =input.nextLine();
            if(userName.equals("Patika")&&password.equals("123"))
            {
                System.out.println("Merhaba kodluyoruz bankasına hoşgeldiniz.");
                do
                {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
                    System.out.println(
                            "1 Para yatırma\n"+
                                    "2 Para çekme\n"+
                                    "3 Bakiye sorgula\n"+
                                    "4 Çıkış yap"
                    );
                    System.out.print("Seçim : ");
                    selection =input.nextInt();

                    switch (selection)
                    {
                        case 1:
                            System.out.print("Para miktarı :");
                            balance+=input.nextInt();
                            System.out.println("Yeni bakiye : "+balance);
                            break;
                        case 2:
                            System.out.print("Para miktarı :");
                            amount=input.nextInt();
                            if(amount>balance)
                            {
                                System.out.println("Yetersiz bakiye!");
                                break;
                            }
                            balance-=amount;
                            System.out.println("Yeni bakiye : "+balance);
                            break;
                        case 3:
                            System.out.println("Bakiye : "+balance);
                            break;
                        case 4:
                            System.out.println("Güle Güle");
                            exit++;
                            break;
                        default:
                            System.out.println("Geçersiz seçim yaptınız tekrar deneyiniz:");
                            break;
                    }
                }while(selection!=4);

            }else
            {
                right--;
                System.out.println("Hatalı kullanıcı adı yada şifre. ");
                if(right==0)
                {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz!");
                }
                else
                {
                    System.out.println("Tekrar deneyiniz! Kalan hakkınız : "+ right);
                }
            }
            if(exit==1)
                break;
        }
    }

}


