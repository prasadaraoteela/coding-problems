package easy;

import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;

/**
 * Created by Prasada Rao on 20/10/21 5:56 PM
 **/
class MaxProductOfTwoElementsTest {

    @Test
    public void test_maxProduct() {
        MaxProductOfTwoElements maxProductOfTwoElements = new MaxProductOfTwoElements();
        assertEquals(12, maxProductOfTwoElements.maxProduct(new int[]{3, 4, 5, 2}));
        assertEquals(16, maxProductOfTwoElements.maxProduct(new int[]{1, 5, 4, 5}));
        assertEquals(12, maxProductOfTwoElements.maxProduct(new int[]{3, 7}));
    }
}