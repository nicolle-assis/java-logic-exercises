package ExerciciosDeLogica;

import java.util.random.RandomGenerator;

public class Exercise20_RandomNumberGenerator {
    public static void main(String[] args) {

        RandomGenerator generator = RandomGenerator.getDefault();

        int randomNum = generator.nextInt(0, 101) ;

        System.out.println("Número aleatório entre 0 até 100: "+randomNum);

    }
}
