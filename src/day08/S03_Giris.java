package day08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class S03_Giris extends S02_Islemler {

    Scanner scanner = new Scanner(System.in);

    void menu() {

        S01_Urun urun1 = new S01_Urun("Protakalli Kurabiye", 10);
        S01_Urun urun2 = new S01_Urun("Browni", 20);
        S01_Urun urun3 = new S01_Urun("Cevizli Kurabiye", 30);
        S01_Urun urun4 = new S01_Urun("Elmali Kurabiye", 15);
        S01_Urun urun5 = new S01_Urun("Diyet Kurabiye", 15);

        urunler.put(101, urun1);
        urunler.put(102, urun2);
        urunler.put(103, urun3);
        urunler.put(104, urun4);
        urunler.put(105, urun5);

        System.out.println("********** E-KURABİYE **********");
        System.out.println("Yapmak istediğiniz işlemi seçiniz." +
                " 1. Urun listeleme\n" +
                " 2. Alisveris\n" +
                " 3. Sepet Görüntüle\n" +
                " 4. Ödeme\n" +
                " Q. Cikis");

        int secim = scanner.nextInt();

        try {


            switch (secim) {
                case 1:
                    urunListeleme();
                    menu();
                case 2:
                    alisveris();
                    menu();
                case 3:
                    sepetGoruntuleme();
                    menu();
                case 4:
                    odeme();
                    menu();
                default:
                    System.out.println("Hatali giriş yaptınız");
                    menu();


            }

        } catch (InputMismatchException e) {

            if (scanner.next().equalsIgnoreCase("Q")){
                System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz.");
            }

        }
    }
}
