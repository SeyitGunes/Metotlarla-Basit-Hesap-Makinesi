//        METOTLAR İLE BASİT HESAP MAKİNESİ
import java.util.Scanner;

public class Main {
    static int topla(int a, int b) {
        int toplam = a + b;
        return toplam;
    }

    static int cikar(int a, int b) {
        int cikarma = a - b;
        return cikarma;
    }

    static int bolme(int a, int b) {
        int bolum = a / b;
        return bolum;
    }

    static int carpma(int a, int b) {
        int carpım = a * b;
        return carpım;

    }

    public static void main(String[] args) {
        int a, b, giris;
        Scanner input = new Scanner(System.in);
        System.out.println("1-Toplama\n 2-Çıkarma\n 3-Bolme\n 4-Çarpma");
        giris = input.nextInt();
        System.out.println("Bir sayı giriniz: ");
        a = input.nextInt();
        System.out.println("Bir sayı giriniz: ");
        b = input.nextInt();
        if (giris == 1) {
            int sonuc = topla(a,b);
            System.out.println(sonuc);
        } else if (giris == 2) {
            int sonuc = cikar(a,b);
            System.out.println(sonuc);
        } else if (giris == 3) {
            int sonuc = bolme(a,b);
            System.out.println(sonuc);
        } else if (giris == 4) {
            int sonuc = carpma(a,b);
            System.out.println(sonuc);
        } else {
            System.out.println("geçersiz işlem");
        }
    }
}