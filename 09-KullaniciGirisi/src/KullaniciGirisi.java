import  java.util.Scanner;

public class KullaniciGirisi {
        public static void main(String[] args) {
                String userName, password , currentPassword = "1234" ,currentUserName="java101";
                int count=0;

                Scanner input = new Scanner(System.in);
                while (count!=3){
                        System.out.print("Kullanıcı adını giriniz :");
                        userName = input.nextLine();
                        System.out.print("Şifrenizi giriniz :");
                        password = input.nextLine();

                        if(password.equals(currentPassword)&&userName.equals((currentUserName))) {
                                System.out.println("Giriş yaptınız!");
                                break;
                        }
                        else
                        {
                                System.out.println("Yanlış şifre yada kullanıcı adı girdiniz tekrar deneyiniz!");
                                ++count;
                                if(count ==2)
                                        System.out.println("Son hakkınız yanlış giriş yapma durumunda hesabınız bloke olur!");
                                else if(count==3)
                                {
                                        System.out.println("Hesabınız buloke oldu!");
                                        break;
                                }
                        }
                }

        }
}
