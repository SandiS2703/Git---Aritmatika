package org.oop.latihan.Buku;

public class Main {

	public static void main(String[] args) {
		double totalB, totalJ;
		
		Buku buku1 = new Buku("Kehidupan", "Budi Budiman", 2001, 150000);
		Buku buku2 = new Buku("Tips Sukses", "Setiawan N", 2004, 200000);
		Buku buku3 = new Buku("Kehidupan Selanjutnya", "Wati Pujiastuti", 2008, 180000);
		
		buku1.setIsi("Buku yang berisi tentang arti kehidupan");
		buku2.setIsi("Buku yang berisi tentang cara cara agar sukses");
		buku3.setIsi("Buku yang berisi tentang apa saja yang ada di kehidupan selanjutnya");
		
		System.out.println("Judul Buku : " +buku1.getJudul()+ "\nNama Pengarang : " +buku1.getPengarang()+ "\nTahun Terbit : " +buku1.getTahun()+ "\nIsi Buku : " +buku1.getIsi()+ "\nHarga Beli : " +buku1.getHarga()+ "\nHarga Jual : " +buku1.hargaJual());
		System.out.println("\nJudul Buku : " +buku2.getJudul()+ "\nNama Pengarang : " +buku2.getPengarang()+ "\nTahun Terbit : " +buku2.getTahun()+ "\nIsi Buku : " +buku2.getIsi()+ "\nHarga Beli : " +buku2.getHarga()+ "\nHarga Jual : " +buku2.hargaJual());
		System.out.println("\nJudul Buku : " +buku3.getJudul()+ "\nNama Pengarang : " +buku3.getPengarang()+ "\nTahun Terbit : " +buku3.getTahun()+ "\nIsi Buku : " +buku3.getIsi()+ "\nHarga Beli : " +buku3.getHarga()+ "\nHarga Jual : " +buku3.hargaJual());
		totalB = buku1.getHarga() + buku2.getHarga() + buku3.getHarga();
		System.out.println("\n\nTotal Harga Beli : " +totalB);
		totalJ = buku1.hargaJual() + buku2.hargaJual() + buku3.hargaJual();
		System.out.println("\nTotal Harga Jual : " +totalJ);
	}

}
