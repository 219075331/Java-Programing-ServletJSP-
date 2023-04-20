<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<!DOCTYPE html>
<html>
<head>
<title>送信内容</title>
<style type="text/css">
table {
	border-style: none;
}
</style>
</head>
<body>
<% // EL式で、Beanの各プロパティの値を出力 %>
<table>
	<tr>
		<td>お名前</td>
		<td><c:out value="${ userInfo.name }"/><br>
		</td>
	</tr>
	<tr>
		<td>読み</td>
		<td><c:out value="${ userInfo.yomi }"/><br>
		</td>
	</tr>
	<tr>
		<td>郵便番号</td>
		<td><c:out value="${ userInfo.zip }"/><br>
		</td>
	</tr>
	<tr>
		<td>住所</td>
		<td><c:out value="${ userInfo.address }"/><br>
		</td>
	</tr>
	<tr>
		<td>電話番号</td>
		<td><c:out value="${ userInfo.tel }"/><br>
		</td>
	</tr>
	<tr>
		<td>メールアドレス</td>
		<td><c:out value="${ userInfo.email }"/><br>
		</td>
	</tr>
</table>
</body>
</html>
