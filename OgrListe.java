package Java_Applications;

import java.util.Scanner;

public class OgrListe {
	OgrNode head = null;
	OgrNode tail = null;
	OgrNode temp = null;
	OgrNode temp2 = null;
	
	int numara;
	String ad;
	String soyad;
	int vize;
	int fin;
	double ortalama;
	String durum;
	
	Scanner scanner = new Scanner(System.in);
	
	void ekle() 
	{
		
		System.out.println("Bilgisayar bölümüne kayıt olacak öğrencileri giriniz..");
		
		System.out.print("Numara: ");
		numara = scanner.nextInt();
		scanner.nextLine(); //Numara girilmezse hata versin.
		
		System.out.print("Ad: ");
		ad = scanner.nextLine();
		
		System.out.print("Soyad: ");
		soyad = scanner.nextLine();
		
		System.out.print("Vize: ");
		vize = scanner.nextInt();
		
		System.out.print("Final: ");
		fin = scanner.nextInt();
		
		
		OgrNode eleman = new OgrNode(numara, ad, soyad, vize, fin);
		
		if(head == null) {
			head = eleman;
			tail = eleman;
			System.out.println("İlk öğrenci eklendi");
		}
		else {
			eleman.next = head;
			head = eleman;
			System.out.println(numara + " numaralı öğrenci bölüme kayıt edildi.");
		}
		
	}
	
	void sil() 
	{
		if(head == null) {
			System.out.println("Silinecek öğrenci yok.");
		}
		else {
			System.out.print("Silmek istediğiniz öğrencinin numarasını giriniz: ");
			numara = scanner.nextInt();
			
			if(numara == head.numara && head.next == null) { //Listenin başını silmek istiyorsa
				head = null;
				tail = null;
				System.out.println(numara + " numaralı öğrenci başarıyla silindi, listede kayıtlı öğrenci kalmadı. ");
			}
			else if(numara == head.numara && head.next !=null) { //Listede birden fazla eleman var fakat ben listenin başını silmek istiyorum
				head = head.next;
				System.out.println(numara + " numaralı öğrenci başarıyla silindi. ");
			}
			else {
				temp = head;
				temp2 = head;
				while(temp.next != null) {
					temp2 = temp; //temp'den önceki düğümü tutuyor.
					temp = temp.next; //Sonsuz döngüye girmemesi için
					
					if(numara == temp.numara) { //Silmek istediğimiz eleman
						temp2.next = temp.next;
						System.out.println(numara + " numaralı öğrenci başarıyla silindi. "); 
					}
				}
				if(numara == temp.numara) { //Silmek istediğimiz eleman
					temp2.next = null;
					tail = temp2;
					System.out.println(numara + " numaralı öğrenci başarıyla silindi. "); 
				}
			}
		}
	}
	
	void yazdir()
	{
		if(head == null) {
			System.out.println("Liste boş!!!");
		}
		else {
			temp = head;
			while(temp != null) {
				System.out.println(temp.numara + " numaralı öğrenci bilgileri");
				System.out.println("************************************************");
				System.out.println("Ad:         " + temp.ad);
				System.out.println("Soyad:      " + temp.soyad);
				System.out.println("Vize Notu:  " + temp.vize);
				System.out.println("Final Notu: " + temp.fin);
				System.out.println("Ortalama:   " + temp.ortalama);
				System.out.println("Durum:      " + temp.durum);
				System.out.println("************************************************");
				temp = temp.next;
			}
		}
	}
	
	void enBasariliOgrenci()
	{
		if(head == null) {
			System.out.println("Liste boş!!!");
		}
		else {
			temp = head;
			double buyuk = temp.ortalama;
			while(temp != null) {
				if(buyuk < temp.ortalama) {
					buyuk = temp.ortalama;
					
					numara = temp.numara;
					ad = temp.ad;
					soyad = temp.soyad;
					vize = temp.vize;
					fin = temp.fin;
					ortalama = temp.ortalama;
					durum = temp.durum;
				}
				
				
				temp = temp.next;
			}
			System.out.println("En Başarılı Öğrenci Bilgileri");
			System.out.println("************************************************");
			System.out.println("Ad:         " + ad);
			System.out.println("Soyad:      " + soyad);
			System.out.println("Vize Notu:  " + vize);
			System.out.println("Final Notu: " + fin);
			System.out.println("Ortalama:   " + ortalama);
			System.out.println("Durum:      " + durum);
			System.out.println("************************************************");
		}
	}
	
	
}

