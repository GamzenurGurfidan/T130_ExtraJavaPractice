package day02;

import java.util.Scanner;

public class S04_Substring {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // adinin ilk harfi buyuk digerleri kucuk,
        // soyadinin tamami büyük harfle yazacak sekilde
        // ad ayrı soyad ayrı sekilde alt alta ekrana yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen adınızı soyadınızı yazınız ");
        String adSoyad = scanner.nextLine();

        String ad = adSoyad.substring(0,adSoyad.indexOf(" "));
        String soyad = adSoyad.substring(adSoyad.indexOf(" ")+1);

        System.out.println(ad.toUpperCase().charAt(0) + ad.toLowerCase().substring(1)
         + "\n" + soyad.toUpperCase());

    }
}
