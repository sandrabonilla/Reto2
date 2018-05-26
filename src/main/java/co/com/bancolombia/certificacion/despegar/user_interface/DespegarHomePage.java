package co.com.bancolombia.certificacion.despegar.user_interface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;

public class DespegarHomePage {
	public static final Target CLOSE_MODAL_CLOSE =Target.the("Frame Close Modal").locatedBy("/html/body/div[16]/div/div[1]/span"); 
	public static final Target ROUND_TRIP_RADIO_BUTTON = Target.the("Round trip Radio Button").locatedBy("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[1]/form/span[1]/label/i");
	public static final Target SOURCE_CITY = Target.the("Origin City").locatedBy("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/input");
	public static final Target TARGET_CITY = Target.the("Target City").locatedBy("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/input");
	public static final Target DEPARTURE_DATE_TEXT =Target.the("Departure Date").locatedBy("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input");
	public static final Target DEPARTURE_DATE_MON1_SIG =Target.the("Departure Date mes1").locatedBy("/html/body/div[4]/div/div[2]/div[2]/i");
	public static final Target DEPARTURE_DATE_MON2_SIG =Target.the("Departure Date mes 2").locatedBy("/html/body/div[4]/div/div[2]/div[2]/i");
	public static final Target DEPARTURE_DATE_MON3_SIG =Target.the("Departure Date mes 3").locatedBy("/html/body/div[4]/div/div[2]/div[2]/i");
	public static final Target DEPARTURE_DATE_DAY =Target.the("Departure Date day").locatedBy("/html/body/div[4]/div/div[4]/div[5]/div[4]/span[1]");
	public static final Target RETURN_DATE_DAY= Target.the("return date day").locatedBy("/html/body/div[4]/div/div[4]/div[5]/div[4]/span[29]");
	public static final Target NUMBERS_OF_PASSENGERS = Target.the("Numbers of passagers").locatedBy("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[6]/div[2]/div/input");
	public static final Target SELECT_NUMBERS_OF_PASSENGERS = Target.the("Selectr Numbers of passagers").locatedBy("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/a[2]");
	public static final Target SAVE_NUMBERS_OF_PASSENGERS = Target.the("Save Numbers of passagers").locatedBy("/html/body/div[3]/div/div[2]/a");
	public static final Target SEARCH_TRAVEL = Target.the("Search Travel").locatedBy("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[4]/div/a");

	//public static final Target 
	
	//public static final Target RETURN_DATE =Target.the("Return Date").locatedBy("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[4]/input");

}

//*[@class='_dpmg2--months']//*[@class="_dpmg2--month-title"]//*[@class="_dpmg2--month-title-month" and contains(text(),'Septiembre')]
