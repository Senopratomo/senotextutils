package org.senolab.senotextutils;

import org.senolab.senotextutils.utils.Base64Util;
import org.senolab.senotextutils.utils.InstructionUtil;
import org.senolab.senotextutils.utils.SIEMMessageUtil;
import org.senolab.senotextutils.utils.UrlEncodeDecodeUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        if(args.length == 2) {
            switch (args[0]) {
                case "base64encode":
                    System.out.println(Base64Util.encode(args[1]));
                    break;
                case "base64decode":
                    try {
                        List<String> textToDecode = new ArrayList<String>();
                        Stream<String> stream = Files.lines(Paths.get(args[1]));
                        stream.forEach(textToDecode::add);
                        System.out.println(Base64Util.decode(textToDecode.get(0)));
                    } catch (InvalidPathException | IOException e) {
                        System.out.println(Base64Util.decode(args[1]));
                    }
                    break;
                case "urlencode":
                    System.out.println(UrlEncodeDecodeUtil.encodeUrl(args[1]));
                    break;
                case "urldecode":
                    System.out.println(UrlEncodeDecodeUtil.decodeUrl(args[1]));
                    break;
                case "siemdecode":
                    for (String x : SIEMMessageUtil.decodeSiemRuleMessage(args[1])) {
                        System.out.println(x);
                    }
                    break;
                case "siemencode":
                    System.out.println(SIEMMessageUtil.encodeSiemRuleMessage(args[1]));
                    break;
                default:
                    System.out.println(InstructionUtil.printInstruction());
            }
        } else {
            System.out.println(InstructionUtil.printInstruction());
        }
    }
}
