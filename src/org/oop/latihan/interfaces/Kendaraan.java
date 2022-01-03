package org.oop.latihan.interfaces;

interface Kendaraan {
	//semua adalah abstract mehthod
	void ubahGear(int Gear);
	void percepatan(int kecepatan);
	void lakukanPengereman(int rem);
	void printStatus();
}
