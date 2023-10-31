import java.util.Scanner;

public class Main {
    static int power (int alt, int us) {
        int result=1;
        for(int i = 1; i<=us; i++){
            result *= alt;
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
        System.out.print("Taban değeri giriniz: ");
        int alt = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = input.nextInt();

        if (us == 0) {
            int result = 1;
            System.out.println("Sonuç: " + result);
        }else {
            System.out.println("Sonuç: " + power(alt, us));
        }
        }



    }
}
