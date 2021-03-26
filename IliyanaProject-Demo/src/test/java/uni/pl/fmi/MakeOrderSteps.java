package uni.pl.fmi;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.CreateOrderModel;

public class MakeOrderSteps {
	CreateOrderModel createOrderModel = new CreateOrderModel();
	
	@Given("^Отваря се екрана за създаване на поръчки$")
	public void openScreen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Въвежда се името на книгата$")
	public void addName() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Въвежда се името на автора $")
	public void addAuthor() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Натиска се бутон за добавяне на книга$")
	public void clickAddButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Изписва се съобщение за успешна поръчка$")
	public void clickMessage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
