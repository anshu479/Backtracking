package BackTracking;

public class FindSubsets {

    private static void findSubsets( String s, String o, int i) {
        if(i == s.length()) {
            System.out.println(o);
            return;
        }

        // not taking character from string s
        findSubsets(s, o, i + 1);


        // taking character i;
        findSubsets(s, o + s.charAt(i), i + 1);

    }

    public static void main(String[] args) {
        String s = "abc";
        String o = "";
        findSubsets(s, o, 0);
    }
}
