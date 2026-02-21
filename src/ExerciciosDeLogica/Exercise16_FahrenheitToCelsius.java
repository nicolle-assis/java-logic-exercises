package ExerciciosDeLogica;

public class Exercise16_FahrenheitToCelsius {
    public static void main(String[] args) {

        double fahrenheit = 75;
        double celsius = (fahrenheit - 32) / 1.8;

        System.out.println("Temperatura em Fahrenheit: "+fahrenheit+"º");
        System.out.println("Convertida para Celsius: "+celsius+"º");
    }
}
