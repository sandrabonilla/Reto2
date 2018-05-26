package co.com.bancolombia.certificacion.despegar.tasks;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Hit;
import net.thucydides.core.annotations.Step;
import co.com.bancolombia.certificacion.despegar.model.VueloIdaVuelta;
import co.com.bancolombia.certificacion.despegar.user_interface.*;

import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarVueloIdaRegreso implements Task {

	private final VueloIdaVuelta vueloIdaVuelta;

	public BuscarVueloIdaRegreso(VueloIdaVuelta vueloIdaVuelta) {
		this.vueloIdaVuelta = vueloIdaVuelta;
	}

	@Override
	@Step("{0} busca vuelos partiendo desde #origen hasta #destino a partir del dia de #fechaDeSalida")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(DespegarHomePage.ROUND_TRIP_RADIO_BUTTON));
		actor.attemptsTo(Enter.theValue(vueloIdaVuelta.getSource()).into(DespegarHomePage.SOURCE_CITY));
		actor.attemptsTo(Hit.the(Keys.ENTER).into(DespegarHomePage.SOURCE_CITY));
		actor.attemptsTo(Enter.theValue(vueloIdaVuelta.getTarget()).into(DespegarHomePage.TARGET_CITY));
		actor.attemptsTo(Hit.the(Keys.ENTER).into(DespegarHomePage.TARGET_CITY));
		actor.attemptsTo(Click.on(DespegarHomePage.DEPARTURE_DATE_TEXT));
		actor.attemptsTo(Click.on(DespegarHomePage.DEPARTURE_DATE_MON1_SIG));
		actor.attemptsTo(Click.on(DespegarHomePage.DEPARTURE_DATE_MON2_SIG));
		actor.attemptsTo(Click.on(DespegarHomePage.DEPARTURE_DATE_MON3_SIG));
		actor.attemptsTo(Click.on(DespegarHomePage.DEPARTURE_DATE_DAY));
		actor.attemptsTo(Click.on(DespegarHomePage.RETURN_DATE_DAY));
		actor.attemptsTo(Click.on(DespegarHomePage.NUMBERS_OF_PASSENGERS));
		actor.attemptsTo(Click.on(DespegarHomePage.SELECT_NUMBERS_OF_PASSENGERS));
		actor.attemptsTo(Click.on(DespegarHomePage.SAVE_NUMBERS_OF_PASSENGERS));
		actor.attemptsTo(Click.on(DespegarHomePage.SEARCH_TRAVEL));
	}

	public static BuscarVueloIdaRegreso conInfo(VueloIdaVuelta vueloIdaVuelta) {
		return instrumented(BuscarVueloIdaRegreso.class, vueloIdaVuelta);
	}

}
