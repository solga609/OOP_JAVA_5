import java.util.Scanner;

public class View {

	public Integer choiceTypeNum() {
		Scanner scann = new Scanner(System.in);
		System.out.println(
				"Вберите тип для ваших чисел: 1 -рациональное число, 2 -комплексное");
		int choice = scann.nextInt();
		return choice;
	}

	public CalculatorModel userInput() {
		Scanner scann = new Scanner(System.in);
		int choice = choiceTypeNum();
		CalculatorModel calcModel = new CalculatorModel();

		if (choice == 1) {
			System.out.println(
					"Введите рациональное число в формате 1/2 : ");
			String userInput = scann.nextLine();
			String[] temp;
			temp = userInput.split("/");
			calcModel.x = Integer.parseInt(temp[0]);
			calcModel.y = Integer.parseInt(temp[1]);
		} else if (choice == 2) {
			System.out.println(
					"Введите комплексное число в формате 1+2i : ");
			String userInput = scann.nextLine();
			String[] temp;
			temp = userInput.split("\\+");
			calcModel.x = Integer.parseInt(temp[0]);
			calcModel.y = Integer.parseInt(temp[1]);
		}
		return calcModel;
	}

	public Integer getOper() {
		Scanner scann = new Scanner(System.in);
		System.out.println(
				"Вберите перацию с числами: 1 +, 2 -, 3 *, 4 / ");
		int ch = scann.nextInt();
		return ch;
	}

	public void ptint(CalculatorModel calcModel) {
		System.out.println(calcModel);
	}
}