package day08;

public class S01_Urun {
    /*
    * Kurabiye satis programi yaziniz.
   - Urun listesini olusturun.
   - Programda; listeleme, ürün secip sepete atma ve satin alma islemleri olsun
   - Müsteriye ürün kodunu ve satin almak istedigi kiloyu sorun.
   - Baska bir urun almak isteyip istemedigini sorun. Istemiyorsa toplam ödenecek miktari yazdirin,
        istiyorsa tekrar urun sectirin. Bu islemi alisverisi bitirmek isteyene kadar tekrarlatin.
   - Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekleyin.
   - Alisveris bitince toplam odemesi gereken tutari gosterin ve nakit girisini rakam olarak isteyin.
   - Ödeme sirasinda gerekiyorsa Para üstü verin
   - Programi sonlandirin
 */
    String urunAdi;
    double urunFiyati;

    public S01_Urun(String urunAdi, double urunFiyati) {
        this.urunAdi = urunAdi;
        this.urunFiyati = urunFiyati;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public double getUrunFiyati() {
        return urunFiyati;
    }
}
