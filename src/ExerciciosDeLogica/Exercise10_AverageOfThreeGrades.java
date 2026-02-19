package ExerciciosDeLogica;

public class Exercise10_AverageOfThreeGrades {
    public static void main(String[] args) {

        double[] grades = {7.5, 8.5, 9.5};
        double average = 0;
        double sum = 0;
        int c = 0;

        for (int i = 0; i < grades.length; i++) {

            sum += grades[i];
            c += 1;

            System.out.println(c+"º Nota do aluno: "+grades[i]);
        }
        average = sum / grades.length;


        System.out.println("Média final: "+average);
    }
}
