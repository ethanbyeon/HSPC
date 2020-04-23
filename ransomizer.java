
import java.util.*;

class ransomizer {

    static Scanner in;

    static String note, magazine;

    public static void main(String[] args) {
        try {
            in = new Scanner(System.in);
            init();
            in.close();
        }catch(Exception e) {
			e.printStackTrace();
		}
    }

    static void init() {
        note = in.nextLine().replaceAll("[^a-z]", "");
        magazine = in.nextLine().replaceAll("[^a-z]", "");

        System.out.println(ransomize(note, magazine));
    }

    static boolean ransomize(String n, String m) {
        
        boolean check = true;

        int[] rletter = new int[26];
        int[] nletter = new int[26];

        for(int i = 0; i < n.length(); i++) {
            int c = n.charAt(i) - 'a';
            rletter[c]++;
        }

        for(int i = 0; i < m.length(); i++) {
            int c = m.charAt(i) - 'a';
            nletter[c]++;
        }

        for(int i = 0; i < 26; i++) {
            if(nletter[i] < rletter[i]) check = false;
        }

        return check;
    }
}