import static org.junit.Assert.*;

public class StringUtilTest {

    public static void main(String[] args) {
        String result = StringUtil.repeat("hola", 3);
        assertEquals(result, "holaholahola");

        String result2 = StringUtil.repeat("hola", 1);
        assertEquals(result2, "hola");
    }

    public static void assertEquals(String actual, String expected){
        if (!actual.equals(expected)){
            throw new RuntimeException(actual + " is not equal to " + expected);
        }
    }

}