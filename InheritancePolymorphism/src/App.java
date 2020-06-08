package InheritancePolymorphism.src;

public class App {
    public static void main(String[] args) throws Exception {
       
        // Input input = new Input();
        // Input input2 = new Input();

        // System.out.println(input.equals(input2));
        // System.out.println(input2);

        // input1 dan 2 objek yang sama 
        // TextBox textbox = new TextBox();
        // textbox.setText("Hallo guys");

        // System.out.println(textbox);
        // textbox.clear();

        // input.disable();

        // System.out.println(textbox.getText());
        // System.out.println(textbox.isEnabled());

        // Point poin1 = new Point(1, 2);
        // Point poin2 = new Point(1, 2);
        // System.out.println(poin1.equals(poin2));
        // System.out.println(poin1.hashCode());
        // System.out.println(poin2.hashCode());

        // Jika menggunakan poin1 == poin 2 akan menghasilkan false karena berasal dari alamat yang berbeda 
        // Input[] inputs = {new TextBox(), new CheckBox()};

        // for (int i =0 ; i < inputs.length; i++){
        //     inputs[i].render();
        // }

        PajakCalculator2Impl calculator = new PajakCalculator2Impl();
        PajakReport report = new PajakReport(calculator);
        
        report.show();
    }
    public static void show(Input input) {
        if (input instanceof TextBox) {
            TextBox textBox = (TextBox) input;
            textBox.setText("Text sudah diganti");
        }

        System.out.println(input);
    }
}
