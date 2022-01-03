/*
Identitas Kode Program
NRP                 : 162020031
Nama                : Sandi Yusup Sinaga
Nama File           : MainMenu.java
Deskripsi Program   : Class MainMenu sebagai program utama tempat menjalankan program dan memanggil method
*/
package ISA205_UTSPraktikum_162020031_KodeC;
import java.util.Scanner;

public class MainMenu {
	
	//instance scanner
	static Scanner scan = new Scanner(System.in);
	//attribute untuk memilih menu
	static int pilih;

	public static void main(String[] args) {
		
		//instansiasi class Baju, Sepatu, Celana
		Baju baju1 = new Baju();
		Baju baju2 = new Baju();
		Baju baju3 = new Baju();
		Sepatu sepatu1 = new Sepatu();
		Sepatu sepatu2 = new Sepatu();
		Sepatu sepatu3 = new Sepatu();
		Celana celana1 = new Celana();
		Celana celana2 = new Celana();
		Celana celana3 = new Celana();
		
		baju1.setNamaBaju("T-Shirt");
		baju1.setHarga(50000);
		baju2.setNamaBaju("Gamis");
		baju2.setHarga(100000);
		baju3.setNamaBaju("Kemeja");
		baju3.setHarga(150000);
		sepatu1.setNamaSepatu("Sneakers");
		sepatu1.setHarga(200000);
		sepatu2.setNamaSepatu("Wedges");
		sepatu2.setHarga(175000);
		sepatu3.setNamaSepatu("Loafers");
		sepatu3.setHarga(130000);
		celana1.setNamaCelana("Levis");
		celana1.setHarga(150000);
		celana2.setNamaCelana("Chinos");
		celana2.setHarga(135000);
		celana3.setNamaCelana("Cargo");
		celana3.setHarga(100000);
		
		
		System.out.println("\t\tSelamat datang di Online Shop");
		System.out.println("Silahkan pilih jenis barang yang ingin anda beli : \n1.Baju\n2.Sepatu\n3.Celana");
		
		pilih = scan.nextInt();
		
		switch(pilih) {
		case 1:
			System.out.println("Silahkan pilih jenis barang yang ingin anda beli : \n1.T-Shirt\n2.Gamis\n3.Kemeja");
			System.out.println("Baju yang akan anda beli : ");
			pilih = scan.nextInt();
			switch(pilih) {
			case 1:
				beliBaju(baju1);
				break;
				
			case 2:
				beliBaju(baju2);
				break;
			
			case 3:
				beliBaju(baju3);
				break;
			}
			break;
		case 2:
			System.out.println("Silahkan pilih jenis barang yang ingin anda beli : \n1.Sneakers\n2.Wedges\n3.Loafers");
			System.out.println("Sepatu yang akan anda beli : ");
			pilih = scan.nextInt();
			switch(pilih) {
			case 1:
				beliSepatu(sepatu1);
				break;
				
			case 2:
				beliSepatu(sepatu2);
				break;
			
			case 3:
				beliSepatu(sepatu3);
				break;
			}
			break;
		case 3:
			System.out.println("Silahkan pilih jenis barang yang ingin anda beli : \n1.Levis\n2.Chinos\n3.Cargo");
			System.out.println("Baju yang akan anda beli : ");
			pilih = scan.nextInt();
			switch(pilih) {
			case 1:
				beliCelana(celana1);
				break;
				
			case 2:
				beliCelana(celana2);
				break;
			
			case 3:
				beliCelana(celana3);
				break;
			}
			break;
		}
		
	}
	
	public static void beliBaju(Baju baju) {
		
		System.out.println("Masukkan metode pembayaran : \n1.COD\n2.Transfer BANK\n3.OVO\n4.Gopay");
		baju.jenisPembayaran = scan.nextInt();
		switch(baju.jenisPembayaran) {

		case 1 :
			System.out.println("==============================================");
			System.out.println("Nama barang : " +baju.getNamaBaju()+ "\nTotal Harga : " +baju.getHarga());
			System.out.println("Metode Pembayaran : COD");
			break;
		case 2 :
			System.out.println("==============================================");
			System.out.println("Nama barang : " +baju.getNamaBaju()+ "\nTotal Harga : " +baju.getHarga());
			System.out.println("Metode Pembayaran : Transfer Bank");
			break;
		case 3 :
			System.out.println("==============================================");
			System.out.println("Nama barang : " +baju.getNamaBaju()+ "\nTotal Harga : " +baju.getHarga());
			System.out.println("Metode Pembayaran : OVO");
			break;
		case 4 :
			System.out.println("==============================================");
			System.out.println("Nama barang : " +baju.getNamaBaju()+ "\nTotal Harga : " +baju.getHarga());
			System.out.println("Metode Pembayaran : Gopay");
			break;
		}
	}
	
	public static void beliSepatu(Sepatu sepatu) {
			
			System.out.println("Masukkan metode pembayaran : \n1.COD\n2.Transfer BANK\n3.OVO\n4.Gopay");
			sepatu.jenisPembayaran = scan.nextInt();
			switch(sepatu.jenisPembayaran) {
	
			case 1 :
				System.out.println("==============================================");
				System.out.println("Nama barang : " +sepatu.getNamaSepatu()+ "\nTotal Harga : " +sepatu.getHarga());
				System.out.println("Metode Pembayaran : COD");
				break;
			case 2 :
				System.out.println("==============================================");
				System.out.println("Nama barang : " +sepatu.getNamaSepatu()+ "\nTotal Harga : " +sepatu.getHarga());
				System.out.println("Metode Pembayaran : Transfer BANK");
				break;
			case 3 :
				System.out.println("==============================================");
				System.out.println("Nama barang : " +sepatu.getNamaSepatu()+ "\nTotal Harga : " +sepatu.getHarga());
				System.out.println("Metode Pembayaran : OVO");
				break;
			case 4 :
				System.out.println("==============================================");
				System.out.println("Nama barang : " +sepatu.getNamaSepatu()+ "\nTotal Harga : " +sepatu.getHarga());
				System.out.println("Metode Pembayaran : Gopay");
				break;
			}
		}

	public static void beliCelana(Celana celana) {
		
		System.out.println("Masukkan metode pembayaran : \n1.COD\n2.Transfer BANK\n3.OVO\n4.Gopay");
		celana.jenisPembayaran = scan.nextInt();
		switch(celana.jenisPembayaran) {
	
		case 1 :
			System.out.println("==============================================");
			System.out.println("Nama barang : " +celana.getNamaCelana()+ "\nTotal Harga : " +celana.getHarga());
			System.out.println("Metode Pembayaran : COD");
			break;
		case 2 :
			System.out.println("==============================================");
			System.out.println("Nama barang : " +celana.getNamaCelana()+ "\nTotal Harga : " +celana.getHarga());
			System.out.println("Metode Pembayaran : Transfer BANK");
			break;
		case 3 :
			System.out.println("==============================================");
			System.out.println("Nama barang : " +celana.getNamaCelana()+ "\nTotal Harga : " +celana.getHarga());
			System.out.println("Metode Pembayaran : OVO");
			break;
		case 4 :
			System.out.println("==============================================");
			System.out.println("Nama barang : " +celana.getNamaCelana()+ "\nTotal Harga : " +celana.getHarga());
			System.out.println("Metode Pembayaran : Gopay");
			break;
		}
	}
}
