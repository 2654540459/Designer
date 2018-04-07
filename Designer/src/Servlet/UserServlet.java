package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.UserDao;
import DaoImpl.UserDaoImol;
import Entity.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected UserDao userdao = new UserDaoImol();
    public UserServlet() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		String action = request.getParameter("action");
		if(action.equals("login")) {
			login(request, response);
		}else if(action.equals("regist")) {
			regist(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	/**
	 * 登录验证
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	protected void login(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String name = request.getParameter("LoginName");
		String pwd = request.getParameter("LoginPwd");
		PrintWriter out = response.getWriter();
		User user = userdao.CheckUserLogin(name, pwd);
		if(user!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			System.out.println("登录成功");
			//跳转到指定页面
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			out.print("<script>alert('用户名或密码错误');history.go(-1)</script>");
		}
	}
	
	/**
	 * 注册验证
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	protected void regist(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException {
		String loginname = request.getParameter("LoginName");
		String loginpwd = request.getParameter("LoginPwd");
		String username = request.getParameter("UserName");
		PrintWriter out = response.getWriter();
		if(userdao.CheckOnlyLoginName(loginname)) {
			out.print("<script>alert('登录名已存在');history.go(-1)</script>");
		}else {
			User user = new User();
			user.setLoginName(loginname);
			user.setLoginPwd(loginpwd);
			user.setUserName(username);
			userdao.AddUser(user);
			//注册成功后返回的页面
			response.sendRedirect("");
		}
	}
}
