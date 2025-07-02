public class Operators {
  public static void main(String[] args) {
    // Operators 1. Assign (=)
    int x = 5; // Assigns the value 5 to the variable x
    System.out.println(x);


    // Operators 2. addition (+), subtraction (-), multiplication (*), division (/), and modulus (%)
    x = 10 + 5; // 5, Addition
    int y = 10 - 3; // 7, Subtraction
    int z = 10 * 5; // 50, Multiplication
    int w = 10 / 5; // 2, Division
    int remainder = 10 % 3; // 1, Modulus (returns the Remainder)
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(w);
    System.out.println(remainder);
    // new assignment
    remainder = 10 % 2;
    System.out.println(remainder); // 10 能夠被 2 除盡，所以會得出並顯示 0
    remainder = 10 % 7;
    System.out.println(remainder); // 10 不能被 7 除盡，會餘下 3 所以會得出並顯示 3
    // (%) 只會顯示除數後的餘數，並示是除數的答案，若需要計算除數的答案，要使用(/)

    // 另一種寫法，此為比較並偏的寫法
    x = 5;
    x += 3; // same as x = x + 3;
    System.out.println("answer is " + x);
    x = x + 3;
    System.out.println("結果是" + x);// 經過line 28，29，31後應得出結果 11
    y = 10;
    y -= 4; // Equivalent to y = y - 4; Result: y = 6
    System.out.println("answer is " + y);
    z = 7;
    z *= 2; // Equivalent to z = z * 2; Result: z = 14
    System.out.println("answer is " + z);
    w = 15;
    w /= 5; // Equivalent to w = w / 5; Result: w = 3
    System.out.println("answer is " + w);
    int a1 = 10;
    a1 %= 3; // Equivalent to a = a % 3; Result: a = 1
    System.out.println("answer is " + a1);

    // Increment Operator (++)，以下都是可加 1 的操作
    x = 5;
    x++; // 6，此寫法只能加 1
    System.out.println("x++ 後, x是 " + x);
    ++x; // 7，此寫法只能加 1
    System.out.println("++x 後, x是 " + x);
    x = x + 2; // 9，此寫法可以加多於 1
    System.out.println("x = x + 1 後, x是 " + x);
    x += 2; // 11，此寫法可以加多於 1
    System.out.println("x += 1 後, x是 " + x);
    x = 5;
    int preIncrement = ++x;
    System.out.println(x);
    System.out.println(preIncrement);
    // Pre-increment: The value of x is incremented first, and then assigned to preIncrement.
    // Result: x = 6, preIncrement = 6
    y = 5;
    y++; // here means y + 1, which the result should be 6
    int postIncrement = y++; // postIncrement = latest value of "y" which is 6 in line 65, y add 1 value after assignement, so after this line y = 7, and postIncrement = 6
    // 呢個寫法係先將y 最新的值指定給 postIncrement 後, y 才再加 1
    System.out.println(y); // result is 7
    System.out.println(postIncrement); // result is 6
    // Post-increment: The value of y is assigned to postIncrement first and then incremented.
    // Result: y = 6, postIncrement = 5
    // (-) & (+) 相同

    // String 的 (+=) 用法是相同
    String message = "Hello";
    message += " World!"; // Equivalent to message = message + " World!";
    System.out.println(message);// Result: "Hello World!"


    // Operators 3. Logical (&&), (||), (!), are asking "if xxx is true" question.
    boolean a = true;
    boolean b = false;
    boolean result1 = a && b; // false, Logical AND (asking if a and b are true)
    boolean result2 = a || b; // true, Logical OR (asking if either a or b is true)
    boolean result3 = !a; // false, Logical NOT (asking if a is false)
    System.out.println(a);
    System.out.println(b);
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    boolean oneAddOneIsTwo = true;
    boolean oneAddOneisOne = false;
    System.out.println(
        "----------------------------------------------------------------");
    System.out.println(oneAddOneIsTwo && oneAddOneisOne); // If both are true, answer is false
    System.out.println(oneAddOneIsTwo || oneAddOneisOne); // If either is true, answer is true
    System.out.println(!oneAddOneIsTwo); // if value is false, answer is no (false)
    System.out.println(!oneAddOneisOne); // if value is false, answer is yes (true)


    // Operators 4. Relational (==), (!=), (<), (<=), (>), (>=), result is only show true or false
    // This example is for int.
    int x4 = 7;
    int y4 = 3;
    int z4 = 10;
    System.out.println(x4 == y4); // Q: Is x4 equal to y4? A: False.
    System.out.println(y4 >= z4); // Q: Is y4 greater than or equal to z4? A: False.
    System.out.println(x4 != y4); // Q: Is x4 not equal to y4? A: True.
    System.out.println(y4 <= z4); // Q: Is y4 less than or equal to z4? A: True.
    System.out.println("--------------------END--------------------");
    // This example for char.
    char cc1 = '$';
    char cc2 = 'W';
    char cc3 = 'A';
    System.out.println(cc1 == cc2); // Q: Is cc1 equal to cc2? A: False.
    System.out.println(cc2 >= cc3); // Q: Is cc2 greater than or equal to cc3? A: True. *It base on "Unicode"
    System.out.println(cc3 != cc1); // Q: Is cc3 not equal to cc1? A: True.
    // This example for boolean. Can only apply (==), (!=)
    boolean bb1 = true;
    boolean bb2 = false;
    System.out.println(bb1 == bb2);
    System.out.println(bb2 != bb1);
    // Math example.
    int resultx = 10 - 5 + 2;
    System.out.println(resultx); // 會先做減數
    boolean resultz = true && false || true;
    System.out.println(resultz); // 編寫時需要輸入(&&)先，會先處理(&&)再處理(||)

    // Exercise what is yyy?
    int xxx = 3;
    int yyy = (xxx++ + 3) * xxx++;
    System.out.println(yyy); // (4 + 3) * 4 = 28
    // Why yyy = 24?
  }
}
