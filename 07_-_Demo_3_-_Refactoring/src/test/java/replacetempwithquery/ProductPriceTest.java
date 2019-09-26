package replacetempwithquery;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductPriceTest {

    @Test
    public void productPriceIsQuantityTimesItemPriceReducedWithDiscount() {
        assertEquals(490.0, calculateProductPrice(10, 50), 0.0);
    }

    @Test
    public void productPriceGetsHigherDiscountIfBasePriceIsGreaterThen1000() {
        assertEquals(980.0, calculateProductPrice(10, 100), 0.0);
        assertEquals(959.5, calculateProductPrice(10, 101), 0.0);
    }

    private double calculateProductPrice(int quantity, int itemPrice) {
        ProductPrice productPrice = new ProductPrice(quantity, itemPrice);
        double result = productPrice.getPrice();
        return result;
    }
}
