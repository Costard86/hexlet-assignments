package exercise;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
            List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
            List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2));
            List<Integer> result = App.take(numbers, 2);
            Assertions.assertEquals(expected, result);
        }
    @Test
    void testTakeEmptyList() {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = App.take(numbers, 5);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testTakeWithCountGreaterThanSize() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(7, 3, 10));
        List<Integer> expected = new ArrayList<>(Arrays.asList(7, 3, 10));
        List<Integer> result = App.take(numbers, 8);
        Assertions.assertEquals(expected, result);
    }
        // END
}
