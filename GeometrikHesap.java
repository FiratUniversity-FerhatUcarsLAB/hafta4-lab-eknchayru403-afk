/*
 * Ad Soyad: HAYRUNNİSA EKİNCİ
 * Ogrenci No: 240541043
 * Tarih: 31/10/2025
 * Aciklama: GEOMETRİK HESAP SİSTEMİ
 */
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class GeometrikHesap {
    static final double pi = 3.14159;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Geometrik Hesaplama Yazdırma
        System.out.println("   GGEOMETRİK HESAPLAYICI   ");
        //Yarıcapı yazdırma
        System.out.println("Dairenin Yarıcapını Giriniz(cm):");
        double yaricap = input.nextDouble();
        input.close();
//Hesaplamalar
        //1.Dairenin Alanını Hesaplama
        double daireAlani = pi *yaricap*yaricap;
        //2.Dairenin Cevresini Hesaplama
        double daireCevre = 2*pi*yaricap;
        //3.Dairenin Capını Hesaplama
        double daireCapı = 2*yaricap;
        //4.Kure Hacmi Hesaplama
        double kureHacmi = 4.0*3.0*pi*yaricap*yaricap*yaricap;
        //5.Kure Yuzey Alani Hesaplama
        double kureYuzeyAlani = 4*pi*yaricap*yaricap;

        //Cıktı Hesaplama
        System.out.println("   HESAPLAMA SONUCLARI   ");

        System.out.printf("Dairenin Alanı:  %.2f cm^2\n",daireAlani);
        System.out.printf("Dairenin Cevresi:  %.2f cm\n",daireCevre);
        System.out.printf("Dairenin Capı:   %.2f cm\n",daireCapı);
        System.out.printf("Kurenin Hacmi:  %.2f cm^3\n",kureHacmi);
        System.out.printf("Kurenin Yuzey Alani  %.2f cm^2\n",kureYuzeyAlani);
    }
}

