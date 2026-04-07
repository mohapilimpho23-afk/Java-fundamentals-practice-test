package za.co.wethinkcode;

public class Fundamentals {

   
    // Question 1
    // Fix the three errors in this method:
    //   1. The loop condition is wrong (hint: you don't need to check up to n * n as-is)
    //   2. The operator in the if-statement is broken
    //   3. The return value inside the if-block is wrong
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n * n; i++) {    // fix the loop condition
            if (n % i =- 0) {                 // fix the operator
                return true;                  // fix this return value
            }
        }
        return false;
    }


    // TODO: Question 2
    // Fix the two errors in this method:
    //   1. The increment operator is broken (hint: it should add n each time, not set)
    //   2. The comparison operator inside the if-statement is wrong
    public static void printMultiples(int n, int limit) {
        for (int i = n; i <= limit; i =+ n) {   // fix the increment
            if (i % n = 0) {                      // fix the comparison operator
                System.out.println(i);
            }
        }
    }


    // Question 3
    // Complete all the missing conditions and the final return statement.
    public static String gradeScore(int score) {
        if (          ) {         // fix: check for invalid range (below 0 or above 100)
            return "Invalid";
        } else if (   ) {         // fix: distinction (75 and above)
            return "Distinction";
        } else if (   ) {         // fix: merit (60 and above)
            return "Merit";
        } else if (   ) {         // fix: pass (50 and above)
            return "Pass";
        } else {
            return ;              // fix: what should be returned for a failing score?
        }
    }


    // Question 4
    // Implement this method from scratch.
    // It must return the longest word in the sentence.
    // If two words share the same length, return the first one found.
    // Ignore extra spaces between words.
    // Example: longestWord("The quick brown fox") -> "quick"
    public static String longestWord(String sentence) {

        return longestWord;
    }

}
