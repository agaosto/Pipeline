package pl.edu.pw.ee;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {

    private Searcher searcher;

    @Before
    public void setUp() {
        searcher = new BinarySearch();
    }

    @Test
    public void should_ReturnNegativeValue_When_ArrayIsNull() {
        // given
        double[] nums = null;
        double toFind = 0;

        // when
        int result = searcher.search(nums, toFind);

        // then
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    public void should_ReturnNegativeValue_When_ArrayIsEmpty() {
        double[] nums = {};
        double toFind = 0;

        int result = searcher.search(nums, toFind);

        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    public void should_ReturnCorrectIndex_When_ArrayHasOneElem() {
        double[] nums = { 1 };
        double correctNumToFind = 1;

        int result = searcher.search(nums, correctNumToFind);

        int expected = 0;
        assertEquals(expected, result);
    }

    public void should_ReturnNegativeValue_When_ElemNotExistInOneElemArray() {
        double[] nums = { 1 };
        double incorrectNumToFind = 2;

        int result = searcher.search(nums, incorrectNumToFind);

        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    public void should_ReturnCorrectIndex_When_ArrayHasTwoElems() {
        double[] nums = { 1, 3 };
        double correctNumToFind = 3;

        int result = searcher.search(nums, correctNumToFind);

        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void should_ReturnCorrectIndex_When_ArrayHasOddNumOfElems() {
        double[] nums = { -3, -1, 1, 3, 5 };
        double correctNumToFind = 3;

        int result = searcher.search(nums, correctNumToFind);

        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void should_ReturnCorrectIndex_When_ArrayHasEvenNumOfElems() {
        double[] nums = { -3, -1, 1, 3, 5, 7, 9 };
        double correctNumToFind = 7;

        int result = searcher.search(nums, correctNumToFind);

        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void should_ReturnFirstIndex_When_SearchingMinNumFromArray() {
        double[] nums = { 0, 1, 2, 3, 4, 5 };
        double minNumToFind = 0;

        int result = searcher.search(nums, minNumToFind);

        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void should_ReturnLastIndex_When_SearchingMaxNumFromArray() {
        double[] nums = { 0, 1, 2, 3, 4, 5 };
        double maxNumToFind = 5;

        int result = searcher.search(nums, maxNumToFind);

        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void should_ReturnNegativeValue_When_SearchingSmallerThanMinNumFromArray() {
        double[] nums = { 0, 1, 2, 3, 4, 5 };
        double smallerNumToFind = -10;

        int result = searcher.search(nums, smallerNumToFind);

        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    public void should_ReturnNegativeValue_When_SearchingBiggerThanMaxNumFromArray() {
        double[] nums = { 0, 1, 2, 3, 4, 5 };
        double biggerNumToFind = 10;

        int result = searcher.search(nums, biggerNumToFind);

        int expected = -1;
        assertEquals(expected, result);
    }

}