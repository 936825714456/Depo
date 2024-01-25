import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String userName, password, newpassword;
       int select;


       Scanner inp = new Scanner(System.in);

       System.out.print("Kullanıcı adı : ");
       userName = inp.nextLine();

       System.out.print("Şifre : ");
       password = inp.nextLine();

       if (userName.equals("patika") && password.equals("java123")) {
           System.out.print("Giriş Yaptınız !");
       } else if (!password.equals("java123")) {
           System.out.println("Şifrenizi yanlış girdiniz !");
           System.out.println("Şifrenizi sıfırlamak istiyorsanız\n1 - Evet : \n2 - Hayır : ");
           System.out.print("Seçiminiz : ");
           select = inp.nextInt();
           switch (select) {
               case 1:
                   System.out.print("Yeni şifrenizi giriniz : ");
                   newpassword = inp.nextLine();
                   break;
               case 2:
                   System.out.print("Kullanıcı adı ve şifrenizle tekrar deneyiniz! ");
                   break;
               default:

           }
       }else {
           System.out.print("Kullanıcı adı veya şifreniz hatalı !!! ");
       }



    }
}