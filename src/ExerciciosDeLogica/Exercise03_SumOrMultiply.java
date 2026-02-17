package ExerciciosDeLogica;

public class Exercise03_SumOrMultiply {
    public static void main(String[] args) {

        int valueA = 7;
        int valueB = 7;
        int resultC;

        if(valueA==valueB){
            resultC = valueA + valueB;
            System.out.println("Os valores "+valueA+" e "+valueB+" são iguais.");
        }else{
            resultC = valueA * valueB;
            System.out.println("Os valores "+valueA+" e "+valueB+" são diferentes.");
        }

        System.out.println("Resultado: "+resultC);
    }
}
