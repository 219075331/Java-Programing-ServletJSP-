package study.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * クライアントから送信されるリクエストパラメーター"userName"を受信し、 レスポンスするServlet。
 */
@SuppressWarnings("serial")
@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// リクエストパラメーター"userName"の値を取得
		String userName = req.getParameter("userName");

		// 出力オブジェクトを取得
		PrintWriter out = resp.getWriter();

		// HTMLを出力（レスポンス）
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ssj_ex02</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Hello " + userName + "!");
		out.println("</body>");
		out.println("</html>");
	}
}
