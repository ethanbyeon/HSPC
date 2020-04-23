
import java.util.*;

class tridiagonalMatrices {

    static Scanner in;

    static int R, C;
    static int[][] matrix;

    public static void main(String[] args) {
        try {
            in = new Scanner(System.in);
            init();
            System.out.println(solve());
            in.close();
        }catch(Exception e) {
			e.printStackTrace();
		}
    }

    static void init() {
        R = in.nextInt();
        C = in.nextInt();

        matrix = new int[R][C];
        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) matrix[i][j] = in.nextInt();
        }
    }

    static boolean solve() {

        for(int r = 0; r < R; r++) {
            for(int c = 0; c < C; c++) {
                if(Math.abs(r - c) >= 2) {
                    if(matrix[r][c] != 0) return false;
                }
            }
        }

        return true;
    }
}