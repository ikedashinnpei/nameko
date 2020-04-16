package model;

import java.io.Serializable;

public class SampleModel implements Serializable
{
	private int number1,number2,reslut;
	private String enzan;

	public ErrorStatus checkError() {
		// 1. 入力が数字かどうか

		return ErrorStatus.InputError;

		// 2. 入力があるかどうか
		return ErrorStatus.NoInput;

		// 3. Divide Errorチェック(x/0になってないか)
		return ErrorStatus.DevideError;

		// エラーがなければ
		return ErrorStatus.NoError;
	}


	//入力１のsetとgetと場所
	public int getNumber1() {return number1;}
	public void setNumber1(int number1) {this.number1 = number1;}

	//入力2のsetとgetと場所
	public int getNumber2() {return number2;}
	public void setNumber2(int number2) {this.number2 = number2;}

	//計算結果のsetとgetと場所
	public int getResult() {return reslut;}
	public void setResult(int reslut) {this.reslut = reslut;}

	//セレクトの四則演算のsetとgetと場所
	public String getEnzan() {return this.enzan;}
	public void setEnzan(String enzan) {this.enzan = enzan;}

	public enum ErrorStatus {
		InputError,
		NoInput,
		DevideError,
		NoError
	}
}
