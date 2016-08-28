package nyc.c4q.franciscocruz;

/**
 * Created by edisplay on 8/28/16.
 *
 * Q3. exes-and-ohs

 Check to see if a string has the same count of 'x's and 'o's. The method must return a boolean and be case insensitive.
 The string may contain any Unicode character -- not just 'x's and 'o's -- and may be of any length.

 Example outputs:

 XO("ooxx")    // returns true
 XO("xooxx")   // returns false
 XO("ooxXm")   // returns true
 XO("zpzpzpp") // returns true because zero 'x's and 'o's are present
 XO("zzoo")    // returns false
 *
 */
public class ProblemThree {
    public static void main(String[] args) {
        System.out.println(sameXo("ooxx"));
    }

    public static boolean sameXo(String xo) {
        boolean isSameCount = false;
        int totalX = 0;
        int totalO = 0;

        for (int i = 0; i < xo.length(); i++) {
            if (Character.toLowerCase(xo.charAt(i)) == 'x') {
                totalX++;
            }
            if (Character.toLowerCase(xo.charAt(i)) == 'o') {
                totalO++;
            }
        }

//        if (totalX == totalO) {
//            isSameCount =  true;
//        }
//        return isSameCount;
        //or
        return totalX == totalO;
    }
}
