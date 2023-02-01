public class Rational extends CalculatorModel {

    public CalculatorModel reduction(CalculatorModel calcModel) {
        int m = 1;
        int x = calcModel.x;
        int y = calcModel.y;
        if (x < y) {
            m = x;
            x = y;
            y = m;
        }

        while (m != 0) { // * Найдите самый большой общий делитель, подбрасывая и разделяя * /
            m = x % y;
            x = y;
            y = m;
        }
        CalculatorModel result = new CalculatorModel(); //
        if (m == 0) {
            result.x = calcModel.x;
            result.y = calcModel.y;
        } else {
            result.x = calcModel.x / m;
            result.y = calcModel.y / m;
        }
        return result;
    }

    public CalculatorModel sum(CalculatorModel calcModel1, CalculatorModel calcModel2) {
        CalculatorModel sum = new CalculatorModel(calcModel1.x * calcModel2.y + calcModel2.x * calcModel1.y,
                calcModel1.y * calcModel2.y);
        System.out.println(sum);
        return reduction(sum);
    }

    public CalculatorModel sub(CalculatorModel calcModel1, CalculatorModel calcModel2) {
        CalculatorModel sub = new CalculatorModel(calcModel1.x * calcModel2.y - calcModel1.x * calcModel1.y,
                calcModel1.y * calcModel2.y);
        CalculatorModel result = new CalculatorModel();
        result = reduction(sub);
        return result;
    }

    public CalculatorModel mult(CalculatorModel calcModel1, CalculatorModel calcModel2) {
        CalculatorModel mult = new CalculatorModel(calcModel1.x * calcModel2.x, calcModel1.y * calcModel2.y);
        CalculatorModel result = new CalculatorModel();
        result = reduction(mult);
        return result;
    }

    public CalculatorModel div(CalculatorModel calcModel1, CalculatorModel calcModel2) {
        CalculatorModel div = new CalculatorModel(calcModel1.x * calcModel2.y, calcModel1.y * calcModel2.x);
        CalculatorModel result = new CalculatorModel();
        result = reduction(div);
        return result;
    }
}