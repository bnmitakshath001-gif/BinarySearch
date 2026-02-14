package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    BinarySearch bs = new BinarySearch();

    @Test
    void testElementFound() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(2, bs.search(arr, 5));
    }

    @Test
    void testElementNotFound() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(-1, bs.search(arr, 4));
    }

    @Test
    void testFirstElement() {
        int[] arr = {2, 4, 6, 8};
        assertEquals(0, bs.search(arr, 2));
    }

    @Test
    void testLastElement() {
        int[] arr = {2, 4, 6, 8};
        assertEquals(3, bs.search(arr, 8));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, bs.search(arr, 10));
    }
}
