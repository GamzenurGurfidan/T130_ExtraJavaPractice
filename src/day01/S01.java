package day01;

public class S01 {
    public static void main(String[] args) {
        /*

*********************************************
                        "ATM'ye Hosgeldiniz"
            1- Bakiye Sorgulama
            2- Para Yatirma
            3- Para Cekme
            4- Menuden Cikis
**********************************************

 */
        System.out.println("**********************************************\n" +
                "\t\t\t\"ATM'ye hoşgeldiniz\"\n" +
                "1- Bakiye Sorgulama \n" +
                "2- Para Yatirma \n" +
                "3- Para Çekme \n" +
                "4- Menuden Çıkıs \n" +
                "**********************************************");

        String s= "purr";

        s.toUpperCase();

        s.trim();

        s.substring(1,3);
        System.out.println(s);

        s+=" two";
        System.out.println(s);

        System.out.println(s.length());
    }
}
