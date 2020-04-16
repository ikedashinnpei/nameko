<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>計算入力画面</title>
</head>
<body>
<h1>四則演算！！</h1>
<p>★数字を入力して下さい</p>

<form action="/example/SampleCheck" method = "post">

<input type="text" name="number1">

<select name="enzan" size="1">
<option value="add">＋</option>
<option value="minus">−</option>
<option value="multiply">×</option>
<option value="divide">÷</option>
</select>

<input type="text" name="number2">＝
<input type="submit" value="計算結果" >

</form>

</body>
</html>