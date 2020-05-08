package model;

public class InputModel {

	private String inputNumber1, inputNumber2, operator;
	private int number1, number2;

	public InputModel(String inputNumber1, String inputNumber2, String operator) {
		this.inputNumber1 = inputNumber1;
		this.inputNumber2 = inputNumber2;
		this.operator = operator;
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

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
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

}
