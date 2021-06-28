package controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReporteDAO;
import model.Reporte;

/**
 * Servlet implementation class ReporteServlet
 */
@WebServlet("/ReporteServlet/*")
public class ReporteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private ReporteDAO reDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReporteServlet() {
        super();
        reDAO = new ReporteDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		switch (action) {
		case "eliminar":
			this.eliminar(request, response);
			break;
		case "mostrar":
			this.showForm(request, response);
			break;
		/*
		 * case "/buscar": this.buscar(request, response); break;
		 */
		default:
			break;
		}
	}

	private void showForm(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void eliminar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		System.out.println(action);
		switch (action) {
		case "buscar":
			this.buscar(request, response);
			break;
		case "registrar":
			this.registrar(request, response);
			break;
		case "actualizar":
			this.actualizar(request, response);
			break;
		default:
			break;
		}
	}

	private void registrar(HttpServletRequest request, HttpServletResponse response) {
		String description = request.getParameter("description");
		String file = request.getParameter("file");
		String name = request.getParameter("name");
		String state = request.getParameter("state");
		Calendar c = Calendar.getInstance();
		String [] datecrateS = request.getParameter("fechainicio").split("-");
		c.set(Integer.parseInt(datecrateS[0]),Integer.parseInt(datecrateS[1])-1, Integer.parseInt(datecrateS[2]));
		Timestamp datecreate = new Timestamp(c.getTimeInMillis());
		Reporte r = new Reporte();
		r.setDescription(description);
		r.setFile(file);
		r.setName(name);
		r.setState(state);
		r.setDatecreate(datecreate);
		reDAO.insert(r);
		request.getRequestDispatcher("reporteRegistro.jsp");
	}

	private void actualizar(HttpServletRequest request, HttpServletResponse response) {
	

	}

	private void buscar(HttpServletRequest request, HttpServletResponse response) {
		
		
	}

}
