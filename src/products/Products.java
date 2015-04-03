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
	ProductsDetail results = new ProductsDetail(5);

	// ProductsDetail results;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Products() {
		super();
		// results = new ProductsDetail(3);
		// TODO Auto-generated constructor stub
	}

//	public void processResult(HttpServletRequest request,
//			HttpServletResponse response) throws ServletException, IOException {
//
//		HttpSession session = request.getSession();
//		session.setMaxInactiveInterval(1);
//		Object voteProduct = session.getAttribute("voteProduct");
//
//		if (voteProduct == null) {
//			int gender = Integer.parseInt(request.getParameter("gender"));
//			int product = Integer.parseInt(request.getParameter("vote"));
//			results.addPref(gender, product);
//			session.setAttribute("voteProduct", gender + product);
//			request.setAttribute("info",
//					"Thank you for participating in the Mobile Purchasing Survey!");
//		} else {
//			request.setAttribute("info", "You have voted already");
//		}
//
//		getServletContext().setAttribute("fPhones",
//				results.getFemalePreference());
//		getServletContext()
//				.setAttribute("mPhones", results.getMalePreference());
//
//		// let a jsp page display the result
//		request.getRequestDispatcher("/bookDetail.jsp").forward(request, response);
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		processResult(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		processResult(request, response);
	}

}
