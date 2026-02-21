package ExerciciosDeLogica;

public class Exercise15_TriangleType {
    public static void main(String[] args) {

        int sideA = 5;
        int sideB = 5;
        int sideC = 10;

        System.out.println("Os lados A)"+sideA+" - B)"+sideB+" - C)"+sideC);

        if (sideA < (sideB + sideC) && (sideB < sideA + sideC) && (sideC < sideA + sideB)){
            System.out.println("Podem formar um triângulo");

            if ((sideA == sideB) && (sideB == sideC)) {
                System.out.println("Triângulo Equilátero");
            } else if ((sideA == sideB) || (sideA == sideC) || (sideA == sideC)) {
                System.out.println("Triângulo Isosceles");
            }else{
                System.out.println("Triângulo Escaleno");
            }

        }else{
            System.out.println("Não podem formar um triângulo");
        }

    }
}
