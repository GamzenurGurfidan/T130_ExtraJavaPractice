package day04;

import java.util.Random;
import java.util.Scanner;

public class S10_SayiTahmin {

    /* BILGISAYAR 0-100 ARASINDA BIR SAYI TUTUP, KULLANICIDAN TAHMIN ISTER
    ve KULLANICI SAYIYI BULANA KADAR "DAHA KUCUK VEYA DAHA BUYUK SAYI SÖYLE" DIYE YOL GOSTERIR
    BULUNCA KACINCI TAHMINDE BULDUGUNU YAZAR
    */

    public static void main(String[] args) {
        Random random = new Random();
        int bilgisayarinSayi = random.nextInt(100);
        System.out.println("Hadi oyun oynayalım :)");

        Scanner scanner = new Scanner(System.in);
        int kullaniciSayi = 0;
        int count = 1; // while dongusu için sayaca ihtiyac var

        do {
            if (count == 1) {
                System.out.println("0 ile 100 arasi sayi tuttum, hadi hemen tahmin et: ");
            } else if (bilgisayarinSayi > kullaniciSayi) {
                System.out.println("daha büyük sayi tahmin etmelisin");
            } else {
                System.out.println("Daha küçük sayi tahmin etmelisin");
            }
            kullaniciSayi = scanner.nextInt();

            if (kullaniciSayi == bilgisayarinSayi) {
                System.out.println("Tebrikler!! " + count + ". tahminde bildiniz!! ");
            } else {
                System.out.println("Denemeye devam etmelisin.");
            }
            count++;
        } while (bilgisayarinSayi != kullaniciSayi);

    }
}
