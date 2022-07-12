package com.org.ita.utils;

import java.io.InputStream;
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

    String[] readStringArrSplitByComma();

    int[] readIntArr();

    int[] readIntArr(InputStream is);

}
