public class Presenter {
    View view;

    public Presenter(View v) {
        view = v;
    }

    public void buttonClick(View v) {

        CalculatorModel cm1 = view.userInput();
        CalculatorModel cm2 = view.userInput();

        Integer oper = view.getOper();

        if (view.choiceTypeNum() == 1) {
            Rational rational = new Rational();
            if (oper == 1) {
                CalculatorModel cmSum = rational.sum(cm1, cm2);
                view.ptint(cmSum);
            } else if (oper == 2) {
                CalculatorModel cmSum = rational.sub(cm1, cm2);
                view.ptint(cmSum);
            } else if (oper == 4) {
                CalculatorModel cmSum = rational.div(cm1, cm2);
                view.ptint(cmSum);
            } else if (oper == 3) {
                CalculatorModel cmSum = rational.mult(cm1, cm2);
                view.ptint(cmSum);
            }
        } else if (view.choiceTypeNum() == 2) {
            Complex comlex = new Complex();
            if (oper == 1) {
                CalculatorModel cmComSum = comlex.sum(cm1, cm2);
                view.ptint(cmComSum);
            } else if (oper == 2) {
                CalculatorModel cmComSum = comlex.sub(cm1, cm2);
                view.ptint(cmComSum);
            } else if (oper == 4) {
                CalculatorModel cmComSum = comlex.div(cm1, cm2);
                view.ptint(cmComSum);
            } else if (oper == 3) {
                CalculatorModel cmComSum = comlex.mult(cm1, cm2);
                view.ptint(cmComSum);
            }
        }
    }
}