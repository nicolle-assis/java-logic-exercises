package ExerciciosDeLogica;

public class Exercise23_FuelConsumptionCalculation {
    public static void main(String[] args) {

        double travelTime = 3.0;
        double averageSpeed = 100.0;

        double distance = travelTime * averageSpeed;
        double literUsed = distance / 12;

        System.out.println("Tempo de viagem: "+ travelTime);
        System.out.println("Velocidade média: "+averageSpeed+"km/hr");
        System.out.println("Distância: "+ distance);
        System.out.println("Lítros usados: "+ literUsed +"l");
    }
}
