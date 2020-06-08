package InheritancePolymorphism.src;

public class PajakCalculatorImpl implements PajakCalculator {
    private double pendapatan;

    public PajakCalculatorImpl (double pendapatan){
        this.pendapatan = pendapatan;
    }
    public double HitungPajak(){
        return pendapatan * 0.2 ;
    }

    public void testing(){
        System.out.println("Testing Interface");
    }
}