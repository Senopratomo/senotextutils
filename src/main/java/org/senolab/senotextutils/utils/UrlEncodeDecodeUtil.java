package org.senolab.senotextutils.utils;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class UrlEncodeDecodeUtil {

    public static String encodeUrl(String input) {
        return URLEncoder.encode(input, StandardCharsets.UTF_8);
    }

    public static String decodeUrl(String input) {
        return URLDecoder.decode(input, StandardCharsets.UTF_8);
    }
}
