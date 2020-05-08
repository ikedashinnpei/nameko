package controller;

import model.InputModel;
import model.OutputModel;

public class Validator {

	public static boolean check(InputModel inputModel, OutputModel outputModel) {
		int number1, number2;

		// 2. 入力があるかどうか
		if (inputModel.getInputNumber1().equals("") || inputModel.getInputNumber2().equals("")) {
			ErrorStatus status = ErrorStatus.NoInput;
			outputModel.setMessage(status.getMsg());
			return true;
		}

		// 1. 入力が数字かどうか
		try {
			number1 = Integer.parseInt(inputModel.getInputNumber1());
			number2 = Integer.parseInt(inputModel.getInputNumber2());
			inputModel.setNumber1(number1);
			inputModel.setNumber2(number2);
		} catch (NumberFormatException e) {
			ErrorStatus status = ErrorStatus.InputError;
			outputModel.setMessage(status.getMsg());
			return true;
		}

		// 3. Divide Errorチェック(x/0になってないか)
		if ((number2 == 0) && inputModel.getOperator().contentEquals("divide")) {
			ErrorStatus status = ErrorStatus.DevideError;
			outputModel.setMessage(status.getMsg());
			return true;
		}

		// エラーがなければ
		ErrorStatus status = ErrorStatus.NoError;
		outputModel.setMessage(status.getMsg());
		return false;
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
