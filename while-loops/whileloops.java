
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class whileloops
{
    public static void main(String[] args) {
        int i = 0;
        int k = 11;
        int a = 0;
        int b = 0;
        while (i < 15) {
            System.out.println("i is" + " " + i + " " + "but less than 15");
            i = i + 5;
        }
        while (k > 5) {
            System.out.println ("k is" + " " + k + " " + "but greater than 5");
            k = k - 2; 
        }
        while ((a < 10) && (b <= 20)) {
            System.out.println ("a is less than 10" + " " + "and b is less than or equal to 20");
            a = a + 5;
            b = b + 5;
        }
    }
}
 