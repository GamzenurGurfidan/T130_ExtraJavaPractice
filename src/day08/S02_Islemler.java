package day08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S02_Islemler {
    /*
        - Urun listeleme
        - Alisveris
        - Sepet Görüntüle
        - Ödeme
        - Cikis
     */

    Map<Integer, S01_Urun> urunler = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> sepet = new ArrayList<>();
    double tutar;

    void urunListeleme() {
        for (int i = 1; i <= urunler.size(); i++) {
            System.out.println((i + 100) + " Kodlu " + urunler.get(i + 100).getUrunAdi()+
                    " Fiyati "+ urunler.get(i +100) .getUrunFiyati() + " TL");
            System.out.println("-------------------------\n");
        }

    }

    void alisveris() {
        System.out.println("Satın almak istediginiz urunun kodunu giriniz.");
        int kod  = scanner.nextInt();
        System.out.println("Satın almak istediğiniz kiloyu giriniz");
        double kilo = scanner.nextDouble();

        System.out.println("\n" + kod + " kodlu " + urunler.get(kod).getUrunAdi() + " " + kilo + " kilo aliniyor.\n");

        String sepetUrunu = "-----------------------------\n" + kod + " kodlu " + urunler.get(kod).getUrunAdi() + " " + kilo + " kilo sepette bekliyor.\n" ;

        sepet.add(sepetUrunu);

        tutar += kilo * urunler.get(kod).urunFiyati;

    }

    void sepetGoruntuleme() {
        for (String sepettekiKurabi : sepet) {
            System.out.println(sepettekiKurabi);
        }
    }

    void odeme() {
        System.out.println("Odenecek tutar: " + tutar);
        System.out.print("Ödenen tutar: ");
        int odeme = scanner.nextInt();


        while (odeme < tutar) {
            System.out.println("\nYetersiz bakiye " + (tutar - odeme) + " TL daha ödeme yapmalısınız");
            System.out.println("Ödenen miktar: ");
            odeme = scanner.nextInt();

        }

        System.out.println("Para üstü " + (odeme - tutar) + "\n");

        System.out.println("Bizi tercih ettiginiz için teşekkür eder yine bekleriz.");

        System.exit(0);

    }


}
