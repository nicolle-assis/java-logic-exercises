package ExerciciosDeLogica;

public class Exercise02_NumberClassification {
    public static void main(String[] args) {
        int value = 7;

        if(value%2==0){
            System.out.print("Valor " + value + " é PAR");
        }else System.out.print("Valor " + value + " é ÍMPAR");

        if(value<=0){
            System.out.print(" - Negativo");
        }else{
            System.out.print(" - Positivo");
        }
    }
}
