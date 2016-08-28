package nyc.c4q.franciscocruz;

/**
 * Created by edisplay on 8/28/16.
 *
 * Q1. add-function

 Write a method named add that takes in two numbers as arguments. The function should return the sum of the two numbers.

 Examples:

 add(1,2);  // returns 3
 add(10,12);  // returns 22
 *
 */
public class ProblemOne {
    public static void main(String[] args) {
        System.out.println(add(10, 12));
    }

    public static int add(int a, int b) {
        int result;

        result = a + b;

        return result;
    }
}
