<%@ page contentType="text/html;charset=utf-8"%>
<%@ page import="java.text.DateFormat,java.util.Date"%>
<html>
<head>
<title>現在の時刻:JSP</title>
</head>
<body>
<h1>現在の時刻は
<% String currentTime = DateFormat.getDateTimeInstance().format(new Date()); %>
<%= currentTime %>です。
</h1>
</body>
</html>
