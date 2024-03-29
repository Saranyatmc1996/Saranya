package org.tcs.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsEnter extends Helper {
	public DetailsEnter() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccvNo;
	
	@FindBy(id="cc_type")
	private WebElement ccType;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNo;
	
	@FindBy(id="book_now")
	private WebElement book;

	@FindBy(id="order_no")
	private WebElement print;

	@FindBy(xpath="//a[@href='Logout.php']")
	private WebElement logout;
	
	@FindBy(xpath="//a[@href='index.php']")
	private WebElement log;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcvNo() {
		return ccvNo;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getPrint() {
		return print;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getLog() {
		return log;
	}
}