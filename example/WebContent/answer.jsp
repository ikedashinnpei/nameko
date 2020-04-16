<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>計算結果表示</title>
</head>
<body>
<%
  String Num = request.getParameter("number1");
  String Num1 = request.getParameter("number2");

  String errorMsg = "";
  String errorMsg1 = "";

  if(Num == null || Num.length() == 0)
  {
	  errorMsg += "1を入力してください";
	  out.println(errorMsg + "<br>");
  }
  if(Num1 == null || Num1.length() == 0)
  {
	  errorMsg1 += "2を入力してください";
	  out.println(errorMsg1 + "<br>");
  }
  if(Num.length() >= 1 && Num1.length() >= 1)
  {
  int t1=Integer.parseInt(Num);
  int t2=Integer.parseInt(Num1);
  int Sun = t1+t2;
  out.println("計算結果は"+Sun+"です");
  
  }
%>

</body>
</html>