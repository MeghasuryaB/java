
import java.util.*;

class hex1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] inp = new String[n];
        for (int i = 0; i < n; i++) {
            inp[i] = s.next();
        }
        List<String> oddst = new ArrayList<>();
        for (String str : inp) {
            if (str.length() % 2 == 1) {
                oddst.add(str);
            }
        }
        if (oddst.size() == 0) {
            System.out.println("better luck next time");
        } else {

            int a = -1;
            String res = "";
            for (String temp : oddst) {
                if (temp.length() > a) {
                    a = temp.length();
                    res = temp;

                }
            }
            System.out.println(res);
        }
    }
}
