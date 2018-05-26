package co.com.bancolombia.certificacion.despegar.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class VuelosDisponibles {
	public static final Target PRICE_ONE = Target.the("First price").locatedBy("//*[@id=\"clusters\"]/span[1]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]");
	public static final Target PRICE_TWO = Target.the("Second price").locatedBy("//*[@id=\"clusters\"]/span[2]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]");
	public static final Target PRICE_THREE = Target.the("Second price").locatedBy("//*[@id=\"clusters\"]/span[3]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]");
	public static final Target PRICE_FOUR = Target.the("Second price").locatedBy("//*[@id=\"clusters\"]/span[4]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]");
	public static final Target PRICE_FIVE = Target.the("Second price").locatedBy("//*[@id=\"clusters\"]/span[5]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]");
	public static final Target PRICE_SIX = Target.the("Second price").locatedBy("//*[@id=\"clusters\"]/span[6]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]");
	public static final Target PRICE_SEVEN = Target.the("Second price").locatedBy("//*[@id=\"clusters\"]/span[7]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]");
}
