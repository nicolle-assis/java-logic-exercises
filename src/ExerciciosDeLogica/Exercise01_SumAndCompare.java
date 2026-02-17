package ExerciciosDeLogica;

public class Exercise01_SumAndCompare {
    public void main(String[] args) {

        int valueA = 2;
        int valueB = 5;
        int valueC = 8;

        int sum = valueA + valueB;

        System.out.println("Valores: A)" + valueA + " - B)" + valueB + valueC + " - C)");
        System.out.println("A + B = "+sum);
        System.out.println("A soma é menor que C? "+(sum < valueC));
    }
}
