package model;

public class SampleEnzan
{
	public void execute(SampleModel samplemodel)
	{
		//合計の計算を設定する
		int number1 = samplemodel.getNumber1();
		int number2 = samplemodel.getNumber2();
		String enzan = samplemodel.getEnzan();

		System.out.println(enzan);

		//セレクトで選んだ奴を計算する
		if(enzan.equals("add"))
		{
			int reslut = number1+number2;
			samplemodel.setResult(reslut);
		}

		else if(enzan.equals("minus"))
		{
			int reslut = number1-number2;
			samplemodel.setResult(reslut);
		}

		else if(enzan.equals("multiply"))
		{
			int reslut = number1*number2;
			samplemodel.setResult(reslut);
		}

		else if(enzan.equals("divide"))
		{
			int reslut = number1/number2;
			samplemodel.setResult(reslut);
		}
		else
		{
			System.out.println("Error enzan");
			samplemodel.setResult(-1);
		}
	}

}
