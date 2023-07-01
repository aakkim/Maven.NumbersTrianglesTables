package io.zipcoder.microlabs.mastering_loops;
import java.lang.Math;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenNum = "";
        for(int i=start; i<stop; i++) {
            if(i%2==0) {
                evenNum += i;
            }
        }
        return evenNum;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNum = "";
        for(int i=start; i<stop; i++) {
            if(i%2!=0) {
                oddNum += i;
            }
        }
        return oddNum;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String strConcat = "";
        for(int i=start; i<stop; i+=step) {
            strConcat += (i*i);
        }
        return strConcat;
    }

    public static String getRange(int start) {
        String strConcat = "";
        for(int i=0; i<start; i++) {
            strConcat += i;
        }
        return strConcat;
    }

    public static String getRange(int start, int stop) {
        String strConcat = "";
        for(int i=start; i<stop; i++) {
            strConcat += i;
        }
        return strConcat;
    }


    public static String getRange(int start, int stop, int step) {
        String strConcat = "";
            for(int i=start; i<stop; i+=step) {
                strConcat += i;
            }
        return strConcat;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String strConcat = "";
        for(int i=start; i<stop; i+= step){
            strConcat += (int) Math.pow(i,exponent);
        }
        return strConcat;
    }
}
