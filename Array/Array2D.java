package Array;

import java.util.Scanner;
public class PRG_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. Of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter No. Of Columns : ");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.printf("Enter Element [%d][%d] : ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Inserted Matrix");
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.printf(" %d ", matrix[i][j]);
            }
            System.out.println();
        }
        
    }   
}
