public class Main {
    public static void main(String[] args) {


    int[] myArray = {1, 2, 3, 4, 5};

        System.out.println(comparador(myArray));
        System.out.println(twoSmallestNumbers(myArray));


    double x = 2;
    double y = 4;

        System.out.println(resolve(x, y));

    }

    public static String comparador (int[]myArray){

        int maxNumber = myArray[0];
        int minNumber = myArray[0];

        for(int i = 1 ; i < myArray.length; i++) {
        if (myArray[i] > maxNumber) {
            maxNumber = myArray[i];
        }
        for( int j = 1 ; j < myArray.length; j++) {
            if (myArray[j] < minNumber) {
                minNumber = myArray[j];
            }
        }

        }
        return "El número más grande es " + maxNumber + " mientras que el más pequeño es " + minNumber + " y la diferencia es " + (maxNumber - minNumber) + ".";
        }



        public static String twoSmallestNumbers (int[] myArray){

        int minNumber = myArray[0];
        int secondMinNumber = myArray[0];

        for (int i = 0; i < myArray.length; i++){
            if(myArray[i] < minNumber ) {
                minNumber = myArray[i];
            }
        }

        if(minNumber == secondMinNumber){
            secondMinNumber = myArray[1];
        }
            for (int i = 0; i < myArray.length; i++){
                if(myArray[i] != minNumber && myArray[i] < secondMinNumber ) {
                    secondMinNumber = myArray[i];
                }
            }

          return  "El mas pequeño es " + minNumber + " y el segundo más pequeño es " + secondMinNumber + ".";

        }


        public static double resolve (double x, double y ){

        return (double) (Math.pow(x,2) + Math.pow(((4 * y) / 5) - x, 2));
        }

}