    package com.org.ita.kata.implementation.avlrvn;
    import com.org.ita.kata.Eight;
    public class EigthImpl implements Eight {
     @Override
    public int liters(double time) {
        return 0;
    }
    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }
    @Override
    public float mpgToKPM(float mpg) {
        return 0;
    }
    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }
    @Override 
    public static int[] countPositivesSumNegatives(int[] input) {
       if (input == null || input.length == 0) return new int[] {};
       int count = 0, sum = 0;
       for (int i : input) {
         if (i > 0) count ++;
         if (i < 0) sum += i;
       }
       return new int[] {count, sum};
    }
     @Override
    public int stringToNumber(String str) {
        return 0;
    }
    @Override
    public boolean amIWilson(double n) {
        return false;
    }
    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }
    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
