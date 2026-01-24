import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LargestIndexTest {

    @Test
    public void testMethodWorks() {
        int[][] actual = {{2, 3, 4}, {5, 6, 58, 9}, {3, 4, 2}};

        Assertions.assertEquals(78, LargestIndex.sumingIndexElements(actual));
    }

    @Test
    public void testSingleArray() {

        int[][] actual = {{1, 2, 3}};
        Assertions.assertEquals(6, LargestIndex.sumingIndexElements(actual));
    }

    @Test
    public void testEmptyArray() {
        int[][] actual= {};
        Assertions.assertEquals(0, LargestIndex.sumingIndexElements(actual));
    }

    @Test
    public void testDifferentArrayLengths() {
        int[][] actual = {{1}, {2, 3}, {4, 5, 6}};
        Assertions.assertEquals(15, LargestIndex.sumingIndexElements(actual));
    }

    @Test
    public void testNegativeNumbers() {
        int[][] actual = {{-1, -2}, {3, 4}};
        Assertions.assertEquals(7, LargestIndex.sumingIndexElements(actual));
    }

    @Test
    public void testingZeros() {

        int[][] actual = {{0, 0}, {0}};
        Assertions.assertEquals(0, LargestIndex.sumingIndexElements(actual));
   }





     }
