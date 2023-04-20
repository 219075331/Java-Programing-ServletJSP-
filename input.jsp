<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>送信フォーム</title>
<style type="text/css">
table {
	border-style: none;
}
</style>
</head>
<body>
	<form action="${ pageContext.request.contextPath }/showparam"
		method="post">
		<table>
			<tr>
				<td>お名前</td>
				<td><input type="text" name="name" size="30" /><br></td>
			</tr>
			<tr>
				<td>読み</td>
				<td><input type="text" name="yomi" size="30" /><br></td>
			</tr>
			<tr>
				<td>郵便番号</td>
				<td><input type="text" name="zip" size="30" /><br></td>
			</tr>
			<tr>
				<td>住所</td>
				<td><input type="text" name="address" size="30" /><br></td>
			</tr>
			<tr>
				<td>電話番号</td>
				<td><input type="text" name="tel" size="30" /><br></td>
			</tr>
			<tr>
				<td>メールアドレス</td>
				<td><input type="text" name="email" size="30" /><br></td>
			</tr>
		</table>
		<input type="submit" value="送信" />
	</form>
</body>
</html>
