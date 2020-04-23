
import java.util.*;

class movingMinimum {

    static Scanner in;

    static int N, F;
    static ArrayList<Integer> a;

    public static void main(String[] args) {
        try {
            in = new Scanner(System.in);
            init();
            solve();
            in.close();
        }catch(Exception e) {
			e.printStackTrace();
		}
    }

    static void init() {
        N = in.nextInt();
        a = new ArrayList<Integer>();

        for(int i = 0; i < N; i++) a.add(in.nextInt());

        F = in.nextInt();
    }

    static void solve() {

        ArrayList<Integer> output = new ArrayList<Integer>();
        LinkedList<Integer> temp = new LinkedList<Integer>();
        LinkedList<Integer> temp_s = new LinkedList<Integer>();

        for(int i = 0; i < F; i++) temp.add(a.get(i));

        temp_s.addAll(0, temp);
        Collections.sort(temp_s);
        output.add(temp_s.get(0));

        for(int i = F; i < a.size(); i++) {
            temp.remove(0);
            temp.add(a.get(i));
            temp_s = new LinkedList<Integer>();
            temp_s.addAll(0, temp);
            Collections.sort(temp_s);
            output.add(temp_s.get(0));
        }

        System.out.println(output);
    }
}