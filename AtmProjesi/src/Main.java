import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String pass = "12345";
        int bakiye = 10000, miktar, input;
        System.out.println("****************JavaBank'a Hoş Geldiniz****************");
        System.out.println();
        System.out.println("Güncel Bakiyeniz: "+ bakiye + " TL");
        input = islemler();

        do {
            switch (input) {
                case 1:
                    System.out.println("Kac TL yatıracaksınız hesabınıza: ");
                    miktar = scan.nextInt();
                    bakiye += miktar;
                    miktar = 0;
                    System.out.println("Yeni bakiyeniz: "+ bakiye + " TL'dir.");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Kaç TL çekeceksiniz hesabınızdan: ");
                    miktar = scan.nextInt();
                    bakiye -= miktar;
                    miktar = 0;
                    System.out.println("Yeni bakiyeniz: "+ bakiye + " TL'dir.");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Bakiyeniz: "+ bakiye + "TL'dir");
                    System.out.println();
                    break;
                default:
                    System.out.println("Lütfen geçerli bir sayı giriniz...");
            }
            input = islemler();
        }while(input != 4);
        System.out.println("*************Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz*************");
    }

    public static int islemler() {
        System.out.println();
        System.out.println("1-) Para Yatır");
        System.out.println("2-) Para Çek");
        System.out.println("3-) Bakiye Sorgula");
        System.out.println("4-) Çıkış Yap");
        System.out.println("Yapmak İstediğiniz İşlemi Seçiniz: ");
        int input = scan.nextInt();
        return input;
    }
}
