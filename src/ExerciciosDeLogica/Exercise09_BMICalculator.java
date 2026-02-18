package ExerciciosDeLogica;

public class Exercise09_BMICalculator {
    public static void main(String[] args) {

        double personWeight = 52.5;
        double personHeight = 1.65;
        double personBMI = personWeight / (personHeight * personHeight);

        System.out.println("Seu IMC é: " + personBMI);

        if (personBMI <= 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (personBMI <= 24.9) {
            System.out.println("Classificação: Peso ideal");
        } else if (personBMI <= 29.9) {
            System.out.println("Classificação: Levemente acima do peso");
        } else if (personBMI <= 34.9) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (personBMI <= 39.9) {
            System.out.println("Classificação: Obesidade Grau II (Severo)");
        } else if (personBMI >= 40) {
            System.out.println("Classificação: Obesidade Grau III (mórbida)");
        }

    }
}
