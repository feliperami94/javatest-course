
public class RomanNumerals {
    public static String arabicToRoman(int n) {
        StringBuilder result = new StringBuilder();

        do {
            if(n - 1000 >= 0) {result.append("M"); n -= 1000;}
            else if(n - 900 >= 0) {result.append("CM"); n -= 900;}
            else if(n - 500 >= 0) {result.append("D"); n -= 500;}
            else if(n - 400 >= 0) {result.append("CD"); n -= 400;}
            else if(n - 100 >= 0) {result.append("C"); n -= 100;}
            else if(n - 90 >= 0) {result.append("XC"); n -= 90;}
            else if(n - 50 >= 0) {result.append("L"); n -= 50;}
            else if(n - 40 >= 0 ) {result.append("XL"); n -= 40;}
            else if(n - 10 >= 0) {result.append("X"); n -= 10;}
            else if(n == 9) {result.append("IX"); n -= 9;}
            else if(n - 5 >= 0) {result.append("V"); n -= 5;}
            else if(n == 4) {result.append("IV"); n -= 4;}
            else if(n - 1 >= 0) {result.append("I"); n -= 1;}
        } while(n > 0);


        return result.toString();

    }
}
