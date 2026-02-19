package ExerciciosDeLogica;

public class Exercise11_StudentAverageStatus {
    public static void main(String[] args) {

        double[] grade = {7.5,6.5,8.5,7.5};
        double average = 0;
        double sum = 0;
        String name = "Nicolle";

        for (int i = 0; i < grade.length; i++){
            sum += grade[i];
        }
        average = sum / grade.length;

        System.out.println("A aluna: "+name);

        if (average>=7.0){
            System.out.println("Foi Aprovada(o)!!");
        }else{
            System.out.println("Foi reprovada(o)");
        }

        System.out.println("Com uma média de: "+average);
    }
}
