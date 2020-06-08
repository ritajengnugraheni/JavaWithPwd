package CicilanCalculator.src;

public class PajakCalculator {
    private double pendapatan;

    public PajakCalculator (double pendapatan){
        this.pendapatan = pendapatan;
    }
    public double HitungPajak (){
        return pendapatan * 0.3 ;
    }
}