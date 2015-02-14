package edu;

import com.codeborne.selenide.Selenide;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ListadoSolicitudesSteps {

	@Given("^en la pantalla principal$")
	public void en_la_pantalla_principal() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^presiono en el item \"([^\"]*)\"$")
	public void presiono_en_el_item(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^visualizo las solicitudes registradas con su respectivo titulo, descripcion y estado$")
	public void visualizo_las_solicitudes_registradas_con_su_respectivo_titulo_descripcion_y_estado() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}


	
}
