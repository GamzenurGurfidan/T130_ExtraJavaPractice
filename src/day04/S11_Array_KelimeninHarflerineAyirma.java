package day04;

import java.util.Arrays;

public class S11_Array_KelimeninHarflerineAyirma {
    public static void main(String[] args) {

        // Gökyüzü kelimesini ters ceviren bir method yazip,
        // sonra ters halini harflerine ayiran bir method daha yaziniz.

        String kelime = "Gökyüzü";

        System.out.println(kelimeyiTersCevir(kelime));
        System.out.println(Arrays.toString(ayirmaca(kelimeyiTersCevir(kelime))));
    }

    public static String kelimeyiTersCevir (String kelime){

        String tersKelime = "";

        for (int i = kelime.length()-1; i >= 0; i--) {

            tersKelime += kelime.charAt(i);

        }

        return tersKelime;
    }

    public static String[] ayirmaca (String tersKelime){

        String[] tersKelimeArr = new String[tersKelime.length()];

        for (int i = 0; i < tersKelime.length(); i++) {

            tersKelimeArr[i] = String.valueOf(tersKelime.charAt(i));

        }


        return tersKelimeArr;
    }
}
