/**
 * Java program demonstrating usage of String class methods.
 */
public class StringMethodsExamples {

    public static void main(String[] args) {
        // charAt(int index)
        String str1 = "Hello";
        char ch = str1.charAt(1); // 'e'
        System.out.println("charAt(int index): Character at index 1: " + ch);

        // contains(CharSequence s)
        String str2 = "Java Programming";
        boolean contains = str2.contains("Programming"); // true
        System.out.println("contains(CharSequence s): Contains 'Programming': " + contains);

        // endsWith(String suffix)
        String str3 = "Hello World";
        boolean endsWith = str3.endsWith("World"); // true
        System.out.println("endsWith(String suffix): Ends with 'World': " + endsWith);

        // equals(Object obj)
        String str4a = "hello";
        String str4b = "Hello";
        boolean isEqual = str4a.equals(str4b); // false
        System.out.println("equals(Object obj): Strings are equal: " + isEqual);

        // equalsIgnoreCase(String another)
        String str5a = "hello";
        String str5b = "Hello";
        boolean isEqualIgnoreCase = str5a.equalsIgnoreCase(str5b); // true
        System.out.println("equalsIgnoreCase(String another): Strings are equal (ignore case): " + isEqualIgnoreCase);

        // format(Locale l, String format, Object... args)
        int num = 10;
        String formattedString = String.format("The number is %d", num); // "The number is 10"
        System.out.println("format(Locale l, String format, Object... args): Formatted string: " + formattedString);

        // isEmpty()
        String str6 = "";
        boolean empty = str6.isEmpty(); // true
        System.out.println("isEmpty(): String is empty: " + empty);

        // indexOf(String str)
        String str7 = "Java Programming";
        int index = str7.indexOf("Programming"); // 5
        System.out.println("indexOf(String str): Index of 'Programming': " + index);

        // lastIndexOf(String str)
        String str8 = "Java is fun, Java is powerful";
        int lastIndex = str8.lastIndexOf("Java"); // 16
        System.out.println("lastIndexOf(String str): Last index of 'Java': " + lastIndex);

        // replace(CharSequence target, CharSequence replacement)
        String str9 = "Hello, World!";
        String replaced = str9.replace("Hello", "Hi"); // "Hi, World!"
        System.out.println("replace(CharSequence target, CharSequence replacement): After replacement: " + replaced);

        // split(String regex)
        String str10 = "apple,orange,banana";
        String[] fruits = str10.split(","); // {"apple", "orange", "banana"}
        System.out.println("split(String regex): Fruits:");
        for (String fruit : fruits) {
            System.out.println("    " + fruit);
        }

        // startsWith(String prefix)
        String str11 = "Hello, World!";
        boolean startsWith = str11.startsWith("Hello"); // true
        System.out.println("startsWith(String prefix): Starts with 'Hello': " + startsWith);

        // substring(int beginIndex)
        String str12 = "Hello, World!";
        String substring1 = str12.substring(7); // "World!"
        System.out.println("substring(int beginIndex): Substring from index 7: " + substring1);

        // substring(int beginIndex, int endIndex)
        String str13 = "Hello, World!";
        String substring2 = str13.substring(7, 12); // "World"
        System.out.println("substring(int beginIndex, int endIndex): Substring from index 7 to 12: " + substring2);

        // toLowerCase()
        String str14 = "Hello World";
        String lowerCase = str14.toLowerCase(); // "hello world"
        System.out.println("toLowerCase(): Lowercase string: " + lowerCase);

        // toUpperCase()
        String str15 = "Hello World";
        String upperCase = str15.toUpperCase(); // "HELLO WORLD"
        System.out.println("toUpperCase(): Uppercase string: " + upperCase);

        // trim()
        String str16 = "  Hello World  ";
        String trimmed = str16.trim(); // "Hello World"
        System.out.println("trim(): Trimmed string: '" + trimmed + "'");
    }
}
