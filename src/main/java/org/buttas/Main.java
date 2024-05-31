package org.buttas;

public class Main {
    public static void main(String[] args) {
        //create an array of  5 floats and calculate their sums
        float [] fArray;
        fArray = new float[]{20.5f, 30.6f, 45.98f, 67.9f, 12.413f};

        float sum = 0.0f;
        for (float v : fArray) {
            sum = sum + v;
        }
        System.out.print("Sum of no's is : ");
        System.out.println(sum);

    }
}