package dev.abdias.amstrong;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AmstrongTest {
    @Test
    void testIsAmstrongNumnb() {

        assertEquals(true, Amstrong.isAmstrongNumnb(371), "El número positivo debe coincidir");
        assertEquals(true, Amstrong.isAmstrongNumnb(1634), "El número positivo debe coincidir");
    }

    @Test
    void testIsNotAmstrongNumnb() {

        assertEquals(false, Amstrong.isAmstrongNumnb(351), "El número positivo debe coincidir");
        assertEquals(false, Amstrong.isAmstrongNumnb(2015), "El número positivo debe coincidir");
    }
}
