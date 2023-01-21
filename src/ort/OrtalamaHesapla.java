
import java.util.Scanner;

public class OrtalamaHesapla {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Vize Notunu Giriniz: ");
        int vizeNotu = input.nextInt();
        System.out.print("Final Notunu Giriniz: ");
        int finalNotu = input.nextInt();

        while (vizeNotu < 0 || vizeNotu > 100 || finalNotu < 0 || finalNotu > 100) {
            System.out.print("Vize Notunu Tekrar Giriniz: ");
            vizeNotu = input.nextInt();
            System.out.print("Final Notunu Tekrar Giriniz: ");
            finalNotu = input.nextInt();
        }

        System.out.println(OrtalamaHesapla(vizeNotu, finalNotu));

    }

    public static String OrtalamaHesapla(int Vize, int Final) {

        double ortalama = (Vize * 0.4) + (Final * 0.6);

        if (ortalama >= 90 && ortalama <= 100) {
            return "AA";
        } else if (ortalama >= 85 && ortalama < 90) {
            return "BA";
        } else if (ortalama >= 80 && ortalama < 85) {
            return "BB";
        } else if (ortalama >= 75 && ortalama < 80) {
            return "CB";
        } else if (ortalama >= 70 && ortalama < 75) {
            return "CC";
        } else if (ortalama > 0 && ortalama < 70) {
            return "FD";
        } else if (ortalama == 0) {
            return "FF";
        } else {
            return "HATA";
           
        }

    }

}
