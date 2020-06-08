package CicilanCalculator.src;

import java.text.NumberFormat;

public class View {

	public static double readInputNumber(String message) {
	    System.out.print(message);
	    return App.scanner.nextDouble();
	}

	public static void tampilBayaran(double bayaranPerBulan) {
	    System.out.println("Pembayaran setiap bulan : " + NumberFormat.getCurrencyInstance().format(bayaranPerBulan));
	}
    
}