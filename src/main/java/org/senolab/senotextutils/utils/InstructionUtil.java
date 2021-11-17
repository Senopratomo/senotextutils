package org.senolab.senotextutils.utils;

public class InstructionUtil {

    public static String printInstruction() {
        return """
                SenoTextUtils v0.3.0
                                
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
                6) siemencode
                   It encode SIEM rule id to the format that SIEM API use to encode 'rules'      
                
                Sample usage:
                1) To see this instruction / help, execute it without any argument:
                $./senotextutils
                
                2) To encode a text 'hello' in Base64
                $./senotextutils base64encode "hello"
                
                3) To decode a base64-encoded text 'aGVsbG8='
                $./senotextutils base64decode "aGVsbG8="
                
                4) To url-encode a text '==++'
                $./senotextutils urlencode "==++"
                
                5) To url-decode an encoded text "%3D%3D%3B%3B"
                $./senotextutils urldecode "%3D%3D%3B%3B"
                
                6) To decode one of rules values from SIEM JSON response
                $./senotextutils siemdecode "NjAwNjU5NTM%3d%3bQk9ULTYxNzI2MjQz"            
                
                7) To encode one rule values to SIEM-encoded format
                $./senotextutils siemencode "699991"
                                
                If encounter any issues, please submit it under this repository 'issues'.            
                """;
    }

}
