package ExerciciosDeLogica;

public class Exercise13_SwapValues {
    public static void main(String[] args) {

        int valueA = 3;
        int valueB = 6;
        int swap;

        System.out.println("Valor de A antes da troca: "+valueA);
        System.out.println("Valor de B antes da troca: "+valueB);

        swap = valueA;
        valueA = valueB;
        valueB = swap;

        System.out.println("Valor de A depois da troca: "+valueA);
        System.out.println("Valor de B depois da troca: "+valueB);
    }
}
