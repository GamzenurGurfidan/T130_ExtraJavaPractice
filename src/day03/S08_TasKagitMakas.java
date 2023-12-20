package day03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class S08_TasKagitMakas {
    /*
        Kağıt Taşı sarar,
        Taş Makası kırar,
        Makas Kagıdı keser
     */

    public static void main(String[] args) {
        String[] names = {"Tas", "Kagıt", "Makas"};
        Random random = new Random();


        Scanner scanner = new Scanner(System.in);


        int kullanici = 0;
        int bilgisayar = 0;


        while (kullanici != 3 && bilgisayar != 3) {
            int bilgisayarTahmini = random.nextInt(names.length);

            System.out.println("0- Taş, 1- Kagıt, 2- Makas!");
            int hangisi = scanner.nextInt();

            if (bilgisayarTahmini == hangisi) {
                System.out.println("Eşit bir daha dene");
                System.out.println( "Sen: " + kullanici +
                                    ", Bilgisayar: " + bilgisayar + "\n");
            }
            if (hangisi < 0 || hangisi > 2) {
                System.out.println("Yanlıs deger girdiniz tekrar deneyiniz");
                System.out.println( "Sen: " + kullanici +
                                    ", Bilgisayar: " + bilgisayar + "\n");
            }


            if (hangisi == 0) {

                if (bilgisayarTahmini == 1) {
                    System.out.println("Kagıt Tası sarar. Yenildin!");
                    bilgisayar++;
                    System.out.println("Sen: " + kullanici +
                            ", Bilgisayar: " + bilgisayar + "\n");
                } else if (bilgisayarTahmini == 2) {
                    System.out.println("Tas Makası kırar. Kazandın Tebrikler!");
                    kullanici++;
                    System.out.println("Sen: " + kullanici +
                            ", Bilgisayar: " + bilgisayar + "\n");
                }

            } else if (hangisi == 1) {

                if (bilgisayarTahmini == 0) {
                    System.out.println("Kagıt Tası sarar. Kazandın Tebrikler!");
                    kullanici++;
                    System.out.println("Sen: " + kullanici +
                            ", Bilgisayar: " + bilgisayar + "\n");
                } else if (bilgisayarTahmini == 2) {
                    System.out.println("Makas Kagıdı keser. Yenildin!");
                    bilgisayar++;
                    System.out.println("Sen: " + kullanici +
                            ", Bilgisayar: " + bilgisayar + "\n");
                }

            } else if (hangisi == 2) {

                if (bilgisayarTahmini == 0) {
                    System.out.println("Tas Makası kırar. Yenildin!");
                    bilgisayar++;
                    System.out.println("Sen: " + kullanici +
                            ", Bilgisayar: " + bilgisayar + "\n");
                } else if (bilgisayarTahmini == 1) {
                    System.out.println("Makas Kagıdı keser. Kazandın Tebrikler!");
                    kullanici++;
                    System.out.println("Sen: " + kullanici +
                            ", Bilgisayar: " + bilgisayar + "\n");
                }
            }

            if (kullanici == 3) {
                System.out.println(kullanici + " - " + bilgisayar + " Bu elin galibi sensin");
            } else if (bilgisayar == 3) {
                System.out.println(bilgisayar + " - " + kullanici + " Bilgisayar kazandı. :(");
            }


        }

    }
}
