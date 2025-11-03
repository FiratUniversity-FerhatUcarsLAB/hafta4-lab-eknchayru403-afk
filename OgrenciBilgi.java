/*
 * Ad Soyad: HAYRUNNİSA EKİNCİ
 * Ogrenci No: 240541043
 * Tarih: 31/10/2025
 * Aciklama: OGRENCİ BİLGİ SİSTEMİ
 */
import java.util.Scanner;
public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // OGRENCI BILGI SISTEMI
        System.out.println("  OGRENCI BILGI SISTEMI   ");
        //adI okutma
        System.out.print("Adinizi giriniz:");
        String ad = input.next();
//soyadı okutma
        System.out.print("Soyadinizi giriniz:");
        String soyad = input.next();
//ogrenci numarasını okutma(tam sayı)
        System.out.print("Öğrenci numaranizi giriniz:");
        int numara = input.nextInt();
//yas yazdırma(tam sayı)
        System.out.print("Yasinizi giriniz:");
        int yas = input.nextInt();
//GPA okutma(ondalıklı sayı)
        System.out.print("Gpa giriniz(0.00-4.00): ");
        double gpa = input.nextDouble();

        //Basarılı/Basarısız durumunu belırleme
        String durum;
        if (gpa>= 2.00)
        {durum = ("Basarılı Ogrencı");
        }
        else {durum = ("Basarısız Ogrencı");
        }
        //Ogrencı Bilgi SıstemI Cıktısı
        System.out.println("=== OGRENCİ BILGI SISTEMI ===");
        //Ad Soyad cıktısı
        System.out.println("Ad Soyad:" + ad + " " + soyad);
        // Ogrencı No cıktısı
        System.out.println("Ogrenci No:" + numara);
        //Yas cıktısı
        System.out.println("Yas:" + yas);
        //GPA cıktısı
        System.out.printf("GPA: %.2f\n", gpa);
        //Durum cıktısı
        System.out.println("Durum:" + durum);
        //Scanner kapatma
        input.close();
    }
}

