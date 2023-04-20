package study.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.bean.UserInfo;

@SuppressWarnings("serial")
@WebServlet(name="ShowParamServlet", urlPatterns="/showparam")
public class ShowParamServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// リクエストパラメータの文字エンコーディングを指定
		request.setCharacterEncoding("utf-8");

		
		// リクエストパラメータの値を取得
		String name = request.getParameter("name");
		String yomi = request.getParameter("yomi");
		String zip = request.getParameter("zip");
		String address = request.getParameter("address");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		
		
		// UserInfo JavaBeansオブジェクトを生成
		UserInfo userInfo = new UserInfo();

		
		// リクエストパラメータから取得した値をBeanの各プロパティにセット
		userInfo.setName(name);
		userInfo.setYomi(yomi);
		userInfo.setZip(zip);
		userInfo.setAddress(address);
		userInfo.setTel(tel);
		userInfo.setEmail(email);	
		
		
		// Bean を"userInfo"という名前でrequestスコープに格納
		request.setAttribute("userInfo", userInfo);

		
		
		// /WEB-INF/showparam.jsp へのforward処理
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/showparam.jsp");
		rd.forward(request, response);

	
	}
}
