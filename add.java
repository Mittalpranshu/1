public class add {
    public static void main(String[] args) {
        int[][] mat1 = new int[2][3];
        mat1[0][0] = 1;
        mat1[0][1] = 2;
        mat1[0][2] = 3;
        mat1[1][0] = 4;
        mat1[1][1] = 5;
        mat1[1][2] = 6;
        int[][] mat2 = new int[2][3];
        mat2[0][0] = 7;
        mat2[0][1] = 8;
        mat2[0][2] = 9;
        mat2[1][0] = 10;
        mat2[1][1] = 11;
        mat2[1][2] = 12;
        int[][] mat3 = { { 0, 0, 0 }, { 0, 0, 0 } };
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
