package uni.pl.fmi;

import static org.junit.Assert.assertEquals;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.CreateOrderModel;

public class MakeOrderSteps {
	CreateOrderModel createOrderModel = new CreateOrderModel();
	
	
	@Given("^������ �� ������ �� ��������� �� �������$")
	public void openScreen() throws Throwable {
	    createOrderModel.navigateToMe();
	    
	}

	@When("^������� �� ����� �� �������$")
	public void addName(String bookName) throws Throwable {
	    createOrderModel.setBookName(bookName);
	}

	@When("^������� �� ����� �� ������$")
	public void addAuthor(String author) throws Throwable {
	    createOrderModel.setAuthorName(author);
	}

	@When("^������� �� ����� �� �������� �� �����$")
	public void clickAddButton() throws Throwable {
	    createOrderModel.clickAddButton();
	}

	@Then("^������� �� ��������� �� ������� �������$")
	public void clickMessage(String expectedMessage) throws Throwable {
	    assertEquals(expectedMessage, createOrderModel.getDisplayMessage());
	}


}
