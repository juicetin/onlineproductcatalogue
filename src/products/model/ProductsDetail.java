package products.model;

/**
 * A class to hold survey result 
 * Sample code to be used in COMP5347 labs, SIT, University of Sydney
 * @author Ying Zhou
 *
 */
public class ProductsDetail {

	private String[] author, price, pages, publisher, language, isbn10, isbn13, images;
	private int[][] rating;
	private double[] averages;
	private int[] userRatings;
	private int[] ratingCount;
	
	//Member array/variable getters
	public String[] getAuthors() {return author;}
	public String[] getPrices() {return price;}
	public String[] getPublisher() {return publisher;}
	public String[] getPages() {return pages;}
	public String[] getLanguage() {return language;}
	public String[] getISBN10() {return isbn10;}
	public String[] getISBN13() {return isbn13;}
	public String[] getImages() {return images;}
	public int[] getUserRating() {return userRatings;}
	public int[] getRatingCount() {return ratingCount;}
	public int[][] getRating() {return rating;}
	public double[] getAverages() {return averages;}
	
	public void calcAverages(int productIndex) {
		double total = 0;
		for (int i = 0; i < 5; ++i) {
			if (rating[productIndex][i] > 0) {
				total+=(i+1)*rating[productIndex][i];
			}
		}
		averages[productIndex] = total/(double)ratingCount[productIndex];
	}
	public void tallyRatings(int productIndex) {
		
		ratingCount[productIndex] = 0;	//Reset to get new count	
		for (int i = 0; i < 5; ++i) {
			if (rating[productIndex][i] > 0) {
				ratingCount[productIndex] += rating[productIndex][i];
			}
		}
	}
	
	public ProductsDetail(){
		
	}
	
	public ProductsDetail(int productNumber){
		//Create all member arrays/variables
		author = new String[productNumber];
		price = new String[productNumber];
		pages = new String[productNumber];
		publisher = new String[productNumber];
		language = new String[productNumber];
		isbn10 = new String[productNumber];
		isbn13 = new String[productNumber];
		images = new String[productNumber];
		rating = new int[productNumber][5];
		averages = new double[productNumber];
		userRatings = new int[productNumber];
		ratingCount = new int[productNumber];
	}
	
	//Add functions to modify member arrays/variables
	public void addAuthor(int index, String author){this.author[index]=author;}
	public void addPrice(int index, String price){this.price[index]=price;}
	public void addPublisher(int index, String publisher){this.publisher[index]=publisher;}
	public void addPages(int index, String pages){this.pages[index]=pages;}
	public void addLanguage(int index, String language){this.language[index]=language;}
	public void addISBN10(int index, String ISBN10){this.isbn10[index]=ISBN10;}
	public void addISBN13(int index, String ISBN13){this.isbn13[index]=ISBN13;}
	public void addRating(int index, int rating){this.rating[index][rating-1]+=1;}
	public void addUserRating(int index, int rating){this.userRatings[index] = rating;}
	public void addImages(int index, String imageLoc){this.images[index] = imageLoc;}
}
