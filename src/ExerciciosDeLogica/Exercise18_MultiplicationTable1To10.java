package ExerciciosDeLogica;

public class Exercise18_MultiplicationTable1To10 {
    public static void main(String[] args) {

        int value = 1;
        int product = 1;

        while (value <= 10){
            for (int i = 1; i <= 10; i++) {
                System.out.println(product + " x " + i + " = " + product * i);
            }
            product++;
            System.out.println("--------------");
            value++;
        }
    }
}
