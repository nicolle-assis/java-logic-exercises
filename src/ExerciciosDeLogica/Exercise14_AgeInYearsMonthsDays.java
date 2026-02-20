package ExerciciosDeLogica;

public class Exercise14_AgeInYearsMonthsDays {
    public static void main(String[] args) {

        int startDay = 25;
        int startMonth = 5;
        int startYear = 2005;

        int endDay = 19;
        int endMonth = 2;
        int endYear = 2026;

        int totalStartDays = (startYear * 365) + (startMonth * 30) + startDay;

        int totalEndDays = (endYear * 365) + (endMonth * 30) + endDay;

        int differenceInDays = totalEndDays - totalStartDays;

        int years = differenceInDays / 365;
        int remainingDays = differenceInDays - (years * 365) ;
        int months = remainingDays / 30;
        int days = remainingDays - (months * 30);

        System.out.println("Data inicial: "+ startDay +"/"+ startMonth +"/"+ startYear);
        System.out.println("Data final: "+ endDay +"/"+ endMonth +"/"+ endYear);
        System.out.println(years +" anos");
        System.out.println(months +" meses");
        System.out.println(days +" dias");


    }
}
