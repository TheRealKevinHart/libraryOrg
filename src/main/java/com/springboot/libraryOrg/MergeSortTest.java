package com.springboot.libraryOrg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;

public class MergeSortTest {
    MergeSortExample mergeSortExample;
    Integer[] arrayOfElements = {19, 4, 13, 9, 2, 7, 11};
    @Before
    public void setUp() {
        mergeSortExample = new MergeSortExample();
    }
    @After
    public void tearDown() {
        mergeSortExample = null;
    }
    @Test
    public void mergeSortTest() {
        System.out.println("Array before sorting: " + Arrays.toString(arrayOfElements));
        mergeSortExample.mergeSort(arrayOfElements);
        System.out.println("Sorted array is: " + Arrays.toString(arrayOfElements));
        assertThat(arrayOfElements).containsExactly(2, 4, 7, 9, 11, 13, 19);
    }
}
