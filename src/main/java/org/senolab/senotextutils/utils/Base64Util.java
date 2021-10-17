package org.senolab.senotextutils.utils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Util {

    public static String encode(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

    public static String decode(String input) {
        byte[] decodedBytes = Base64.getDecoder().decode(input);
        String decodedString = new String(decodedBytes, StandardCharsets.UTF_8);
        return decodedString;
    }

}
