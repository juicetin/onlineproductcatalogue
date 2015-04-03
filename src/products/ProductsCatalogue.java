package products;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import products.model.ProductsDetail;
/**
 * Servlet implementation class SurveyForm
 * This servlet displays a survey for user's next purchase
 */
 
@WebServlet(value="/productsCatalogue", initParams = {
		@WebInitParam(name="products", 
				value="Internet & WWW How to Program,"
						+ "Web Application Architecture,"
						+ "Design Patterns,"
						+ "Head First Servlet & JSP,"
						+ "Yet Another Book")
})
public class ProductsCatalogue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductsCatalogue() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Prepare some initial data
     */
    public void init(){
    	String products = getServletConfig().getInitParameter("products");
    	String[] productList = products.split(",");
    	ProductsDetail sr = new ProductsDetail(productList.length);
    	getServletContext().setAttribute("productList", productList);
    	getServletContext().setAttribute("surveyResult", sr);
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("/bookCatalogue.jsp");
		view.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
