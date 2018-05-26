package co.com.bancolombia.certificacion.despegar.tasks;

import co.com.bancolombia.certificacion.despegar.user_interface.DespegarHomePage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.bancolombia.certificacion.despegar.user_interface.Opcion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnTarget;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navegar implements Task{
	
	
	 private final Opcion opcion;

	    public Navegar(Opcion opcion) {
	        this.opcion = opcion;
	    }

	@Override
	@Step("{0} navega a la opci�n #opcion")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.url(opcion.url()),
				WaitUntil.the(DespegarHomePage.CLOSE_MODAL_CLOSE, isVisible()),
				Click.on(DespegarHomePage.CLOSE_MODAL_CLOSE)
				);
	}
	 public static Performable a(Opcion opcion) {
	        return instrumented(Navegar.class, opcion);
	    }
}
