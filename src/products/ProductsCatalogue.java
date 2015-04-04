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
						+ "Head First Servlet & JSP,")
})
public class ProductsCatalogue extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static ProductsDetail products;
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
    	String product_names = getServletConfig().getInitParameter("products");
    	String[] productList = product_names.split(",");
    	products = new ProductsDetail(productList.length);
    	getServletContext().setAttribute("productList", productList);
    
    	//Internet & World Wide Web How To Program
		products.addAuthor(0, "Paul Deitel, Harvey Deitel, and Abbey Deitel");
		products.addPrice(0, "$158.23");
		products.addPages(0, "992");
		products.addPublisher(0, "Prentice Hall; 5 edition (November 19, 2011)");
		products.addLanguage(0, "English");
		products.addISBN10(0, "0132151006");
		products.addISBN13(0, "978-0132151009");
		products.addImages(0, "http://i.imgur.com/TiYXq2G.jpg");
		
		//Web Application Architecture
		products.addAuthor(1, "Leon Shklar and Rich Rosen");
		products.addPrice(1, "$72.19");
		products.addPages(1, "440");
		products.addPublisher(1, "Wiley; 2 edition (April 27, 2009)");
		products.addLanguage(1, "English");
		products.addISBN10(1, "047051860X");
		products.addISBN13(1, "978-0470518601");
		products.addImages(1, "http://i.imgur.com/OraYnRB.jpg");
		
		//Design Patterns
		products.addAuthor(2, "Erich Gamma, Richard Helm, Ralph Johnson, & John Vlissides");
		products.addPrice(2, "$49.62");
		products.addPages(2, "395");
		products.addPublisher(2, "Addison-Wesley Professional; 1 edition (November 10, 1994)");
		products.addLanguage(2, "English");
		products.addISBN10(2, "0201633612");
		products.addISBN13(2, "978-0201633610");
		products.addImages(2, "http://i.imgur.com/zmYsgLK.jpg");	
		
		//Head First Servlet & JSP
		products.addAuthor(3, "Bryan Basham, Kathy Sierra, & Bert Bates");
		products.addPrice(3, "$46.45");
		products.addPages(3, "914");
		products.addPublisher(3, "O'Reilly Media; Second Edition edition (April 4, 2008)");
		products.addLanguage(3, "English");
		products.addISBN10(3, "0596516681");
		products.addISBN13(3, "978-0596516680");
		products.addImages(3, "http://i.imgur.com/T9owTxo.jpg");

		//Pass all arrays of variables to servlets in application scope
		getServletContext().setAttribute("authors", products.getAuthors());;
		getServletContext().setAttribute("prices", products.getPrices());
		getServletContext().setAttribute("pages", products.getPages());
		getServletContext().setAttribute("languages", products.getLanguage());
		getServletContext().setAttribute("ISBN10", products.getISBN10());
		getServletContext().setAttribute("ISBN13", products.getISBN13());
		getServletContext().setAttribute("ratings", products.getRating());
		getServletContext().setAttribute("averages", products.getAverages());
		getServletContext().setAttribute("userRatings", products.getUserRating());
		getServletContext().setAttribute("ratingCount", products.getRatingCount());
		getServletContext().setAttribute("images", products.getImages());
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/bookCatalogue.jsp");
		view.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/bookDetail.jsp");
		view.forward(request,response);
	}

}
