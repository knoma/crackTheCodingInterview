/**
 * Created by knoma on 10/5/16.
 */
public class Chapter1_9 {


    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle","erbottlewat"));

        
    }

    private static boolean isRotation(String s1, String s2) {

        int length = s1.length();
        if(length == s2.length() && length > 0){
            String s1s2 = s1 + s2;
            return isSubstring(s1s2, s2);
        }
        return false;
    }

    public static boolean isSubstring(String big, String small) {
        if (big.indexOf(small) >= 0) {
            return true;
        } else {
            return false;
        }
    }



}
