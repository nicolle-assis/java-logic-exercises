package ExerciciosDeLogica;

public class Exercise08_DescendinOrder {
    public static void main(String[] args) {

        int[] value = {32, 25, 92};

        for (int i = 0; i < 3; i++) {

            int maxIndex = 0;

            for (int j = 1; j < value.length; j++) {

                if (value[j]>maxIndex){
                    maxIndex = j;
                }

            }

            System.out.println(value[maxIndex]);
            value[maxIndex] = Integer.MIN_VALUE;
        }
        
    }
}
