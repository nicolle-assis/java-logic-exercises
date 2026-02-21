package ExerciciosDeLogica;

public class Exercise22_TeacherNetSalary {
    public static void main(String[] args) {

        double hourlyRate = 50.0;
        int classesPerMonth = 80;
        double inssPercentage = 14.0;

        double grossSalary = hourlyRate * classesPerMonth;
        double inssDeduction = grossSalary  * (inssPercentage / 100);
        double netSalary = grossSalary - inssDeduction;

        System.out.println("Salário bruto: R$"+grossSalary);
        System.out.println("Desconto INSS: R$"+inssDeduction);
        System.out.println("Salário liquido: R$"+netSalary);

    }
}
