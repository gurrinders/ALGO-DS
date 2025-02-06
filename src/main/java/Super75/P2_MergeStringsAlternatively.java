package Super75;

public class P2_MergeStringsAlternatively {

    public String mergeAlternately(String word1, String word2) {
        int l = 0;
        int l1 = word1.length();
        int l2 = word2.length();
        String last = null;

        if (l1 == l2) {
            l=l1;
            last = "";
        } else if (l1 < l2) {
            l = l1;
            last = word2.substring(l1, l2);
        } else {
            l = l2;
            last = word1.substring(l2, l1);
        }

        String s = "";
        for (int i = 0, j = 0; i < l; i++, j++) {
            s = s + word1.charAt(i) + word2.charAt(j);
        }

        System.out.println(s + last);
        return s + last;
    }

    public static void main(String[] args) {
        new P2_MergeStringsAlternatively().mergeAlternately("abc1234", "pqrse9876");
    }
}
