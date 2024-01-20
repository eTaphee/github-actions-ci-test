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
        assertEquals(2, 3);
        assertEquals(2, 3);
        assertEquals(2, 3);
        assertEquals(2, 3);
    }

    @Test
    @DisplayName("This is a test with a display name2")
    void someTest3() {
        assertEquals(2, 3);
        assertEquals(2, 3);
        assertEquals(2, 3);
        assertEquals(2, 3);
    }
}
