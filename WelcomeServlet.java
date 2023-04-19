package study.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	@SuppressWarnings("rawtypes")
	private void process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// リクエストパラメータの文字エンコーディングを指定
		request.setCharacterEncoding("utf-8");
		// リクエストパラメータ"userName"の値を取得
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		// 出力のコンテントタイプを指定
		response.setContentType("text/html;charset=utf-8");
		// クライアント出力用のWriterオブジェクトを取得
		PrintWriter out = response.getWriter();
		// HTMLの出力
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ようこそ！</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("こんにちは！" + userName + "さん！<br>");
		out.println("パスワードは" + password + "です！<br>");

		out.println("<p>");
		out.println("<br>");
		out.println("<hr>");
		out.println("以下は送信されたリクエストパラメータ情報<br>");

		out.println("<hr>");
		out.println("parameter:");
		out.println(request.getQueryString());
		out.println("<br>");
		out.println("<br>");

		out.println("<hr>");
		out.println("以下は送信されたリクエストのヘッダ情報<br>");
		out.println("<hr>");
		// ヘッダ情報の表示
		Enumeration headernames = request.getHeaderNames();
		while (headernames.hasMoreElements()) {
			String name = (String) headernames.nextElement();
			Enumeration headervalues = request.getHeaders(name);
			while (headervalues.hasMoreElements()) {
				String val = (String) headervalues.nextElement();
				out.println(name);
				out.println(":");
				out.println(val);
				out.println("<br>");
			}
		}
		out.println("</p>");
		out.println("</body>");
		out.println("</html>");
	}
}
