
import java.util.*;

class hex3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int maxlen = 0;
        int curlen = 0;
        for (int i = 0; i < str.length(); i++) {
            curlen++;
            if (str.charAt(i) == '@' || str.charAt(i) == '$') {
                maxlen = Math.max(curlen, maxlen);
                curlen = 0;
            }
        }
        maxlen = Math.max(maxlen, curlen);
        System.out.println(maxlen);
    }
}
