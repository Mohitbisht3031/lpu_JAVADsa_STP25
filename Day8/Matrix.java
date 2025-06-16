package Day8;

import java.util.Scanner;

public class Matrix {
    public int mat[][];
    Matrix(int n,int m){
        mat = new int[m][n];
        
        System.out.println("enter the element of the matrix");

        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    Matrix(int m[][]){
        mat = new int[m.length][m[0].length];
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                mat[i][j] = m[i][j];
            }
        }
    }

    void display(int mat[][]){
        for(int i = 0; i<mat.length;i++){
            for(int j = 0 ;j<mat[i].length;j++){
                System.out.print(mat[i][j]+",");
            }
            System.out.println();
        }
    }

    void add(Matrix m){
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                mat[i][j]+=(mat[i][j]+m.mat[i][j]);
            }
        }
    }

    Matrix multiply(Matrix m){
        int r = mat.length;
        int c = m.mat[0].length;
        int res[][] = new int[r][c];

        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<m.mat[0].length;j++){
                for(int k = 0;k<mat[0].length;k++){
                    res[i][j]+= (mat[i][k]*m.mat[k][j]);
                }
            }
        }
        Matrix result = new Matrix(res);
        return result;
    }

}
