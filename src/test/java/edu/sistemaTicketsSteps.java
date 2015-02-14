package edu;

import com.codeborne.selenide.Selenide;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class sistemaTicketsSteps {

	@Given("^ingreso al sistema de tickets$")
	public void ingreso_al_sistema_de_tickets() throws Throwable {
		Selenide.open("http://localhost:4567/");
	}

	@When("^seleccionar  \"([^\"]*)\"$")
	public void seleccionarCrear(String arg1) throws Throwable {
		Selenide.open("http://localhost:4567/crearsolicitud");
	}

	@When("^seleccionar \"([^\"]*)\"$")
	public void seleccionarListar(String arg1) throws Throwable {
		Selenide.open("http://localhost:4567/versolicitud");
	}

	@Then("^visualizar \"([^\"]*)\"$")
	public void visualizar(String mensaje) throws Throwable {
		$(By.id("welcome")).setValue(mensaje);
	}


}
