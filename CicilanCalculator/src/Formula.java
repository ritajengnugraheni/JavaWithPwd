package CicilanCalculator.src;

import java.text.NumberFormat;

public class Formula {

	public static double hitungBayaranPerBulan(int hargaAwal, int durasiCicilan, double bunga) {
	    return (hargaAwal + (hargaAwal * (bunga / App.PERCENT))) / (durasiCicilan * App.BULAN_DALAM_TAHUN);
	}

	public static void hitungSisaBayaranPerBulan(int hargaAwal, int durasiCicilan, double bunga, double bayaranPerBulan) {
	    System.out.println("=== SISA PEMBAYARAN PER BULAN ===");
	    double sisaBayaran = hargaAwal + (hargaAwal * (bunga / App.PERCENT));
	    for (int i = 0; i < durasiCicilan * App.BULAN_DALAM_TAHUN; i++) {
	        sisaBayaran -= bayaranPerBulan;
	        System.out.println(NumberFormat.getCurrencyInstance().format(sisaBayaran));
	    }
	}
    
}