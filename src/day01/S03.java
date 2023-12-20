package day01;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {

         /*
            Kullaniciya
            * 1 = Gunde kac bardak cay ictigini,
            * 2 = Her bardak icin kac kup seker kullandigini sorup;
            kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda consolda yazdiran bir program yazin.
            * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
            (1 kup seker = 2.77 gr)
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Günde kaç bardak çay içiyosun");
        int bardak = scanner.nextInt();

        System.out.println("Her bardak için kaç kup seker kullanıyosun");
        int seker = scanner.nextInt();

        double yillikSeker = (bardak * seker * 2.77)*365/1000;
        double kirkYillikSeker = yillikSeker * 40;

        if (seker == 0 ){
            System.out.println("Aferin, boyle devam et :)");
        }else {
            System.out.println( "Günde " + bardak + " çay içiyorsun\n" +
                                "Her cayda " + seker + " tane küp seker kullanıyorsun\n" +
                                "böylelikle yılda " + yillikSeker + " kilo seker tüketiyorsun\n" +
                                "Ve 40 yılda " + kirkYillikSeker + " kilo şeker kullanıyorsun demek oluyor");
        }


    }
}
