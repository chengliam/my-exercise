public class StringBasics {
  public static void main(String[] args) {
    // Basic way to create a string
    String name = "Venturenix LAB";
    System.out.println(name);
    // There are some other ways to create String, it will be covered in later chapters.


    String str1 = "Hello";
    String str2 = " World!";
    String result = str1 + str2; // result is "Hello World!"
    System.out.println(result);
    System.out.println(str1 + str2); // this fromat is also work.

    int number = 42;
    String message = "The answer is: " + number; // message is "The answer is: 42"
    System.out.println(message);
    // String 呢個類別可以指向特定文字，及特定文字 ＋ 其他類別嘅地址
    number = 7;
    int newNumber = 3 + number; // int 同樣可以 "+" 同一類別的地址
    String lucky = "My Lucky Number is: " + newNumber;
    System.out.println(lucky);

    // 1. char
    char a = 'A';
    String message2 = "The answer is: " + a; // message2 is "The answer is: A"
    System.out.println(message2);
    // 2. int
    int age = 25;
    message = "I am " + age + " years old."; // message is "I am 25 years old."
    System.out.println(message);
    // 3. double
    double price = 9.99;
    String item = "Book";
    String description = "The " + item + " costs $" + price; // description is "The Book costs $9.99"
    System.out.println(description);
    // 4. boolean
    boolean isJavaFun = true;
    message = "Is Java fun? " + isJavaFun; // message is "Is Java fun? true"
    System.out.println(message);
    // 5. remenber name is String type, can = null
    name = null;
    message = "Hello, " + name; // message is "Hello, null"
    System.out.println(message);
    // Same applied to other primitives


    // String Method 1. length()
    String str = "Hello";
    int length = str.length(); // length is 5
    System.out.println(length);
    // x地址x.length() 可以查詢該地址（x地址x）所指向的內容中字符的長度
    String tryChinese = "試下中文可唔可以"; // .length() 後應該是不是
    System.out.println(tryChinese.length()); // 中文亦同樣可以
    System.out.println("tryChinese"); // 加了 "" 會直接出現中間的文字
    // String Method 2. equals()
    str1 = "Hello";
    str2 = "Hello";
    String str3 = "World";
    boolean isEqual1 = str1.equals(str2); // isEqual1 is true
    boolean isEqual2 = str1.equals(str3); // isEqual2 is false
    System.out.println(isEqual1);
    System.out.println(isEqual2);
    // String Method 3. charAt()
    str = "Hello"; // str is String type
    System.out.println(str.charAt(0)); // only int index can inside .charAt()
  }
}
