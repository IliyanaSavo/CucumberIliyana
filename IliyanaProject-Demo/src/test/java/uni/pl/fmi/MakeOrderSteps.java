package uni.pl.fmi;

import static org.junit.Assert.assertEquals;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.CreateOrderModel;

public class MakeOrderSteps {
	CreateOrderModel createOrderModel = new CreateOrderModel();
	
	
	@Given("^Отваря се екрана за създаване на поръчки$")
	public void openScreen() throws Throwable {
	    createOrderModel.navigateToMe();
	    
	}

	@When("^Въвежда се името на книгата$")
	public void addName(String bookName) throws Throwable {
	    createOrderModel.setBookName(bookName);
	}

	@When("^Въвежда се името на автора$")
	public void addAuthor(String author) throws Throwable {
	    createOrderModel.setAuthorName(author);
	}

	@When("^Натиска се бутон за добавяне на книга$")
	public void clickAddButton() throws Throwable {
	    createOrderModel.clickAddButton();
	}

	@Then("^Изписва се съобщение за успешна поръчка$")
	public void clickMessage(String expectedMessage) throws Throwable {
	    assertEquals(expectedMessage, createOrderModel.getDisplayMessage());
	}


}
