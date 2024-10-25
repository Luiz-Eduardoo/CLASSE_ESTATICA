package main;

public class Main {
    public static void main(String[] args) {
    	// define o valor de celsius para fazer a conversão
        double celsius = 37.0;
        // chama o metodo especifico de conversão de temperatura
        double fahrenheit = ConversorUnidades.celsiusParaFahrenheit(celsius);
        System.out.println(celsius + " °C é equivalente a " + fahrenheit + " °F");
        // define o valor de quilometros para fazer a conversão
        double quilometros = 3.0;
        // chama o metodo especifico de conversão de quilometragem
        double milhas = ConversorUnidades.quilometrosParaMilhas(quilometros);
        System.out.println(quilometros + " km é equivalente a " + milhas + " mi");
        // define o valor de gramas para fazer a conversão
        double gramas = 2002.0;
        // chama o metodo especifico de conversão de peso
        double libras = ConversorUnidades.gramasParaLibras(gramas);
        System.out.printf(gramas + " g é equivalente a " + libras + " lb");
    }
}