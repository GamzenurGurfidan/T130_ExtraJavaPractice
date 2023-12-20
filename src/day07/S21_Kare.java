package day07;

public class S21_Kare extends S20_Dikdortgen {
    public S21_Kare(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "Karenin Kenarı: " + uzunKenar +
                "\nAlani: " + alanHesaplamaDik(uzunKenar,kisaKenar)+
                "\nÇevresi: " + cevreHesaplamaDik(uzunKenar,kisaKenar) + "\n";
    }
}
