package model;

public class SampleEnzan {
	public static int execute(SampleModel samplemodel) {
		//合計の計算を設定する
		int number1 = samplemodel.getNumber1();
		int number2 = samplemodel.getNumber2();
		String enzan = samplemodel.getEnzan();

		int result = -1;

		//セレクトで選んだ奴を計算する
		if (enzan.equals("add")) {
			result = number1 + number2;
		}

		else if (enzan.equals("minus")) {
			result = number1 - number2;
		}

		else if (enzan.equals("multiply")) {
			result = number1 * number2;
		}

		else if (enzan.equals("divide")) {
			result = number1 / number2;
		} else {
			System.out.println("Error enzan");
		}
		return result;
	}

}
