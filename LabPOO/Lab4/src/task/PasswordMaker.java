package task;

import java.util.ArrayList;
import java.util.Random;

public class PasswordMaker {
    static final int MAGIC_NUMBER = 18;
    static final String MAGIC_STRING = "afaraningeinoratsiincasaardefocu";
    private String name;

    public String getRandomString() {
        Random random = new Random();
        ArrayList<Character> string = new ArrayList<>();
        for(int i=0; i<10; i++) {
            Character c = MAGIC_STRING.charAt(random.nextInt(MAGIC_STRING.length()));
            string.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<MAGIC_NUMBER; i++) {
            sb.append(string.get(random.nextInt(string.size())));
        }
        return sb.toString();
    }

    public static int getRandomInt(int min, int max) {
        int x = (int)(Math.random()*((max-min)+1)+min);
        return x;
    }

    public String GetPassword() {
        this.name = "Alex";
        String str1 = this.getRandomString();
        String str2 = str1.concat(String.valueOf(this.name.length()+getRandomInt(0,100)));
        return str2;
    }

    private static PasswordMaker instance = new PasswordMaker();
    private PasswordMaker(){}
    private static int k;
    public static PasswordMaker getInstance() {
        k++;
        return instance;
    }
    public int getCount() { return k;}
}