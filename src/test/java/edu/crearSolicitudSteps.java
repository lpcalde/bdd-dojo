package edu;

import com.codeborne.selenide.Selenide;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class crearSolicitudSteps {

	@Given("^creo una solicitud$")
	public void creo_una_solicitud() throws Throwable {
		Selenide.open("http://localhost:4567/");
	}

	@When("^seleccione el area que involucra la solucion \"([^\"]*)\"$")
	public void seleccione_el_area_que_involucra_la_solucion(String area) throws Throwable {
		$(By.id("area")).setValue(area);
	}

	@When("^ingrese el titulo de la solicitud \"([^\"]*)\"$")
	public void ingrese_el_titulo_de_la_solicitud(String titulo) throws Throwable {
		$(By.id("titulo")).setValue(titulo);
	}

	@When("^digitar la descripcion de la solicitud \"([^\"]*)\"$")
	public void digitar_la_descripcion_de_la_solicitud(String descripcion) throws Throwable {
		$(By.id("descripcion")).setValue(descripcion);
	}

	@Then("^se registrara el ticket \"([^\"]*)\"$")
	public void se_generara_un_mensaje_de(String linkId) throws Throwable {
		 $(By.id(linkId)).click();
	}
	
	/*
	@Then("^se registrara el ticket$")
	public void se_registrara_el_ticket() throws Throwable {
		$(By.id(linkId)).click();
	}*/

	@Given("^soy un agente disparador a la espera de peticiones$")
	public void soy_un_agente_disparador_a_la_espera_de_peticiones() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^recibo los datos de una nueva solicitud$")
	public void recibo_los_datos_de_una_nueva_solicitud() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^construyo el mensaje de la notificación$")
	public void construyo_el_mensaje_de_la_notificación() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^busco el correo electronico del cliente de la solicitud$")
	public void busco_el_correo_electronico_del_cliente_de_la_solicitud() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^envio el mensaje construido al correo electronico$")
	public void envio_el_mensaje_construido_al_correo_electronico() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}


}
