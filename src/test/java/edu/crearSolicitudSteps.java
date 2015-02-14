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

}
