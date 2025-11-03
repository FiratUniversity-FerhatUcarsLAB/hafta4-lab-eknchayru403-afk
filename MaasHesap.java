/*
  * Ad Soyad: HAYRUNNİSA EKİNCİ
  * Ogrenci No: 240541043
  * Tarih: 31/10/2025
  * Aciklama: MAAS HESAPLAMA SİSTEMİ
  */

 import java.util.Scanner;
 import java.time.LocalDate;

 public class MaasHesap {
     public static void main(String[] args) {
         // Sabit oranlar
         final double SGK_ORANI = 0.14;
         final double GELIR_VERGISI_ORANI = 0.15;
         final double DAMGA_VERGISI_ORANI = 0.00759;
         final double AYLIK_CALISMA_SAATI_MESAI = 160; // Mesai hesabında kullanılacak
         final double AYLIK_CALISMA_SAATI_IST = 176;   // İstatistik hesabında kullanılacak
         final double AYLIK_CALISMA_GUNU = 22;

         Scanner input = new Scanner(System.in);

         // Başlık
         System.out.println("=== MAAS HESAPLAMA SISTEMI ===\n");

         // Bilgi alımı
         System.out.print("Çalışan adı soyadı: ");
         String adSoyad = input.nextLine();

         System.out.print("Brüt maaş (TL): ");
         double brutMaas = input.nextDouble();

         System.out.print("Haftalık çalışma saati: ");
         int haftalikSaat = input.nextInt();

         System.out.print("Mesai saati sayısı: ");
         int mesaiSaat = input.nextInt();

         input.close();

         // 1. GELİRLER
         double mesaiUcreti = (brutMaas / AYLIK_CALISMA_SAATI_MESAI) * mesaiSaat * 1.5;
         double toplamGelir = brutMaas + mesaiUcreti;

         // 2. KESİNTİLER
         double sgkKesintisi = toplamGelir * SGK_ORANI;
         double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
         double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
         double toplamKesinti = sgkKesintisi + gelirVergisi + damgaVergisi;

         // 3. NET MAAŞ
         double netMaas = toplamGelir - toplamKesinti;

         // 4. İSTATİSTİKLER
         double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
         double saatlikNetKazanc = netMaas / AYLIK_CALISMA_SAATI_IST;
         double gunlukNetKazanc = netMaas / AYLIK_CALISMA_GUNU;

         // ÇIKTI
         System.out.println("\n====================================");
         System.out.println("         MAAS BORDROSU");
         System.out.println("====================================");
         System.out.println("Çalışan: " + adSoyad);
         System.out.println("Tarih: " + LocalDate.now());
         System.out.println("\nGELIRLER:");
         System.out.printf("  Brüt Maaş              : %10.2f TL\n", brutMaas);
         System.out.printf("  Mesai Ücreti (%d saat) : %10.2f TL\n", mesaiSaat, mesaiUcreti);
         System.out.println("  ------------------------");
         System.out.printf("  TOPLAM GELIR           : %10.2f TL\n", toplamGelir);

         System.out.println("\nKESINTILER:");
         System.out.printf("  SGK Kesintisi (14.0%%)  : %10.2f TL\n", sgkKesintisi);
         System.out.printf("  Gelir Vergisi (15.0%%)  : %10.2f TL\n", gelirVergisi);
         System.out.printf("  Damga Vergisi (0.8%%)   : %10.2f TL\n", damgaVergisi);
         System.out.println("  ------------------------");
         System.out.printf("  TOPLAM KESINTI         : %10.2f TL%n", toplamKesinti);

         System.out.println("\nNET MAAS                 : " + String.format("%.2f TL", netMaas));

         System.out.println("\nISTATISTIKLER:");
         System.out.printf("  Kesinti Oranı          : %.1f%%\n", kesintiOrani);
         System.out.printf("  Saatlik Net Kazanç     : %.2f TL/saat\n", saatlikNetKazanc);
         System.out.printf("  Günlük Net Kazanç      : %.2f TL/gün\n", gunlukNetKazanc);
         System.out.println("====================================");
     }
 }

