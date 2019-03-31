package junit5;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

//tag。
@Tag("fast")//junit4のCategoryの代わりに使える。
@Tag("model")
class TaggingDemo {

    @Test
    @Tag("taxes")
    void testingTaxCalculation() {
    }

}