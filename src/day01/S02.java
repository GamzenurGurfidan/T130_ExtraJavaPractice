package day01;

public class S02 {
    public static void main(String[] args) {

        /*
        12345 sayisinin herbir basamagini konsolda altalta yazdirin.
        input: 12345
        output: 1
                2
                3
                4
                5
         */

        int sayi = 12345;

        int ilkBas = sayi % 10; //5
        int ikiBas = (sayi/10) %10;
        int ucBas = (sayi/100) %10;
        int dortBas = (sayi/1000) %10;
        int besBas = (sayi/10000) %10;

        System.out.println("input: " + sayi +
                        "\noutput: " + besBas +
                        "\n\t\t" + dortBas +
                        "\n\t\t" + ucBas +
                        "\n\t\t" + ikiBas +
                        "\n\t\t" + ilkBas );




    }
}
