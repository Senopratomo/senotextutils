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

}
