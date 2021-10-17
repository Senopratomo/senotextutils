package org.senolab.senotextutils.utils;

public class InstructionUtil {

    public static String printInstruction() {
        return """
                SenoTextUtils v0.1.0
                                
                SenoTextUtils is a simple CLI tool that help with string text manipulation, encoding, decoding from different
                format.
                It accept two arguments:
                - command (see below "All available commands")
                - String (text) to manipulate.
                
                All available commands are:
                1) base64encode
                   It encode a string in Base64 and print the Base64-encoded string input
                2) base64decode
                   It decode a Base64 string and print the output
                3) urlencode
                   It encode a string and url-encode special characters
                4) urldecode
                   It decode a-url-encoded string and print the output
                5) siemdecode
                   It decode encoded-text-message in SIEM JSON response   
                                
                If encounter any issues, please submit it under this repository 'issues'.            
                """;
    }

}