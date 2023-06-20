package ch.bbw.pruefung3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EANTest {

    @Test
    public void testEANCode()
    {
        assertEquals("4006381333936", EANHelper.generateEANCode("400", "6381", "33393"));
    }

    @Test
    public void testChecksum()
    {
        assertEquals(6, EANHelper.calculateChecksum("400638133393"));
    }
}
