package com.nology.introduction_01;

/**
 *   All challenges in this repository are separated into three levels: Foundation, Intermediate, and Advanced.
 *   The expectation is to complete all Foundation level challenges, with Intermediate and upwards pushing your knowledge
 *   and may require you to google things in order to solve them. If you find an answer online somewhere, be kind and
 *   share it with the group!
 */
public class Challenge {

    public Challenge() {
    }

    // -------------- FOUNDATION --------------

    /***
     * A method to find the largest number of two given integers
     *
     * @param num1 a number to be compared with the other parameter
     * @param num2 a number to be compared with the other parameter
     * @return returns the larger of the 2 numbers passed as paramters
     */
    public int findLargestNumber(int num1, int num2) {
        return Math.max(num1, num2);

//        if (num1 > num2) {
//            return num1;
//        } else if (num1 < num2) {
//            return num2;
//        } else if (num1 == num2) {
//            return num1;
//        } else {
//            return -1;
//        }
    }

    /***
     * A method to find the longest string of two given strings
     *
     * @param string1 a string to be compared with the other parameter
     * @param string2 a string to be compared with the other parameter
     * @return returns the larger of the 2 strings or "These two are the same length!" if they are of equal length
     */
    public String findLongestString(String string1, String string2) {
        if (string1.length() > string2.length()){
            return string1;
        } else if (string1.length() < string2.length()) {
            return string2;
        } else if (string1.length() == string2.length()) {
            return "These two are the same length!";
        } else {
            return "";
        }
    }

    /**
     * A method to calculate a price discount. Given the price and the amount to be discounted return the new
     * discounted price.
     *
     * @param price The advertised price of a product
     * @param discount The percentage discount available
     * @return returns the price with the discount applied
     */
    public double getDiscount(double price, double discount) {
        // double doublePrice = (double) price;
        // double doubleDiscount = (double) discount;
        // Extra Challenge: How would this change if price & discount were int types?
        return price * (1-discount/100);
    }

    // -------------- INTERMEDIATE --------------

    /***
     * A method to check whether 2 numbers are equal to 4 decimal places.
     *
     * HINT: What happens if you do 0.1234 * 10000?
     *
     * @param num1 a double to be compared with the other parameter
     * @param num2 a double to be compared with the other parameter
     * @return a boolean to specify whether the 2 params match to 4 decimal places.
     */
    public boolean compareTwoNumbers(double num1, double num2) {
        double newNum1 = num1*1000;
        double newNum2 = num2*1000;

        int result1 = (int) newNum1;
        int result2 = (int) newNum2;

        if (result1 == result2) {
            return true;
        } else {
            return false;
        }

    }

    /***
     * A method to determine which day of the week it is from a numeric input.
     * e.g 0 = "Sunday", 1 = "Monday" etc.
     *
     * If the input is out of range return "Not a valid day range! The number needs to be from 0-6"
     *
     * EXTENSION Use a switch?
     * https://www.w3schools.com/java/java_switch.asp
     *
     * @param day a Integer from 0-6 (that corresponds to the days of the week)
     * @return the day that corresponds to the number that was passed to the method as a parameter or "Not a valid
     * day range! The number needs to be from 0-6" if param passed is outside of the range
     */
    public String getDayName(int day) {
        if (day == 0) {
            return "Sunday";
        } else if (day == 1) {
            return "Monday";
        }else if (day == 2) {
            return "Tuesday";
        }else if (day == 3) {
            return "Wednesday";
        }else if (day == 4) {
            return "Thursday";
        }else if (day == 5) {
            return "Friday";
        }else if (day == 6) {
            return "Saturday";
        }else {
            return "Not a valid day range! The number needs to be from 0-6";
        }
    }

    /***
     * A method to check whether a word has an even length or not.
     *
     * If a empty string is given it should return false.
     *
     * @param word a String to be checked whether the string has an even length or not.
     * @return a boolean the result of the length check.
     */
    public boolean isEvenWord(String word) {
        if (word.strip() != "" && word.strip().length() % 2 == 0) {
            return true;
        } else if (word.length() % 2 == 1 || word.strip() == "") {
            return false;
        } else {
        return false;
        }

    }

    // -------------- ADVANCED --------------

    /***
     * A method to determine whether any given year is a leap year
     *
     * A leap year occurs on:
     * - any year that is evenly divisible by 4
     * - except any year that is evenly divisible by 100 as well
     * - unless the same year is also evenly divisible by 400
     *
     * @param year the year to be checked
     * @return returns true if it is a leap year, false if not
     */
    public boolean leapYearChecker(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
