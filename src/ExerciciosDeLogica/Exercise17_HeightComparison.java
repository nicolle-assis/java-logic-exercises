package ExerciciosDeLogica;

public class Exercise17_HeightComparison {
    public static void main(String[] args) {

        int heightFrancisco = 150;
        int heightSara = 110;
        int years = 0;

        while (heightFrancisco <= heightSara){
            heightFrancisco += 2;
            heightSara += 3;
            years ++;
        }

        System.out.println("Altura de Francisco: "+heightFrancisco+"cm");
        System.out.println("Altura de Sara: "+heightSara+"cm");
        System.out.println("Anos que se passaram: "+years);
    }
}
