package com.paralun.standard;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberClass {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("1223400000000000000007");
        BigInteger num2 = new BigInteger("1223400777882220000000");

        BigInteger result = num1.add(num2);

        System.out.println(result);


        BigDecimal decimal1 = new BigDecimal("12446634334.7877");
        BigDecimal decimal2 = new BigDecimal("33454545422.8899");
        BigDecimal decimal3 = decimal1.add(decimal2);

        System.out.println(decimal3);
    }
}
