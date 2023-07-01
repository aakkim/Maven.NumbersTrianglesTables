package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String getTri = "";
        for(int i=1; i<=numberOfRows; i++) {
            getTri += ("*".repeat(i)+"\n");
        }
        return getTri;
    }

    public static String getRow(int numberOfStars) {
        String row = "";
        for(int i=0; i<numberOfStars; i++) {
            row += "*";
        }
        return row;
    }

    public static String getSmallTriangle() {
        String smallTri = "";
        for(int i=1; i<5; i++) {
            smallTri += ("*".repeat(i)+"\n");
        }
        return smallTri;
    }

    public static String getLargeTriangle() {
        String largeTri = "";
        for(int i=1; i<11; i++) {
            largeTri += ("*".repeat(i)+"\n");
        }
        return largeTri;
    }
}
