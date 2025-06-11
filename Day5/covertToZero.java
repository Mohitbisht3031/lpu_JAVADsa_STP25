package Day5;

public class covertToZero {
    int[][] convertToZeroArray(int mat[][]){
        int r[] = new int[mat.length];
        int c[] = new int[mat[0].length];
        for(int i = 0 ;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                if(mat[i][j] == 0){
                    r[i] = 1;
                    c[j] = 1;
                }
            }
        }

        for(int i = 0 ;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                if(r[i] == 1 || c[j] == 1){
                    mat[i][j] = 0;
                }
            }
        }
        return mat;
    }
}
