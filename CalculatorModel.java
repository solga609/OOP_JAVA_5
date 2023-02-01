public class CalculatorModel{
    Integer x, y;

    public CalculatorModel( Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    public CalculatorModel() {

    }  
     public CalculatorModel sum(CalculatorModel calcModel1, CalculatorModel calcModel2) {
        CalculatorModel result = new CalculatorModel();
         return result; 
         }
     public CalculatorModel sub(CalculatorModel calcModel1, CalculatorModel calcModel2) {
        CalculatorModel result = new CalculatorModel();
        return result; 
         }
     public CalculatorModel mult(CalculatorModel calcModel1, CalculatorModel calcModel2) {
        CalculatorModel result = new CalculatorModel();
        return result; 
         }
     public CalculatorModel div(CalculatorModel calcModel1, CalculatorModel calcModel2) {
        CalculatorModel result = new CalculatorModel();
        return result; 
         }

@Override
public String toString() {
    return x + "+(/)" + y + "(i)"; 
}
}