package model;

public class SampleEnzan
{
	public void execute(SampleModel samplemodel)
	{
		//合計の計算を設定する
		int number1 = samplemodel.getNumber1();
		int number2 = samplemodel.getNumber2();
		String enzan = samplemodel.getEnzan();

		//セレクトで選んだ奴を計算する
		if(enzan == "add")
		{
			int reslut = number1+number2;
			samplemodel.setResult(reslut);
		}

		if(enzan == "minus")
		{
			int reslut = number1-number2;
			samplemodel.setResult(reslut);
		}

		if(enzan == "multiply")
		{
			int reslut = number1*number2;
			samplemodel.setResult(reslut);
		}

		if(enzan == "divide")
		{
			int reslut = number1/number2;
			samplemodel.setResult(reslut);
		}
	}

}
