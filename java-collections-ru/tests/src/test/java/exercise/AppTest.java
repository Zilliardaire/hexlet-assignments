package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    List<Integer> elements;

    @BeforeAll
    static void prepare() {
        System.out.println("Выполняются тесты");
    }

    @BeforeEach
    void initIntegerList() {
        this.elements = new ArrayList<>();
        this.elements.add(1);
        this.elements.add(2);
        this.elements.add(3);
        this.elements.add(4);
        this.elements.add(5);
    }

    @Test
    void testTake() {
        // BEGIN
        int expected = 3;
        List<Integer> actual = App.take(this.elements, 3);
        Assertions.assertEquals(expected, actual.get(2));
        // END
    }

    @Test
    void testTake2() {
        // BEGIN
        int expected = 3;
        List<Integer> actual = App.take(this.elements, 3);
        Assertions.assertEquals(expected, actual.size());
        // END
    }

    void testTake3() {
        // BEGIN
        int expected = 0;
        List<Integer> actual = App.take(this.elements, 0);
        Assertions.assertEquals(expected, actual.size());
        // END
    }

    void testTake4() {
        // BEGIN
        int expected = 3;
        List<Integer> actual = App.take(this.elements, 10);
        Assertions.assertEquals(expected, actual.size());
        // END
    }
}
