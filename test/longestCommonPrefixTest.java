package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import src.longestCommonPrefix;



public class longestCommonPrefixTest {
    private longestCommonPrefix longestCommonPrefix;

    @Test

    public void testGetLongestCommonPrefix() {
        String[] input = {"flower","flow","flight"};
        String expectedOutput = "fl";
        String result = longestCommonPrefix.getLongestCommonPrefix(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testIsCommonPrefix() {
        String[] input = {"dog", "racecar", "flight"};
        String expectedOutput ="";
        String result = longestCommonPrefix.getLongestCommonPrefix(input);
        assertEquals(expectedOutput, result);
    }
}
