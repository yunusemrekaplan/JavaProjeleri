import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int input = scan.nextInt();
        int num1 = input, temp, num2 = 0;
        while(input > 0) {
            temp = input % 10;
            input /= 10;
            num2 = num2 * 10 + temp;
        }
        if(num1 == num2) System.out.println("Girilen Sayı Palindrom'dur");
        else System.out.println("Girilen Sayı Palindrom Değildir");
    }
}