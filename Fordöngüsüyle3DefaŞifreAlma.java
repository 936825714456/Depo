import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int password;
        boolean isPassword = true;


        for (int i = 1; i <= 3; i++) {
            if (isPassword) {
                Scanner input = new Scanner(System.in);
                System.out.print("Şifrenizi giriniz : ");
                password = input.nextInt();

                if (password == 123) {
                    System.out.println("Doğru");
                    isPassword = false;
                } else if (i == 3) {
                    System.out.println("Yanlış tekrar deneyiniz");
                }else {
                    System.out.println("Yanlış");
                }
            }

        }

    }
}