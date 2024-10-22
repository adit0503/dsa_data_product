package com.karumanchi.linkedlist;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class LL_Tests {
    
    @Test
    public void traverse_test() {
        assertArrayEquals(LinkedList.traverse_ll(new int[]{1,2,3,4,5}), new int[]{1,2,3,4,5});
    }
}
