import java.util.Scanner;

public class Max2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[4][2];

        for (int i = 0; i < 4;i++){
            for (int j = 0; j < 2; j++){
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }

        int max = array[0][0];
        for (int i = 0; i< 4; i++){
            for (int j =0; j< 2;j++){
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }

        System.out.println("The max element in array is: " + max);
    }
}
