package ex20;

import java.util.StringTokenizer;

public class StringTest {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Will Java change my life?");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        String source = "Hi I'm Juwon!!";
        StringTokenizer tokenizer1 = new StringTokenizer(source);
        while (tokenizer1.hasMoreTokens()) {
            System.out.println("tokenizer1's token : " + tokenizer1.nextToken());
        }

        StringTokenizer tokenizer2 = new StringTokenizer(source, " ");
        while (tokenizer2.hasMoreTokens()) {
            System.out.println("tokenizer2's token : " + tokenizer2.nextToken());
        }

        StringTokenizer tokenizer3 = new StringTokenizer(source, " ", true);
        while (tokenizer3.hasMoreTokens()) {
            System.out.println("tokenizer3's token : " + tokenizer3.nextToken());
        }
    }
}
