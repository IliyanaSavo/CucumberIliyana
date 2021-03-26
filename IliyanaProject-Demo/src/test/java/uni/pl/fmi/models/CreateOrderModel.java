package uni.pl.fmi.models;

import uni.pl.fmi.services.CreateOrderService;

public class CreateOrderModel {

	private String bookName;
	private String author;
	private Object expectedMessage;

	public void navigateToMe() {
		System.out.println("Отворена е страницата за поръчки");
		
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
		
	}

	public void setAuthorName(String author) {
		this.author = author;
		
	}

	public void clickAddButton() {
		expectedMessage = CreateOrderService.createOrder(bookName, author);
		
	}

	public Object getDisplayMessage() {
		
		return expectedMessage;
	}

}
