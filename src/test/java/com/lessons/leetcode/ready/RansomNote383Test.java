package com.lessons.leetcode.ready;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RansomNote383Test {

    private final RansomNote383 ransomNote383 = new RansomNote383();

    @Test
    public void testCanConstructWhenRansomNoteCanBeConstructedThenReturnTrue() {
        // Arrange
        String ransomNote = "abc";
        String magazine = "abcdef";

        // Act
        boolean result = ransomNote383.canConstruct(ransomNote, magazine);

        // Assert
        Assertions.assertTrue(result);
    }

    @Test
    public void testCanConstructWhenRansomNoteCannotBeConstructedThenReturnFalse() {
        // Arrange
        String ransomNote = "abc";
        String magazine = "def";

        // Act
        boolean result = ransomNote383.canConstruct(ransomNote, magazine);

        // Assert
        Assertions.assertFalse(result);
    }

    @Test
    public void testCanConstructWhenRansomNoteIsLongerThanMagazineThenReturnFalse() {
        // Arrange
        String ransomNote = "abcdef";
        String magazine = "abc";

        // Act
        boolean result = ransomNote383.canConstruct(ransomNote, magazine);

        // Assert
        Assertions.assertFalse(result);
    }

    @Test
    public void testCanConstructWhenBothEmptyThenReturnTrue() {
        // Arrange
        String ransomNote = "";
        String magazine = "";

        // Act
        boolean result = ransomNote383.canConstruct(ransomNote, magazine);

        // Assert
        Assertions.assertTrue(result);
    }

    @Test
    public void testCanConstructWhenRansomNoteIsSubsetOfMagazineThenReturnTrue() {
        // Arrange
        String ransomNote = "abc";
        String magazine = "abcdefabc";

        // Act
        boolean result = ransomNote383.canConstruct(ransomNote, magazine);

        // Assert
        Assertions.assertTrue(result);
    }
}