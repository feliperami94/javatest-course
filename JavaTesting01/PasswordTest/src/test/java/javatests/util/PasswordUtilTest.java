package javatests.util;

import org.junit.Test;

import static javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abc12!"));
    }

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefghijk"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcd12345"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd1234!"));
    }
}