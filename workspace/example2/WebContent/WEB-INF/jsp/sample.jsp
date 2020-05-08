<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import = "model.OutputModel" %>

<%
	//リクエストスコープに保存されてるSampleModelを取得
	OutputModel model = (OutputModel) request.getAttribute("model");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--
<script type="text/javascript">

//最初に数値を見てアラート出すかの判定をしている

	function isNumber(val){
		var regex = new RegExp(/^[0-9]+$/);
	  	return regex.test(val);
	}

	function check_value() {
		var number1 = calc_form.number1.value;
		var number2 = calc_form.number2.value;
		var enzan = calc_form.enzan.value;

		if(number1 == "" || number2 == "") {
			error_msg = "何か数値を入力してください";
			alert(error_msg);
			return false;
		}

		if(!isNumber(number1) || !isNumber(number2)) {
			error_msg = "数値を入力してください";
			alert(error_msg);
			return false;
		}
		if(enzan == "divide" && number2 == "0") {
			error_msg = "0では割れません";
			alert(error_msg);
			return false;
		}
		return true;
	}
</script>
-->

<title>計算入力画面</title>
</head>
<body style="background-color:#00FA9A">
<div style="background-color:red;text-align:center">
	<h1>四則演算！！</h1>
</div>

<div style="background-color:#00FFFF">
	<p>1:入力欄に数字を入れてください</p>
	<p>2:数字以外入力はしないでください</p>
	<p>3:0で割り算は行えません</p>
	<p>4:数字は半角でお願いします</p>
</div>

	<form action="/example2/SampleCheck" method="post" name="calc_form">

		<input type="text" name="number1">
		<select name="enzan" size="1">
			<option value="add">＋</option>
			<option value="minus">−</option>
			<option value="multiply">×</option>
			<option value="divide">÷</option>
		</select>
		<input type="text" name="number2">
		＝
		<!--
		<input type="submit" onClick="return check_value()" value="計算結果">
		-->
		<input type="submit" value="計算結果">
		<p><span style="color:red"><%=model.getMessage() %></span></p>

	</form>

</body>
</html>