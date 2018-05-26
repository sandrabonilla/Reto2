package co.com.bancolombia.certificacion.despegar.model;

public class VueloIdaVuelta {
	
	private final String source;
	private final String target;
	private final String departureDate;
	private final String returnDate;
	
	 public VueloIdaVuelta(String source, String target, String departureDate, String returnDate) {
		 this.source = source;
	     this.target = target;
	     this.departureDate = departureDate;
	     this.returnDate = returnDate;
	}

	public String getSource() {
		return source;
	}

	public String getTarget() {
		return target;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

}
