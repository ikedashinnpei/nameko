<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//リクエストスコープに保存されてるSampleModelを取得
	String message = (String) request.getAttribute("message");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

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
//		var error_msg = document.getElementById("error_msg");

		if(number1 == "" || number2 == "") {
//			error_msg.innerHTML = "何か数値を入力してください";
			error_msg = "何か数値を入力してください";
			alert(error_msg);
			return false;
		}

		if(!isNumber(number1) || !isNumber(number2)) {
//			error_msg.innerHTML = "数値を入力してください";
			error_msg = "数値を入力してください";
			alert(error_msg);
			return false;
		}
		if(enzan == "divide" && number2 == "0") {
//			error_msg.innerHTML = "0で割れません";
			error_msg = "0では割れません";
			alert(error_msg);
			return false;
		}
		return true;
	}
</script>
<title>計算入力画面</title>
</head>
<body>
	<h1>四則演算！！</h1>
	<p>★数字を入力して下さい</p>

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
		<input type="submit" onClick="return check_value()" value="計算結果">
		<br>

	</form>

</body>
</html>