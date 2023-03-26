package exercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {
    @Test
    void testApp1() {

        String[][] a = {
                {"*", "*", "*", "*"},
                {"*", "-", "-", "*"},
                {"*", "-", "-", "*"},
                {"*", "*", "*", "*"}
        };

        String[][] actual = App.enlargeArrayImage(a);

        String[][] expected = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "-", "-", "-", "-", "*", "*"},
                {"*", "*", "-", "-", "-", "-", "*", "*"},
                {"*", "*", "-", "-", "-", "-", "*", "*"},
                {"*", "*", "-", "-", "-", "-", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"}
        };

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testApp2() {
        String[][] a = {{"*"}};

        String[][] actual = App.enlargeArrayImage(a);

        String[][] expected = {
                {"*", "*"},
                {"*", "*"}
        };

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testApp3() {
        String[][] a = new String[0][0];

        String[][] actual = App.enlargeArrayImage(a);

        String[][] expected = {};

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testApp4() {
        String[][] a = {
                {"*", "*", "*", "*"},
                {"*", "-", "-", "*"},
                {"*", "*", "*", "*"}
        };

        String[][] actual = App.enlargeArrayImage(a);

        String[][] expected = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "-", "-", "-", "-", "*", "*"},
                {"*", "*", "-", "-", "-", "-", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"}
        };

        assertThat(actual).isEqualTo(expected);
    }
}
// END
