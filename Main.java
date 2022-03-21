/**
 * 
 * Implement Fizz Buzz Game with TDD
 * 
 * Players generally sit in a circle. The player designated to go first says the number "1",
 * and each player thenceforth counts one number in turn.
 * However, any number divisible by three is replaced by the word fizz and any number divisible by five by the word buzz.
 * Numbers divisible by 15 become fizz buzz.
 * A player who hesitates or makes a mistake is eliminated from the game.
 *
 * For example, a typical round of fizz buzz would start as follows:
 * 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 
 * 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 
 * 31, 32, Fizz, 34, Buzz, Fizz, ...
 *
 * @author <student 1 name>, <student 2 name>
 */

public class Main { 
    
    /**
	 * Process a number
	 * @param num a number
	 * @return a string corresponds to that number
	 */
	public static String processNumber(int num) {
        // TODO: Write your code here
        return "1";
    }
    
    /**
	 * Process numbers
	 * @param nums an array of numbers
	 * @return a string corresponds to that numbers array
	 */
	public static String processNumbers(int[] nums) {
        // TODO: Write your code here
        return "";
    }
    
    /**
	 * Test processNumber
	 */
    private static void testProcessNumber() {
        System.out.println("Running processNumber test cases");
        // TODO: Write test cases for processNumber here using assertEquals
        // E.g., assertEquals(processNumber(1), "1");
      assertEquals(processNumber(1), "1");
    }
    
    /**
	 * Test processNumbers
	 */
    private static void testProcessNumbers() {
        System.out.println("Running processNumbers test cases");
        // TODO: Write test cases for processNumbers here using assertEquals
        // E.g., assertEquals(processNumbers(new int[] {1}), "1");
      assertEquals(processNumbers(new int[] {1}), "1");
    }

    /**
	 * Implement assertEquals, print out Pass if actual string equals to expected; fail otherwise
	 * @param actual actual string
	 * @param expected expected string     
	 */
    private static void assertEquals(String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println("Pass");
        }
        else {
            System.out.println(String.format("Fail: expected: %s, actual: %s", expected, actual));
        }
    }
    
    public static void main(String[] args) {
        testProcessNumber();
        testProcessNumbers();
    }
}
