package day03;

import java.util.Arrays;

public class S07_Arrays {
    // İlkbahardan başlayarak 4 mevsim array olusturun,
    // yazdan geriye doğru mevsimleri siralayın
    public static void main(String[] args) {
        String[] mevsimler = {"İlkbahar", "Yaz", "Sonbahar", "Kış"};

        System.out.println(Arrays.toString(mevsimler));

        String boskova = mevsimler[0];
        mevsimler[0] = mevsimler[1];
        mevsimler[1] = boskova;
        boskova = mevsimler[2];
        mevsimler[2] = mevsimler[3];
        mevsimler[3] = boskova;


        System.out.println(Arrays.toString(mevsimler));
    }
}
