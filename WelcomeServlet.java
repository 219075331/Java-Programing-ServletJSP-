package study.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(name = "WelcomeServlet", urlPatterns = "/welcome")
public class WelcomeServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//リクエストパラメータの文字エンコーディングを指定
		request.setCharacterEncoding("utf-8");
		
		//リクエストパラメータ "userName" の値を取得
		String userName = request.getParameter("userName");
		

		// userName を"userName"という名前でrequestスコープに格納
		request.setAttribute("userName", userName);
		

		// welcome.jsp へのforward処理
		RequestDispatcher dispatcher = request.getRequestDispatcher("/welcome.jsp");
		dispatcher.forward(request, response);

	}
}
