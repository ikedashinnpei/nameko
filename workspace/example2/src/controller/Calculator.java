package controller;

import model.InputModel;
import model.OutputModel;

public class Calculator {

	public static void calculate(InputModel inputModel, OutputModel outputModel) {
		//合計の計算を設定する
		int number1 = inputModel.getNumber1();
		int number2 = inputModel.getNumber2();
		String operator = inputModel.getOperator();

		int result = -1;

		//セレクトで選んだ奴を計算する
		if (operator.equals("add")) {
			result = number1 + number2;
		}

		else if (operator.equals("minus")) {
			result = number1 - number2;
		}

		else if (operator.equals("multiply")) {
			result = number1 * number2;
		}

		else if (operator.equals("divide")) {
			result = number1 / number2;
		} else {
			System.out.println("Error operator");
		}

		outputModel.setResult(result);
	}

}
