package CicilanCalculator.src;

public class Cicilan {
    private static int hargaAwal;
    private static int durasiCicilan;
    private static double bunga;
    private double sisaBayaran;

    public static int countCicilan;

    public Cicilan(int hargaAwal, int durasiCicilan, double bunga) {
        setHargaAwal(hargaAwal);
        setDurasiCicilan(durasiCicilan);
        setBunga(bunga);
        countCicilan++;
    }
    public Cicilan() {
        setHargaAwal(hargaAwal);
        setDurasiCicilan(durasiCicilan);
        setBunga(bunga);
        countCicilan++;
    }

    public static int getHargaAwal() {
        return hargaAwal;
    }

    public void setHargaAwal(int hargaAwal) {
            if (hargaAwal <= 1_000_000 && hargaAwal >= 100_000_000) {
                System.out.println("Inputan belum sesuai range"); 
            }
            Cicilan.hargaAwal = hargaAwal;    
    }

    public static int getDurasiCicilan() {
        return durasiCicilan;
    }

    public void setDurasiCicilan(int durasiCicilan) {
            if (durasiCicilan < 1) {
                System.out.println("Tahun minimal 1");
            }
            Cicilan.durasiCicilan = durasiCicilan;
           
      
    }

    public static double getBunga() {
        return bunga;
    }

    public void setBunga(double bunga) {
        if (bunga < 0) {
            System.out.println("Bunga minimal 0%");
        }
        Cicilan.bunga = bunga;

    }

    public double getSisaBayaran() {
        return sisaBayaran;
    }

    public void setSisaBayaran(double sisaBayaran) {
        this.sisaBayaran = sisaBayaran;
    }

    public static int getCountCicilan() {
        return countCicilan;
    }

    public static void setCountCicilan(int countCicilan) {
        Cicilan.countCicilan = countCicilan;
    }

}