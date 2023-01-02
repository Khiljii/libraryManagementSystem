package com.example.libraryManagementSystem.libraryManagementSystem.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Util {

    public static String encode(String pass) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] encode = md.digest(pass.getBytes());
        BigInteger bigInteger = new BigInteger(1,encode);
        return bigInteger.toString(16);
    }

}
