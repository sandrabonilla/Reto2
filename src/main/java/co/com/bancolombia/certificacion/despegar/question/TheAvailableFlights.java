package co.com.bancolombia.certificacion.despegar.question;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import co.com.bancolombia.certificacion.despegar.user_interface.VuelosDisponibles;
import co.com.bancolombia.certificacion.despegar.util.ExcelConnector;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheAvailableFlights implements Question<Integer>{

	@Override
	public Integer answeredBy(Actor actor) {
		List<BigDecimal> precios = new ArrayList<>();
		precios.add(new BigDecimal(Double.parseDouble(Text.of(VuelosDisponibles.PRICE_ONE).viewedBy(actor).asString().replace(".", ""))));
		precios.add(new BigDecimal(Double.parseDouble(Text.of(VuelosDisponibles.PRICE_TWO).viewedBy(actor).asString().replace(".", ""))));
		precios.add(new BigDecimal(Double.parseDouble(Text.of(VuelosDisponibles.PRICE_THREE).viewedBy(actor).asString().replace(".", ""))));
		precios.add(new BigDecimal(Double.parseDouble(Text.of(VuelosDisponibles.PRICE_FOUR).viewedBy(actor).asString().replace(".", ""))));
		precios.add(new BigDecimal(Double.parseDouble(Text.of(VuelosDisponibles.PRICE_FIVE).viewedBy(actor).asString().replace(".", ""))));
		precios.add(new BigDecimal(Double.parseDouble(Text.of(VuelosDisponibles.PRICE_SIX).viewedBy(actor).asString().replace(".", ""))));
		precios.add(new BigDecimal(Double.parseDouble(Text.of(VuelosDisponibles.PRICE_SEVEN).viewedBy(actor).asString().replace(".", ""))));
		
		try {
			ExcelConnector.createExcelFile(null, precios);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return precios.size();
	}

	public static TheAvailableFlights are() {
		// TODO Auto-generated method stub
		return new TheAvailableFlights();
	}

}
