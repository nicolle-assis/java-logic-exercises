package ExerciciosDeLogica;

public class Exercise05_MinimumWageCalculation {
    public static void main(String[] args) {

        double minimumWage = 1293.20;
        double userSalary = 2156.98;
        double numberOfMinimumWages = userSalary / minimumWage;

        System.out.println("Salário do Usuário: R$"+userSalary);
        System.out.println("Salário mínimo: R$"+minimumWage);
        System.out.println("Usuário ganha "+ numberOfMinimumWages +" salários mínimos.");

    }
}
