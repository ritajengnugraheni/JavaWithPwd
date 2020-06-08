package InheritancePolymorphism.src;

public class TextBox extends Input {
    private String text = "";

    public TextBox(
        // boolean isEnabled, String Text
        ){
        // super(isEnabled);
        // this.text = text;
        System.out.println("Ini Text Box");
    }


    public String getText(){
        return this.text;
    }
    public void setText(String text){
        this.text=text;
    }
    public void clear(){
        this.text="";
    }

    @Override
    public String toString(){
        return this.text;
    }
}