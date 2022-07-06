package com.org.ita.utils;

import java.math.BigInteger;

public interface Reader {

    int readInt();

    long readLong();

    BigInteger readBigInteger();

    double readDouble();

    float readFloat();

    double[] readDoubleArr();

    String readString();

    String[] readStringArr();

    int[] readIntArr();

}
