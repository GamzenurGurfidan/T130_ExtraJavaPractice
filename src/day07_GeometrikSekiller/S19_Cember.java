package day07_GeometrikSekiller;

public class S19_Cember extends S18_Sekil {
    public S19_Cember(double yaricap) {
        super(yaricap);
    }

    @Override
    public String toString() {
        return "Cemberin yaricapı : " + yaricap +
                "\nAlani: " + alanHesaplama(yaricap) +
                "\nCevresi: " + cevreHesaplama(yaricap) +
                "\n";
    }
}
