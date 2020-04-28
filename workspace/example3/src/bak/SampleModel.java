package model;

import java.io.Serializable;

public class SampleModel implements Serializable {
	private int number1, number2, result;
	private String inputNumber1, inputNumber2;
	private String enzan;

	public SampleModel(String inputNumber1, String inputNumber2, String enzan) {
		this.inputNumber1 = inputNumber1;
		this.inputNumber2 = inputNumber2;
		this.enzan = enzan;
		//		try {
		//			this.number1 = Integer.parseInt(inputNumber1);
		//			this.number2 = Integer.parseInt(inputNumber2);
		//		} catch (NumberFormatException e) {
		//			e.printStackTrace();
		//		}
	}

	public ErrorStatus checkError() {
		// 2. 入力があるかどうか
		if (inputNumber1.equals("") || inputNumber2.equals("")) {
			return ErrorStatus.NoInput;
		}

		// 1. 入力が数字かどうか
		try {
			this.number1 = Integer.parseInt(inputNumber1);
			this.number2 = Integer.parseInt(inputNumber2);
		} catch (NumberFormatException e) {
			return ErrorStatus.InputError;
		}

		// 3. Divide Errorチェック(x/0になってないか)
		if (inputNumber2.equals("0")) {
			return ErrorStatus.DevideError;
		}

		// エラーがなければ
		return ErrorStatus.NoError;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getInputNumber1() {
		return inputNumber1;
	}

	public void setInputNumber1(String inputNumber1) {
		this.inputNumber1 = inputNumber1;
	}

	public String getInputNumber2() {
		return inputNumber2;
	}

	public void setInputNumber2(String inputNumber2) {
		this.inputNumber2 = inputNumber2;
	}

	public String getEnzan() {
		return enzan;
	}

	public void setEnzan(String enzan) {
		this.enzan = enzan;
	}

	public enum ErrorStatus {
		InputError(1, "数字を入力してください"), NoInput(2, "入力してください"), DevideError(3, "入力2に0を入れないでください"), NoError(0, "");

		private int id;
		private String msg;

		private ErrorStatus(int id, String msg) {
			this.id = id;
			this.msg = msg;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

	}
}
