package day05;

import java.util.Scanner;

public class S12_ATM {
    /*
         ATM EKRANI VE ISLEMLER
    -Kullanicidan giriş için kart numarasi ve şifresini isteyin,
       eger herhangi birini yanlis girerse tekrar girmesini isteyin.
    -Kart numarasini boşluk ile girerse, eger numara doğruysa kabul edin.
    -Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri (Menu listesi) ekrana yazdirin.
    -Menu listesinde;
           Bakiye sorgulama, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis
           islemleri olacaktır.
    -Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez ve gönderilemez.
    -Para gönderme işleminde istenen iban TR ile baslamali ve toplam 10 karakter olmali,
        eger iban bu kriterlere uygun değilse menü ekranina geri donmelidir.
   - Sifre değiştirme işlemini yapmadan önce mevcut şifreyi teyit etmelidir.
     */

    static String kartno = "123456";
    static String sifre = "1234";
    static Scanner scanner = new Scanner(System.in);
    static double bakiye = 30000;
    static int hhesapNo = 98765;


    public static void main(String[] args) {
        giris();
    }

    private static void giris() {
        System.out.println("\t\t***************T130Bank***************\n" +
                "Güvenliginiz icin Kart No ve sifrenizi baskalari ile paylasmayiniz");
        System.out.println("KART NUMARANIZI GİRİNİZ");
        String kkartNo = scanner.next();
        kkartNo = kkartNo.replaceAll("\\s", "");


        System.out.print("SİFRENİZİ GİRİNİZ: ");
        String kSifre = scanner.next();
        System.out.println("");


        if (kkartNo.equals(kartno) && kSifre.equals(sifre)) {
            menu();
        } else {
            System.out.println(" Hatalı giriş yaptınız, Tekrar deneyiniz! ");
            giris();
        }

    }

    private static void menu() {
        System.out.println("Yapmak istediginiz işlemin numarasını tuslayınız:\n" +
                "1.Bakiye Sorgulama\n" +
                "2.Para Yatirma\n" +
                "3.Para Cekme\n" +
                "4.Para Gonderme\n" +
                "5.Sifre Degistirme\n" +
                "6.Cıkıs\n" +
                "SECIM: ");

        int secim = scanner.nextInt();

        switch (secim) {

            case 1:
                bakiyeSorgulama();


            case 2:
                System.out.println("Yatıracagımız miktari giriniz: ");
                double miktar = scanner.nextDouble();

                paraYatirma(miktar);


            case 3:
                System.out.println("Çekeceginiz miktarı giriniz: ");
                miktar = scanner.nextDouble();
                paraCekme(miktar);

            case 4:
                System.out.println("Göndermek istediginiz tutarı giriniz: ");
                miktar = scanner.nextDouble();
                paraGonderme(miktar);

            case 5:

                parolaDegistirme();

            case 6:
                System.out.println("Bankamızı tercih ettiğiniz için teşekkürler");
                // break;
                System.exit(0);


            default:
                System.out.println("Menude olmayan bir islem sectiniz, tekrar deneyiniz");
                menu();

        }

    }

    private static void parolaDegistirme() {
        System.out.println("Mevcut parolayı giriniz.");
        String mSifre = scanner.next();
        if (mSifre.equals(sifre)) {

            System.out.println("Yeni parolayı giriniz.");
            String newParola = scanner.next();
            System.out.println("parolayı tekrar giriniz");
            String nnewParola = scanner.next();

            if (nnewParola.equals(newParola)) {
                sifre = newParola;
                System.out.println("Yeni parolanız kaydeildi\n");
                menu();
            } else {
                System.out.println("giridğiniz iki şifre aynı değil tekrar deneyiniz");
                parolaDegistirme();
            }
        } else {
            System.out.println("mevcut sifreyi yanlıs girdiniz.\n");
            parolaDegistirme();
        }

    }

    private static void paraGonderme(double miktar) {
        // String pattern = "^TR\\d{8}$" iban yazarken tr ile baslar sadece digitlerden 8 tane yazdır ve bitir
        // Pattern.matches(pattern, iban)
        if (miktar <= bakiye) {
            System.out.println("Gondermek istediginiz hesap numarasını giriniz");
            int gonderilenHesap = scanner.nextInt();
            if (gonderilenHesap == hhesapNo) {
                System.out.println("Hesap no doğru tutar gonderiliyor...");
                bakiye -= miktar;
                bakiyeSorgulama();
            } else {
                System.out.println("Hesap no yanlış gönderim gerçekleşemedi, tekrar deneyiniz\n" +
                        "Gondermek istediğiniz tutarı giriniz");
                paraGonderme(scanner.nextDouble());
            }

        } else {
            System.out.println("Bakiyeniz yetersiz, tekrar deneyiniz" +
                    "\nGondermek istediğiniz tutarı giriniz");
            paraGonderme(scanner.nextDouble());
            // double yeniMiktar = scanner.nextDouble();
            //paraCekme(yeniMiktar);
        }


    }

    private static void paraCekme(double miktar) {
        if (miktar <= bakiye) {
            bakiye -= miktar;
            bakiyeSorgulama();
        } else {
            System.out.println("Bakiyeniz yetersiz, tekrar deneyiniz\nÇekmek istediginiz tutarı giriniz");
            paraCekme(scanner.nextDouble());
            // double yeniMiktar = scanner.nextDouble();
            //paraCekme(yeniMiktar);
        }

    }

    private static void paraYatirma(double miktar) {
        bakiye += miktar;
        bakiyeSorgulama();
    }

    private static void bakiyeSorgulama() {
        System.out.println("Bakiyeniz: " + bakiye + "\n");
        menu();

    }

}
