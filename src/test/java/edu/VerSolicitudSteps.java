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
		Selenide.open("http://localhost:4567/versolicitud.wm");
	    throw new PendingException();
	}

	@When("^y recibo el identificador \"([^\"]*)\"$")
	public void y_recibo_el_identificador(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^valido que el identificador \"([^\"]*)\" no este vacio$")
	public void valido_que_el_identificador_no_este_vacio(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^verifico que \"([^\"]*)\" exista en la lista de solicitudes$")
	public void verifico_que_exista_en_la_lista_de_solicitudes(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	
}
