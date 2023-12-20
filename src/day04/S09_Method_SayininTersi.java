package day04;

import java.util.Scanner;

public class S09_Method_SayininTersi {
    public static void main(String[] args) {
        /*
            Soru: Kullanıcıdan bir sayi alıp, sayinin tersini yazdiran bir method
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int girilenSayi = scanner.nextInt();

        System.out.println(dondurulenSayi(girilenSayi));

    }
    public static int dondurulenSayi(int sayi){

        int tersSayi = 0;

        while ( sayi != 0 ) {

            int birlerBas = sayi % 10;
            sayi = sayi / 10;
            tersSayi = tersSayi* 10 + birlerBas;

        }

        return tersSayi;
    }
}
