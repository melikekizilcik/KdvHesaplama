import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner s�n�f� olu�turma:
		Scanner input = new Scanner(System.in);
		
		//De�i�kenler:
		double fiyat, KdvOran, KdvTutar, KdvFiyat;
		
		//Kullan�c�dan fiyat bilgisi alma:
		System.out.print("Fiyat giriniz: ");
		fiyat = input.nextDouble();
		
		
		//Ko�ul:
		if(fiyat <= 1000 && fiyat>= 0) {
			KdvOran = 0.18;
			KdvTutar = fiyat * KdvOran;
			KdvFiyat = fiyat + KdvTutar;
			System.out.println("KDV'siz fiyat:" + fiyat);
			System.out.println("KDV Oran�: " +KdvOran);
			System.out.println("KDV Tutar�: " +KdvTutar);
			System.out.println("KDV'li fiyat: " +KdvFiyat);
			
		}
		else if(fiyat>1000) {
			KdvOran = 0.8;
			KdvTutar = fiyat * KdvOran;
			KdvFiyat = fiyat + KdvTutar;
			System.out.println("KDV'siz fiyat:" + fiyat);
			System.out.println("KDV Oran�: " +KdvOran);
			System.out.println("KDV Tutar�: " +KdvTutar);
			System.out.println("KDV'li fiyat: " +KdvFiyat);
		}
		
	}

}
