package InheritancePolymorphism.src;

public class Input {
    private boolean isEnabled = true;

    public Input(
        // boolean isEnabled
    ){
        // System.out.println("Input");
        // this.isEnabled = isEnabled;
    }

    public void render(){
        
    }
    // kenapa render kosong mau dibuat abstrak input aja itu ga ada 
    // artinya 

    public void disable(){
        this.isEnabled=false;
    }
    public boolean isEnabled(){
        return this.isEnabled;
    }

    @Override
    public String toString(){
        return "ini to String Input";
    }

}