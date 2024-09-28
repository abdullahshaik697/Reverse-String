public class reverseString {
    public static void main(String[] args) {
        String originalStr = "My Name is Abdullah Shaikh";
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);
    }
}
//
//  How it Works??
//
//  The first letter of string is assigned at the beginning of reversedStr. The second letter will be placed before the first letter.
//  EXAMPLE:
//        1.  M
//        2.  yM
//        3.   yM
//        4.  N yM         and so on......
