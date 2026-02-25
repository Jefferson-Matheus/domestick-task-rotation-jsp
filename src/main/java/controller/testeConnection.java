package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Responsible;
import model.ResponsibleDao;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class testeConnection
 */
@WebServlet("/testeConnection")
public class testeConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testeConnection() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ResponsibleDao respsosibleDao = new ResponsibleDao();
		
		List<Responsible> responsibles	= respsosibleDao.getAllResponsilbes();
		
		for(Responsible responsible : responsibles) {
			System.out.println(responsible.getName());
		}
	}

}
