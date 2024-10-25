package main;
// classe com os metodos estaticos
public class ConversorUnidades {
	// metodo estatico para calcular celsius para fahrenheit
	public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }
	// metodo estatico para calcular quilometros para milhas
    public static double quilometrosParaMilhas(double quilometros) {
        return quilometros * 0.6214;
    }
    // metodo estatico para calcular gramas para libras
    public static double gramasParaLibras(double gramas) {
        return gramas * 0.0022046;
    }
}
