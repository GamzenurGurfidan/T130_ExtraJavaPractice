package day07;

import java.util.Scanner;

public class S22_Menu {
    static Scanner scanner = new Scanner(System.in);

    static void menu() {

        System.out.println("Alan ve cevresini hesaplamak istedigimiz sekil numarasını giriniz\n" +
                "1. Çember\n" +
                "2. Dikdörtgen\n" +
                "3. Kare\n" +
                "4. ÇIKIŞ\n" +
                "Seçiminiz: ");

        int secim = scanner.nextInt();

        switch (secim) {
            case 1:
                cemberBilgileri();
                break;
            case 2:
                dikdortgenBilgileri();
                break;

            case 3:
                kareBilgileri();
                break;

            case 4:
                System.out.println("İşlem yaptırmak için beni çalistirmayi unutma. Görüsürüz");
                break;

            default:
                System.out.println("Yanliş girdi. Tekrar deneyiniz");
                menu();
        }

    }

    private static void kareBilgileri() {
        System.out.println("Kenar uzunluğu giriniz");
        double kenar = scanner.nextDouble();

        S21_Kare kare = new S21_Kare(kenar,kenar);
        System.out.println(kare);
        menu();

    }

    private static void dikdortgenBilgileri() {
        System.out.println("Uzun kenari giriniz: ");
        double uzunKenar = scanner.nextDouble();

        System.out.println("Kisa kenari giriniz: ");
        double kisaKenar = scanner.nextDouble();

        S20_Dikdortgen dikdortgen = new S20_Dikdortgen(uzunKenar, kisaKenar);
        System.out.println(dikdortgen);
        menu();
    }

    private static void cemberBilgileri() {
        System.out.println("Çemberin yariçapini giriniz: ");
        double yaricap = scanner.nextDouble();
        S19_Cember cember = new S19_Cember(yaricap);
        System.out.println(cember);
        menu();
    }
}
