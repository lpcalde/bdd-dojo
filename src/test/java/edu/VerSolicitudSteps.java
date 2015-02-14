package edu;

import com.codeborne.selenide.Selenide;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class VerSolicitudSteps {


	@Given("^estoy en la pantalla ver solicitud$")
	public void estoy_en_la_pantalla_ver_solicitud() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^y recibo el identificador \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void y_recibo_el_identificador_(String arg1, String arg2, String arg3) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^visualizo los datos en la pantalla$")
	public void visualizo_los_datos_en_la_pantalla() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	
}
