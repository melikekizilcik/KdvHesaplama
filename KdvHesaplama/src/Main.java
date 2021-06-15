import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner sýnýfý oluþturma:
		Scanner input = new Scanner(System.in);
		
		//Deðiþkenler:
		double fiyat, KdvOran, KdvTutar, KdvFiyat;
		
		//Kullanýcýdan fiyat bilgisi alma:
		System.out.print("Fiyat giriniz: ");
		fiyat = input.nextDouble();
		
		
		//Koþul:
		if(fiyat <= 1000 && fiyat>= 0) {
			KdvOran = 0.18;
			KdvTutar = fiyat * KdvOran;
			KdvFiyat = fiyat + KdvTutar;
			System.out.println("KDV'siz fiyat:" + fiyat);
			System.out.println("KDV Oraný: " +KdvOran);
			System.out.println("KDV Tutarý: " +KdvTutar);
			System.out.println("KDV'li fiyat: " +KdvFiyat);
			
		}
		else if(fiyat>1000) {
			KdvOran = 0.8;
			KdvTutar = fiyat * KdvOran;
			KdvFiyat = fiyat + KdvTutar;
			System.out.println("KDV'siz fiyat:" + fiyat);
			System.out.println("KDV Oraný: " +KdvOran);
			System.out.println("KDV Tutarý: " +KdvTutar);
			System.out.println("KDV'li fiyat: " +KdvFiyat);
		}
		
	}

}
