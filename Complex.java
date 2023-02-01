public class Complex extends CalculatorModel{

    public Complex(){
    }

    public CalculatorModel sum(CalculatorModel calcModel1, CalculatorModel calcModel2) {
        CalculatorModel result = new CalculatorModel(calcModel1.x + calcModel2.x, calcModel1.y + calcModel1.y);
        return result;
    }

    public CalculatorModel sub(CalculatorModel calcModel1, CalculatorModel calcModel2) {
        CalculatorModel result = new CalculatorModel(calcModel1.x - calcModel2.x, calcModel1.y - calcModel1.y);
        return result;
    }

    public CalculatorModel mult(CalculatorModel calcModel1, CalculatorModel calcModel2) {
        CalculatorModel result = new CalculatorModel(calcModel1.x * calcModel2.x - calcModel1.y * calcModel1.y,
                calcModel1.y * calcModel1.x + calcModel1.x * calcModel2.y);
        return result;
    }

    public CalculatorModel div(CalculatorModel calcModel1, CalculatorModel calcModel2) {
        CalculatorModel result = new CalculatorModel(
                (calcModel1.x * calcModel2.x + calcModel1.y * calcModel1.y)
                        / (calcModel1.x * calcModel1.x + calcModel1.y * calcModel1.y),
                (calcModel1.y * calcModel1.x - calcModel1.x * calcModel2.y)
                        / (calcModel1.x * calcModel1.x + calcModel1.y * calcModel1.y));
        return result;
    }
    @Override
    public String toString() {
        return x + "+" + y + "i"; 
    }}