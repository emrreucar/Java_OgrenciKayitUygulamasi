package Java_Applications;

import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		
		OgrListe bilBolum = new OgrListe();
		int secim = -1;
		
		Scanner scanner = new Scanner(System.in);
		
		while(secim != 0) {
			System.out.println("");
			System.out.println("Bilgisayar bölümü öğrencisi kayıt uygulaması");
			System.out.println("1- Yeni Kayıt");
			System.out.println("2- Kayıt Sil");
			System.out.println("3- Kayıtları Listele");
			System.out.println("4- En Başarılı Öğrenci Bilgileri");
			System.out.println("0- Çıkış");
			System.out.print("Seçiminiz: ");
			
			secim = scanner.nextInt();
			
			if(secim == 1) {
				bilBolum.ekle();
			}
			else if(secim == 2) {
				bilBolum.sil();
			}
			else if(secim == 3) {
				bilBolum.yazdir();
			}
			else if(secim == 4) {
				bilBolum.enBasariliOgrenci();
			}
			else if(secim == 0) {
				System.out.println("Programı sonlandırdınız.");
			}
			else {
				System.out.println("Hatalı seçim yaptınız. [0-4] arası seçim yapınız.");
			}
		}

	}

}
