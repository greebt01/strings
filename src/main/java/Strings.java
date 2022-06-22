import java.util.Locale;

public class Strings {
    static String str = "Learn string handling";
    public static void main(String[] args) {
        String message = "  C:\tWindows\\...";
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase(Locale.ROOT));
        System.out.println(message.trim());
        System.out.println(message);
        var ans1 = ex1();
        System.out.println(ans1);
        var ans2=ex2();
        System.out.println(ans2);
        var ans3=ex3(10,15);
        System.out.println(ans3);
        var ans4=ex4(0,5);
        System.out.println(ans4);
    }
    // 1) Using the string "Learn string handling": what index is the last letter in the string?
    private static int ex1() {

        return str.length();
    }
    // 2) Using the same string as above, what character is located at the 10th index?
    private static char ex2() {
        return str.charAt(10);
    }
    // 3)Do a check to see if the character at index 10 and 15 the same?
    private static boolean ex3(int x, int y){
        String[] strArr=str.trim().split("");
        if (strArr[x].equalsIgnoreCase(strArr[y])) {
            return true;
        } else {
            return false;
        }
    }
    // 4) Create a scenario that returns false if the character at the 0 index equals the 5 index
    private static boolean ex4(int x, int y) {
        return ex3(x,y);
    }
    //length()
    //equals()
    //equalsIgnoreCase()
    //charAt()
    //contains()
    //substring()
    //startsWith
    //endsWith
    //toLowerCase()
    //toUpperCase()


//            String str = "Learn string handling";
//            String allUpper = "LEARN STRING HANDLING";
//            String subStr = "";
//
//            boolean isEqualsTrue = false;
//            boolean isEqualsIgnoreCaseTrue = false;
//
//            //This will return the first char of the string
//            char ch1 = str.charAt(0);
//            char ch2 = str.charAt(1);
//            char ch3 = str.charAt(4);
//
//            if(str.equals(allUpper)) {
//                isEqualsTrue = true;
//            }else {
//                isEqualsTrue = false;
//            }
//
//            if(str.equalsIgnoreCase(allUpper)) {
//                isEqualsIgnoreCaseTrue = true;
//            }else {
//                isEqualsIgnoreCaseTrue = false;
//            }
//
//            subStr = str.substring(0, 6).trim();
//
//            System.out.println("Character at 0 index is: " + ch1);
//            System.out.println("Character at 1 index is: " + ch2);
//            System.out.println("Character at 4 index is: " + ch3);
//
//            System.out.println("Are str and allUpper equals- Ignore Case  : " + isEqualsIgnoreCaseTrue);
//            System.out.println("Are str and allUpper equals  : " + isEqualsTrue);
//
//            System.out.println("Original string: " + str + " - Substring :" + subStr);
//






}
