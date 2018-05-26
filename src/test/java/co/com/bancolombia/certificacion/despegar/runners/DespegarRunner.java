package co.com.bancolombia.certificacion.despegar.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/consulta_tiquetes.feature", 
		glue="co.com.bancolombia.certificacion.despegar.step_definitions"
)
public class DespegarRunner {

}
