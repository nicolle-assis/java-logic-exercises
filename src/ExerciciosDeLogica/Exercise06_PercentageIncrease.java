package ExerciciosDeLogica;

public class Exercise06_PercentageIncrease {
    public static void main(String[] args) {

        double currentSalary = 1800;
        double salaryIncreaseRate = 1.05;
        double adjustedSalary  = currentSalary * salaryIncreaseRate;

        System.out.println("Salário atual: R$"+currentSalary);
        System.out.println("Novo salário com reajuste de 5%: R$"+adjustedSalary);
    }
}
