package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        String multTable = "";
        for (int i = 1; i < numberOfRows; i++) {
        for (int j = 1; j <= i; j++) {
            multTable += String.format("*");


            }multTable += ("\n");
        }

        return multTable;

    }

   public static String getRow(int numberOfStars) {
       String multTable = "";
       for (int i = 1; i <= numberOfStars; i++) {
           multTable += String.format("*");


      }

      return multTable;
   }

   public static String getSmallTriangle() {
       return  TriangleUtilities.getTriangle(5);

       }


   public static String getLargeTriangle() {
       return TriangleUtilities.getTriangle(10);

    }
}
