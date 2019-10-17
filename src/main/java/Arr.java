public class Arr {

    public static void main(String[] args) {
        int[][] intArray = new int[2][3];
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0 ; j < intArray[i].length; j++){
                intArray[i][j] = i + j;
                System.out.println(intArray[i][j]);
            }
        }
    }
}
