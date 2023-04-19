<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
<title>送信フォーム</title>
</head>
<body>
	<% // formタグのaction属性に『コンテキストパス+/welcome』を指定 %>
	<form action="${pageContext.request.contextPath }/welcome" method="post">
		お名前は？<input type="text" name="userName" size="30"><br>
		<input type="submit" value="送信" />
	</form>
</body>
</html>
