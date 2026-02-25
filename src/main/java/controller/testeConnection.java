package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DomestickTaskDao;
import model.Domesticktask;
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
		DomestickTaskDao domestickTaskDao = new DomestickTaskDao();
		
		List<Responsible> responsibles	= respsosibleDao.getAllResponsilbes();
		List<Domesticktask> domestickTasks = domestickTaskDao.getAllDomestickTasks();
		for(Responsible responsible : responsibles) {
			System.out.println(responsible.getName());
		}
		System.out.println("##################################");
		
		System.out.println("Tarefas domesticas");
		for(Domesticktask domestickTask : domestickTasks) {
			System.out.println("##################################");
	
			System.out.println(domestickTask.getName());
			System.out.println(domestickTask.getInstructions());
			System.out.println(domestickTask.getResponsible().getName());
			System.out.println("##################################");
		}
	}

}
