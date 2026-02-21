package ExerciciosDeLogica;

public class Exercise21_IntegerDivision {
    public static void main(String[] args) {

        int numA = 20;
        int numB = 3;

        if (numB != 0){
            int quotient = numA / numB;
            int remainder = numA % numB;

            System.out.println("Resultado da divisão de "+numA+" por "+numB+" = "+quotient);
            System.out.println("Resto da divisão = "+remainder);
        }else{
            System.out.println("Erro: divisão por zero não é permitida.");
        }

    }
}
