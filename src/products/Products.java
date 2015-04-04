package products;

import products.model.*;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Survey This class handles survey submitted by
 * the user and displays results in another JSP
 */

@WebServlet("/products")
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Products() {
		super();
	}

	public void init() {

	}

	public void processResult(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(60);	//30 Minutes
		
		//Determine current item being viewed
		String item = request.getParameter("item");
		int iItem = Integer.parseInt(item);
		int rating = Integer.parseInt(request.getParameter("rate"));
		
		//Check if user has already rated the particular item in current session
		Object bookRating = session.getAttribute(item);
		if (bookRating == null) {
			ProductsCatalogue.products.addRating(iItem, rating);
			ProductsCatalogue.products.tallyRatings(iItem);
			ProductsCatalogue.products.calcAverages(iItem);
			ProductsCatalogue.products.addUserRating(iItem, rating);
			session.setAttribute(item, "voted");
		}
		
		request.getRequestDispatcher("/bookDetail.jsp?item=" + item).forward(
				request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
//		processResult(request, response);
		request.getRequestDispatcher("/bookCatalogue.jsp").forward(
				request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processResult(request, response);
	}
	
	protected void doOne() throws ServletException, IOException {
		
	}

}
