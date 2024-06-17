
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();

			String n = request.getParameter("userName");
			pw.print("Welcome " + n);
			Cookie ck = new Cookie("uname", n);
			response.addCookie(ck);
			pw.print("<form action='servlet2'>");
			pw.print("<input type='submit' value='go'>");
			pw.print("</form>");
			pw.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
