package day07_GeometrikSekiller;

public class S18_Sekil {
    /*
       Cember, dikdortgen ve kare sekillerinin alan ve cevre hesaplamasi yapan bir uygulama gelistiriniz.
       1-asagidaki hiyarasiye gore classlar creat ediniz...
           Sekil class(parent) <--Cember class(child)
           Sekil class(parent) <--Dikdortgen class(child)<--Kare class(child)
       2- Classlara uygun olacak sekilde yaricap, uzunluk ve genislik veriable'ler ekleyiniz.
       3- Cember Dikdortgen Karenin alan ve cevre hesaplamalarini yaptirip sonuclari Runner classta yazdiriniz.

    */

    double yaricap;
    double uzunKenar;
    double kisaKenar;

    public S18_Sekil(double yaricap) {
        this.yaricap = yaricap;
    }

    public S18_Sekil(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    double cevreHesaplama(double yaricap) {
        return 2 * yaricap * 3.14;
    }

    double alanHesaplama(double yaricap) {
        return 3.14 * (yaricap * yaricap);
    }

    double alanHesaplamaDik(double uzunKenar, double kisaKenar) {
        return uzunKenar * kisaKenar;
    }

    double cevreHesaplamaDik(double uzunKenar, double kisaKenar) {
        return 2 * (uzunKenar + kisaKenar);
    }

}
