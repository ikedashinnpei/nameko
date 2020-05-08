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
<title>計算結果</title>
</head>
<body style="background-color:#00FA9A">
<div style="background-color:red;text-align:center">
<h1>計算結果</h1>
</div>
<p>計算結果は<span style="color:red"><%=model.getResult() %></span></p>
<a href = "/example2/SampleCheck">戻る</a>
</body>
</html>