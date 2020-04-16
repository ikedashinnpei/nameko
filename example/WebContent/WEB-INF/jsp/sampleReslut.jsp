<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "model.SampleModel" %>

<% //リクエストスコープに保存されてるSampleModelを取得
SampleModel samplemodel = (SampleModel) request.getAttribute("samplemodel"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>計算結果</title>
</head>
<body>
<h1>計算結果</h1>
<p>計算結果は<%= samplemodel.getResult() %></p>
<a href = "/example/SampleCheck">戻る</a>
</body>
</html>