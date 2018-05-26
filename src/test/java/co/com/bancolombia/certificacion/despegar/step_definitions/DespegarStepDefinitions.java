package co.com.bancolombia.certificacion.despegar.step_definitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnTarget;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static org.hamcrest.number.OrderingComparison.greaterThan;

import co.com.bancolombia.certificacion.despegar.model.VueloIdaVuelta;
import co.com.bancolombia.certificacion.despegar.question.TheAvailableFlights;
import co.com.bancolombia.certificacion.despegar.tasks.BuscarVueloIdaRegreso;
import co.com.bancolombia.certificacion.despegar.tasks.Navegar;
import co.com.bancolombia.certificacion.despegar.user_interface.DespegarHomePage;
import co.com.bancolombia.certificacion.despegar.user_interface.Opcion;
import co.com.bancolombia.certificacion.despegar.util.ExcelConnector;



public class DespegarStepDefinitions {
	
	@Before
	public void set_the_stage() { OnStage.setTheStage(new OnlineCast());
//	
	}

	@Given("(.*) needs to check the availability of flights$")
	public void thatUserNeedTravelTo(String name) throws Exception {
		theActorCalled(name).attemptsTo(Navegar.a(Opcion.SeleccionarViaje));
			
	}


	@When("^she search for economic tickets from (.*) to (.*) departing on (.*) and returning on (.*)$")
	public void she_search_for_economic_tickets_from_Medellin_to_Cartagena(String source, String target, String departureDate, String returnDate ) throws Exception {
		theActorInTheSpotlight().attemptsTo(BuscarVueloIdaRegreso.conInfo(new VueloIdaVuelta(source, target, departureDate, returnDate)));
	}


	@Then("^she should see the list of available flights$")
	public void she_should_see_the_list_of_available_flights() throws Exception {
	    theActorInTheSpotlight().should(seeThat(TheAvailableFlights.are(), greaterThan(0)));
	}

	
	
}
