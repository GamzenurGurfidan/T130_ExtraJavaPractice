package day07;

public class S20_Dikdortgen extends S18_Sekil {

    public S20_Dikdortgen(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "Dikdortgen Uzun Kenar: " + uzunKenar +
                ", Kisa Kenar: " + kisaKenar +"\n" +
                "Alani: " + alanHesaplamaDik(uzunKenar,kisaKenar)+
                "\nÇevresi: " + cevreHesaplamaDik(uzunKenar,kisaKenar) + "\n";
    }
}
