package enkapsulasiDemo;

public class HitungGaji {
	private double gajiKotor,gajiSetelahPajak;
	public double gajiBersih;
	private double potongan=75000;
	public void setGaji(double gaji) {
		gajiKotor=gaji;
	}

	public void hitungGaji() {
		gajiSetelahPajak=gajiKotor-(0.2*gajiKotor);
		gajiBersih=gajiSetelahPajak-potongan;
	}
	
	public double getgajiKotor() {
		return gajiKotor;
	}
	
	public double getgajiBersih() {
		return gajiBersih;
	}
}


package enkapsulasiDemo;

import java.text.DecimalFormat;

public class DemoEnkapsulasi {

	public static void main(String[] args) {
		DecimalFormat digitpresisi=new DecimalFormat("0,000");
		System.out.println("\nDEMO ENKAPULASI");
		System.out.println("=================");
		HitungGaji tony=new HitungGaji();
		tony.setGaji(25000000);
		tony.hitungGaji();
		System.out.println("Informasi Gaji Pegawai");
		System.out.println("\nBesar Gaji Kotor : "+ digitpresisi.format(tony.getgajiKotor()));
		System.out.println("\nBesar Gaji Bersih : "+ digitpresisi.format(tony.getgajiBersih()));
	}
}
