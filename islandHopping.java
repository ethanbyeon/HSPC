
import java.util.*;

public class islandHopping {

    static Scanner in;

    static int N;
    static int[] island;

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
        N = in.nextInt();
        island = new int[N];

        for(int i = 0; i < N; i++) island[i] = in.nextInt();
    }

    static boolean solve() {
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {

            }
        }

        return true;
    }

}