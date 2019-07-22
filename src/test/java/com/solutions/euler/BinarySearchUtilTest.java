import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchUtilTest {

    public int[] intValues = {-1, 0, 3, 5, 9, 12};

    @Test
    public void binarySearchTest(){

        int result = BinarySearchUtil.binarySearch(intValues, 9);

        assertEquals(4, result);
    }

}
