package CicilanCalculator.src;

import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);
    static final int BULAN_DALAM_TAHUN = 12;
    static final int PERCENT = 100;
    public static Cicilan cicil2 = new Cicilan();

    public static void main(String[] args) throws Exception {
        // Cicilan cicil2 = new Cicilan();
        Menu.MenuUtama();

        double bayaranPerBulan = Formula.hitungBayaranPerBulan(cicil2.getHargaAwal(), cicil2.getDurasiCicilan(),
                cicil2.getBunga());

        View.tampilBayaran(bayaranPerBulan);

        Formula.hitungSisaBayaranPerBulan(cicil2.getHargaAwal(), cicil2.getDurasiCicilan(), cicil2.getBunga(),
                bayaranPerBulan);

        
    }
}
