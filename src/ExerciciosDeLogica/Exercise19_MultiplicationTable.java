package ExerciciosDeLogica;

public class Exercise19_MultiplicationTable {
    public static void main(String[] args) {

        int value = 10;

        System.out.println("Tabuada de "+value);
        System.out.println("----------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" x "+value+" = "+i * value);
        }
    }
}
