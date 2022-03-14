package isetj.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthentificationServlet
 */
@WebServlet("/AuthentificationServlet")
public class AuthentificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthentificationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		if(username.contentEquals("dsi")&& password.contentEquals("dsi")){
			PrintWriter out = response.getWriter();
			out.println("<html><head>");
			out.println("<title> Authentification </title></head>");
			out.println("<body>");
			out.println("<h1><center> Authentification r�ussie </center></h1>");
			out.println("</body></html>");
		}
		else{
			PrintWriter out = response.getWriter();
			out.println("<html><head>");
			out.println("<title> Authentification </title></head>");
			out.println("<body>");
			out.println("<h1><center> Ech�c � l'authentification </center></h1>");
			out.println("</body></html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
