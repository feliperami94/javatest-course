package utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void string_is_empty() {
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void string_is_not_empty() {
        assertFalse(StringUtil.isEmpty("hola"));
    }

    @Test
    public void string_null_is_empty() {
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void string_spaces_is_empty() {
        assertTrue(StringUtil.isEmpty("  "));
    }
}