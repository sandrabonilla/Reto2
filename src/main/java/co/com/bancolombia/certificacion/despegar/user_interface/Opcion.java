package co.com.bancolombia.certificacion.despegar.user_interface;

public enum Opcion {

	SeleccionarViaje("https://www.despegar.com.co/vuelos/");

    private final String url;

    Opcion(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
