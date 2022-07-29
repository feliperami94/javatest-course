import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void return_fizz_if_number_is_divisible_by_3() {
        assertThat(FizzBuzz.fizzBuzz(3), is("Fizz"));
        assertThat(FizzBuzz.fizzBuzz(6), is("Fizz"));
        assertThat(FizzBuzz.fizzBuzz(12), is("Fizz"));
    }

    @Test
    public void return_buzz_if_number_is_divisible_by_5() {
        assertThat(FizzBuzz.fizzBuzz(5), is("Buzz"));
        assertThat(FizzBuzz.fizzBuzz(10), is("Buzz"));
        assertThat(FizzBuzz.fizzBuzz(25), is("Buzz"));
    }

    @Test
    public void return_fizzbuzz_if_number_is_divisible_by_3_and_5() {
        assertThat(FizzBuzz.fizzBuzz(15), is("FizzBuzz"));
        assertThat(FizzBuzz.fizzBuzz(30), is("FizzBuzz"));
        assertThat(FizzBuzz.fizzBuzz(45), is("FizzBuzz"));
    }

    @Test
    public void return_number_if_number_not_divisible_by_3_or_5() {
        assertThat(FizzBuzz.fizzBuzz(7), is("7"));
        assertThat(FizzBuzz.fizzBuzz(11), is("11"));
        assertThat(FizzBuzz.fizzBuzz(16), is("16"));
    }


}