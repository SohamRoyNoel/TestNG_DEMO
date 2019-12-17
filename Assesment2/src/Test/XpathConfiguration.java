package Test;

public class XpathConfiguration {
	
	// Credentials
	public static String ChromedriverLocation = "CHROMEDRIVER_79/chromedriver.exe";
	public static String userCredentials = "UserCredentials.properties";
	public static String url = "https://www.saucedemo.com/index.html";

	// Login Page Xpaths
	public static String userName = "//*[@class='form_input' and @id='user-name']";
	public static String userPassword = "//*[@class='form_input' and @id='password']";
	public static String loginButton = "//*[@class='btn_action' and @value='LOGIN']";
	
	// Product Selection 
	public static String priceDropdown = "//*[@class='product_sort_container']";
	public static String priceTags = "//*[@class='inventory_item_price']";
	public static String cartButton = "//*[@class='svg-inline--fa fa-shopping-cart fa-w-18 fa-3x ']";
	
	// Cart Page
	public static String checkout = "//*[@class='btn_action checkout_button']";
	
	// Checkout Info
	public static String userFN = "//*[@class='form_input' and @id='first-name']";
	public static String userLN = "//*[@class='form_input' and @id='last-name']";
	public static String userZIP = "//*[@class='form_input' and @id='postal-code']";
	public static String continueOrder = "//*[@class='btn_primary cart_button']";
	
	// Order Summary : Overview
	public static String orderOverview = "//*[@class='btn_action cart_button']";
	
	// Order confirmation
	public static String verification = "//*[@class='complete-header']";
	
}
