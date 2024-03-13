package io.zipcoder.microlabs.mastering_loops;
import java.lang.String;
public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder b = new StringBuilder();
        for(int i=1; i<numberOfRows;i++){
            b.append(getRow(i)).append("\n");
        }

        return b.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder stars = new StringBuilder();
        for(int i = 0; i < numberOfStars; i++){
            stars.append("*");
        }
        return stars.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {

        return getTriangle(10);
    }
}
