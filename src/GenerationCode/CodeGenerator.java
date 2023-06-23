package GenerationCode;

import classes.ListWedget;
import classes.Program;

public class CodeGenerator {
    public static String generateHtml(ListWedget listWedget) {
            StringBuilder sb = new StringBuilder();
            sb.append("<html>\n<head>\n<title>Program Output</title>\n</head>\n<body>\n");
            sb.append("<form action=\"output.php\" method=\"post\">\n");
            sb.append(listWedget.toHtml());
            sb.append("</form>\n");
            sb.append("</body>\n</html>");
            return sb.toString();
    }
    public static String generatePhp(Program program) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?php\n");
        sb.append(program.toPhp());
        sb.append("\n?>");
        return sb.toString();
    }
}