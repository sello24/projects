public class ReplacingString {
	
    public static void main(String[] args) {
        String s = "abc123";
        System.out.println(convert(s));
    }

    public static String convert(String s) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                builder.append(Integer.valueOf(s.charAt(i)) - 97);
            } else {
                builder.append(convertToWord(s.charAt(i)));
            }
        }
        return builder.toString();
    }

    public static char convertToWord(String c) {
        char s = 0;
        switch (c) {
        case "100000":
            s = 'a';
            break;
        case "110000":
            s = 'b';
            break;
        case "100100":
            s = 'c';
            break;
        case "100110":
            s = 'd';
            break;
        case "100010":
            s = 'e';
            break;
        case "110100":
            s = 'f';
            break;
        case "110110":
            s = 'g';
            break;
        case "110010":
            s = 'h';
            break;
        case "010100":
            s = 'i';
            break;
         case "010110":
            s = 'j';
            break;
         case "101000":
            s = 'k';
            break;
         case "111000":
            s = 'l';
            break;
         case "101100":
            s = 'm';
            break;
         case "101110":
            s = 'n';
            break;
         case "101010":
            s = 'o';
            break;
         case "111100":
            s = 'p';
            break;
         case "111110":
            s = 'q';
            break;
         case "111010":
            s = 'r';
            break;
         case "011100":
            s = 's';
            break;
         case "011110":
            s = 't';
            break;
         case "101001":
            s = 'u';
            break;
         case "111001":
            s = 'v';
            break;
         case "010111":
            s = 'w';
            break;
         case "101101":
            s = 'x';
            break;
         case "101111":
            s = 'y';
            break;
         case "101011":
            s = 'z';
            break;
         case "000000":
            s = ' ';
            break;
        }
        return s;
    }
}