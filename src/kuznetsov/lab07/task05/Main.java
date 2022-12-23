package kuznetsov.lab07.task05;

public class Main implements Stringable{
    @Override
    public int char_counter(String str) {
        int i = 0;
        int cnt = 0;
        while (i != str.length()) {
            cnt++;
            i++;
        }
        return cnt;
    }

    @Override
    public String odd_positioner(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i+=2) {
            ans += str.charAt(i);
        }
        return ans;
    }

    @Override
    public String reverser(String str) {
        String ans = "";
        for(int i = str.length() - 1; i >= 0; i--){
            ans += str.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Stringable test = new Main();
        System.out.println("Char_counter of string 'I like Java': " + test.char_counter("I like Java"));
        System.out.println("Odd_positioner of string 'It likes me': " + test.odd_positioner("It likes me"));
        System.out.println("Reverser for string 'Andrew': " + test.reverser("Andrew"));
    }
}