
# String Class in Java: Detailed Explanation

## Definition and Characteristics
- **Definition**: A `String` in Java represents a sequence of characters. It is both a fundamental data type and a class provided by Java in the `java.lang` package.
- **Characteristics**:
  - **Immutable**: Once a `String` object is created, its content cannot be changed. Operations that modify a `String` actually create a new `String` object.
  - **Object-oriented**: Despite being a fundamental data type, Java treats strings as objects with a rich set of methods for manipulation.

## Creation of String Objects
- **Using String Literal**:
  ```java
  String greeting = "Hello world!";
  ```
  - String literals are stored in the string pool, optimizing memory usage by reusing existing instances if possible.
  
- **Using `new` Keyword**:
  ```java
  String greeting = new String("Hello world!");
  ```
  - This syntax creates a new `String` object on the heap, useful for cases where explicit object management is required.

## Methods for String Manipulation

### Length of String
- **`length()` Method**:
  ```java
  String uwu = "Uva Wellassa University";
  int len = uwu.length(); // returns 24
  ```
  - Returns the number of characters in the string.

### Concatenation of Strings
- **Concatenation Operator (`+`)**:
  ```java
  String message = "Uva Wellassa " + "University.";
  ```
  - Joins two strings into a single string.

- **`concat()` Method**:
  ```java
  String message = "Uva Wellassa ".concat("University.");
  ```
  - Explicitly concatenates one string to another.

### Formatted String Creation
- **Using `printf()`**:
  ```java
  int num = 10;
  char ch = 'a';
  float f = 3.68f;
  System.out.printf("Integer: %d, Character: %c, Float: %f\n", num, ch, f);
  ```
  - Formats and prints values using placeholders.

- **Using `format()`**:
  ```java
  String formatted = String.format("Integer: %d, Character: %c, Float: %f", num, ch, f);
  ```
  - Returns a formatted string.

### Important String Methods
- **`charAt(int index)`**: Returns the character at the specified index.
- **`contains(CharSequence s)`**: Checks if the string contains a sequence of characters.
- **`endsWith(String suffix)`**: Checks if the string ends with a specified suffix.
- **`equals(Object obj)`**: Compares the string to another object.
- **`equalsIgnoreCase(String another)`**: Compares the string ignoring case.
- **`format(Locale l, String format, Object... args)`**: Returns a formatted string using locale and format string.
- **`isEmpty()`**: Checks if the string is empty.
- **`indexOf(String str)`**: Returns the index of the first occurrence of a substring.
- **`lastIndexOf(String str)`**: Returns the index of the last occurrence of a substring.
- **`replace(CharSequence target, CharSequence replacement)`**: Replaces occurrences of a sequence with another sequence.
- **`split(String regex)`**: Splits the string into an array of substrings.
- **`startsWith(String prefix)`**: Checks if the string starts with a specified prefix.
- **`substring(int beginIndex)`**: Returns a substring starting from the specified index.
- **`substring(int beginIndex, int endIndex)`**: Returns a substring between specified indices.
- **`toLowerCase()`**: Converts the string to lowercase.
- **`toUpperCase()`**: Converts the string to uppercase.
- **`trim()`**: Removes leading and trailing whitespace.

### Examples for `String` Class Methods with Outputs

#### 1. `charAt(int index)`
Returns the character at the specified index.

```java
String str = "Hello";
char ch = str.charAt(1); // 'e'
System.out.println("Character at index 1: " + ch);
```
**Output:**
```
Character at index 1: e
```

#### 2. `contains(CharSequence s)`
Checks if the string contains a sequence of characters.

```java
String str = "Java Programming";
boolean contains = str.contains("Programming"); // true
System.out.println("Contains 'Programming': " + contains);
```
**Output:**
```
Contains 'Programming': true
```

#### 3. `endsWith(String suffix)`
Checks if the string ends with a specified suffix.

```java
String str = "Hello World";
boolean endsWith = str.endsWith("World"); // true
System.out.println("Ends with 'World': " + endsWith);
```
**Output:**
```
Ends with 'World': true
```

#### 4. `equals(Object obj)`
Compares the string to another object.

```java
String str1 = "hello";
String str2 = "Hello";
boolean isEqual = str1.equals(str2); // false
System.out.println("Strings are equal: " + isEqual);
```
**Output:**
```
Strings are equal: false
```

#### 5. `equalsIgnoreCase(String another)`
Compares the string ignoring case.

```java
String str1 = "hello";
String str2 = "Hello";
boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // true
System.out.println("Strings are equal (ignore case): " + isEqualIgnoreCase);
```
**Output:**
```
Strings are equal (ignore case): true
```

#### 6. `format(Locale l, String format, Object... args)`
Returns a formatted string using locale and format string.

```java
int num = 10;
String formattedString = String.format("The number is %d", num); // "The number is 10"
System.out.println("Formatted string: " + formattedString);
```
**Output:**
```
Formatted string: The number is 10
```

#### 7. `isEmpty()`
Checks if the string is empty.

```java
String str = "";
boolean empty = str.isEmpty(); // true
System.out.println("String is empty: " + empty);
```
**Output:**
```
String is empty: true
```

#### 8. `indexOf(String str)`
Returns the index of the first occurrence of a substring.

```java
String str = "Java Programming";
int index = str.indexOf("Programming"); // 5
System.out.println("Index of 'Programming': " + index);
```
**Output:**
```
Index of 'Programming': 5
```

#### 9. `lastIndexOf(String str)`
Returns the index of the last occurrence of a substring.

```java
String str = "Java is fun, Java is powerful";
int lastIndex = str.lastIndexOf("Java"); // 16
System.out.println("Last index of 'Java': " + lastIndex);
```
**Output:**
```
Last index of 'Java': 16
```

#### 10. `replace(CharSequence target, CharSequence replacement)`
Replaces occurrences of a sequence with another sequence.

```java
String str = "Hello, World!";
String replaced = str.replace("Hello", "Hi"); // "Hi, World!"
System.out.println("After replacement: " + replaced);
```
**Output:**
```
After replacement: Hi, World!
```

#### 11. `split(String regex)`
Splits the string into an array of substrings based on the regular expression (`regex`).

```java
String str = "apple,orange,banana";
String[] fruits = str.split(","); // {"apple", "orange", "banana"}
for (String fruit : fruits) {
    System.out.println("Fruit: " + fruit);
}
```
**Output:**
```
Fruit: apple
Fruit: orange
Fruit: banana
```

#### 12. `startsWith(String prefix)`
Checks if the string starts with a specified prefix.

```java
String str = "Hello, World!";
boolean startsWith = str.startsWith("Hello"); // true
System.out.println("Starts with 'Hello': " + startsWith);
```
**Output:**
```
Starts with 'Hello': true
```

#### 13. `substring(int beginIndex)`
Returns a substring starting from the specified index.

```java
String str = "Hello, World!";
String substring = str.substring(7); // "World!"
System.out.println("Substring from index 7: " + substring);
```
**Output:**
```
Substring from index 7: World!
```

#### 14. `substring(int beginIndex, int endIndex)`
Returns a substring between specified indices.

```java
String str = "Hello, World!";
String substring = str.substring(7, 12); // "World"
System.out.println("Substring from index 7 to 12: " + substring);
```
**Output:**
```
Substring from index 7 to 12: World
```

#### 15. `toLowerCase()`
Converts the string to lowercase.

```java
String str = "Hello World";
String lowerCase = str.toLowerCase(); // "hello world"
System.out.println("Lowercase string: " + lowerCase);
```
**Output:**
```
Lowercase string: hello world
```

#### 16. `toUpperCase()`
Converts the string to uppercase.

```java
String str = "Hello World";
String upperCase = str.toUpperCase(); // "HELLO WORLD"
System.out.println("Uppercase string: " + upperCase);
```
**Output:**
```
Uppercase string: HELLO WORLD
```

#### 17. `trim()`
Removes leading and trailing whitespace.

```java
String str = "  Hello World  ";
String trimmed = str.trim(); // "Hello World"
System.out.println("Trimmed string: '" + trimmed + "'");
```
**Output:**
```
Trimmed string: 'Hello World'
```

## Conclusion
Understanding the `String` class and its methods is essential for effective string manipulation in Java. This README provides a comprehensive overview of creating, manipulating, and utilizing `String` objects, empowering developers to handle text data efficiently in Java applications.

---

