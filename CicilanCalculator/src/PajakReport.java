
package CicilanCalculator.src;
public class PajakReport {
    private PajakCalculator calculator;

    public PajakReport(){
        this.calculator  = new PajakCalculator(100_000);
    }

    public void show(){
        double pajak = calculator.HitungPajak();
        System.out.println(pajak);
    }
}