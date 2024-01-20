package homes.banzzokee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FooTest {

    @Test
    void someTest() {
        assertEquals(1, 1);
    }

    @Test
    @DisplayName("This is a test with a display name")
    void someTest2() {
        assertEquals(1, 2);
    }
}
