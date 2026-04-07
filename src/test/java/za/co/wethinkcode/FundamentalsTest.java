package za.co.wethinkcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class FundamentalsTest {

    // ============================
    // Question 1 — isPrime
    // ============================

    @Test
    public void isPrime_returnsTrueForSmallPrimes() {
        assertTrue(Fundamentals.isPrime(2));
        assertTrue(Fundamentals.isPrime(3));
        assertTrue(Fundamentals.isPrime(5));
        assertTrue(Fundamentals.isPrime(7));
    }

    @Test
    public void isPrime_returnsTrueForLargerPrime() {
        assertTrue(Fundamentals.isPrime(13));
        assertTrue(Fundamentals.isPrime(17));
        assertTrue(Fundamentals.isPrime(97));
    }

    @Test
    public void isPrime_returnsFalseForCompositeNumbers() {
        assertFalse(Fundamentals.isPrime(4));
        assertFalse(Fundamentals.isPrime(9));
        assertFalse(Fundamentals.isPrime(15));
        assertFalse(Fundamentals.isPrime(100));
    }

    @Test
    public void isPrime_returnsFalseForEdgeCases() {
        assertFalse(Fundamentals.isPrime(0));
        assertFalse(Fundamentals.isPrime(1));
        assertFalse(Fundamentals.isPrime(-5));
    }

    // ============================
    // Question 2 — printMultiples
    // ============================

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printMultiples_printsCorrectMultiplesOf3() {
        Fundamentals.printMultiples(3, 12);
        String output = outContent.toString().trim();
        String[] lines = output.split("\\r?\\n");
        assertEquals(4, lines.length);
        assertEquals("3", lines[0]);
        assertEquals("6", lines[1]);
        assertEquals("9", lines[2]);
        assertEquals("12", lines[3]);
    }

    @Test
    public void printMultiples_printsCorrectMultiplesOf5() {
        Fundamentals.printMultiples(5, 20);
        String output = outContent.toString().trim();
        String[] lines = output.split("\\r?\\n");
        assertEquals(4, lines.length);
        assertEquals("5", lines[0]);
        assertEquals("10", lines[1]);
        assertEquals("15", lines[2]);
        assertEquals("20", lines[3]);
    }

    @Test
    public void printMultiples_limitLessThanN_printsNothing() {
        Fundamentals.printMultiples(10, 5);
        String output = outContent.toString().trim();
        assertEquals("", output);
    }

    @Test
    public void printMultiples_exactLimit_includesLimit() {
        Fundamentals.printMultiples(7, 7);
        String output = outContent.toString().trim();
        assertEquals("7", output);
    }

    // ============================
    // Question 3 — gradeScore
    // ============================

    @Test
    public void gradeScore_returnsInvalidForNegative() {
        assertEquals("Invalid", Fundamentals.gradeScore(-1));
        assertEquals("Invalid", Fundamentals.gradeScore(-100));
    }

    @Test
    public void gradeScore_returnsInvalidForOver100() {
        assertEquals("Invalid", Fundamentals.gradeScore(101));
        assertEquals("Invalid", Fundamentals.gradeScore(200));
    }

    @Test
    public void gradeScore_returnsDistinction() {
        assertEquals("Distinction", Fundamentals.gradeScore(75));
        assertEquals("Distinction", Fundamentals.gradeScore(90));
        assertEquals("Distinction", Fundamentals.gradeScore(100));
    }

    @Test
    public void gradeScore_returnsMerit() {
        assertEquals("Merit", Fundamentals.gradeScore(60));
        assertEquals("Merit", Fundamentals.gradeScore(70));
        assertEquals("Merit", Fundamentals.gradeScore(74));
    }

    @Test
    public void gradeScore_returnsPass() {
        assertEquals("Pass", Fundamentals.gradeScore(50));
        assertEquals("Pass", Fundamentals.gradeScore(55));
        assertEquals("Pass", Fundamentals.gradeScore(59));
    }

    @Test
    public void gradeScore_returnsFail() {
        assertEquals("Fail", Fundamentals.gradeScore(0));
        assertEquals("Fail", Fundamentals.gradeScore(30));
        assertEquals("Fail", Fundamentals.gradeScore(49));
    }

    // ============================
    // Question 4 — longestWord
    // ============================

    @Test
    public void longestWord_returnsLongestInSimpleSentence() {
        assertEquals("quick", Fundamentals.longestWord("The quick brown fox"));
    }

    @Test
    public void longestWord_handlesExtraSpaces() {
        assertEquals("quick", Fundamentals.longestWord("The   quick   brown   fox"));
    }

    @Test
    public void longestWord_returnsFirstOnTie() {
        assertEquals("quick", Fundamentals.longestWord("quick brown"));
    }

    @Test
    public void longestWord_singleWord() {
        assertEquals("hello", Fundamentals.longestWord("hello"));
    }

    @Test
    public void longestWord_longestAtEnd() {
        assertEquals("elephant", Fundamentals.longestWord("a big elephant"));
    }

    @Test
    public void longestWord_longestAtStart() {
        assertEquals("wonderful", Fundamentals.longestWord("wonderful day"));
    }

    @Test
    public void longestWord_handlesLeadingAndTrailingSpaces() {
        assertEquals("testing", Fundamentals.longestWord("  testing spaces  "));
    }
}
