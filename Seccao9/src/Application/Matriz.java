package Application;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int n=input.nextInt();
        int [][] mat= new int[n][n];

        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                mat[i][j]=input.nextInt();
            }
        }
        System.out.println();
        System.out.println("Main diagonal: ");
        for(int i=0;i<n;i++){
            System.out.print(mat[i][i]+" ");
        }

        int cont=0;

        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (mat[i][j]<0){
                    cont++;
                }
            }
        }
        System.out.println();
        System.out.println("Negative Numberes = "+cont);


        input.close();
    }
}
