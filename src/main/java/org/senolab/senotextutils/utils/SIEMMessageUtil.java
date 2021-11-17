package org.senolab.senotextutils.utils;

import java.util.ArrayList;
import java.util.List;

public class SIEMMessageUtil {

    public static List<String> decodeSiemRuleMessage(String input) {
        String urlDecodedInput = UrlEncodeDecodeUtil.decodeUrl(input);
        String[] base64Rules = urlDecodedInput.split(";");
        ArrayList<String> output = new ArrayList<>();
        for (String i : base64Rules) {
            output.add(Base64Util.decode(i));
        }
        return output;
    }

    public static String encodeSiemRuleMessage(String input) {
        String[] rules = input.split(";");
        String siemEncodedString = "";
        List<String> output = new ArrayList<>();
        if(rules.length == 1) {
            String base64EncodedString = Base64Util.encode(rules[0]);
            siemEncodedString = UrlEncodeDecodeUtil.encodeUrl(base64EncodedString);
        } else {
            for (String i: rules) {
                output.add(UrlEncodeDecodeUtil.encodeUrl(Base64Util.encode(i)));
            }
            siemEncodedString = String.join("%3b", output);
        }
        return siemEncodedString;
    }

}
