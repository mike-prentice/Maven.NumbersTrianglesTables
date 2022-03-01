package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return TableUtilities.getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return TableUtilities.getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String multTable = "";
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                multTable += String.format("%3d |", i * j);
            }
            multTable += ("\n");


        }
        return multTable;
    }
}
