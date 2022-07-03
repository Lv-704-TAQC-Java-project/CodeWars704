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
  public static int[] squareOrSquareRoot(int[] array) {
    for (int i=0; i<array.length; i++) {
        double sqr = Math.sqrt(array[i]);
        if (sqr==Math.round(sqr)) {
            array[i] = (int)sqr;
        } else {
          array[i] = array[i]*array[i];
        }  
    }
    return array;
  }
 @Override
    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
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
