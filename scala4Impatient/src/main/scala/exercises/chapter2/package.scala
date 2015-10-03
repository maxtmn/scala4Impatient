package exercises

/**
 * Control structures and functions
 * @author Tereshchenko
 */
import scala.reflect.internal.util.StringOps
package object chapter2 {
  /**
   * EX_2_01.
   * the signum of a number is 1 if the number is positive,
   *  -1 if it is negative and 0 if it is zero.
   *  Write function that computes this value
   */
  def signum(number: Int): Int = {
    if (number > 0) 1 else if (number == 0) 0 else
      -1
  }

  /**
   * EX_2_02.
   * What is the value of an empty block {}? What is its type?
   */
  def blank(): Unit = {}

  /**
   * EX_2_03.
   * Come up with one situation where assignment x = y = 1 is valid
   */
  def assignmentValid() {
    var y: Int = 10
    var z: Int = 1
    val x: Unit = y = z
  }

  /**
   * EX_2_04.
   *  Write a Scala equivalent for the Java loop
   * for (int i = 10; i >= 0; i--) System.out.println(i);
   */
  def forLoop(i: Int, print: Boolean) {
    var count = i
    while (count >= 0) {
      if (print) println(count)
      count = count - 1
    }
  }

  /**
   * EX_2_04.
   *  Write a Scala equivalent for the Java loop
   * for (int i = 10; i >= 0; i--) System.out.println(i);
   */
  def forLoop_2(i: Int, print: Boolean) {
    for (n <- i to (0, -1)) { if (print) println(n) }
  }

  /**
   * EX_2_05.
   * Write a procedure countdown(n: Int) that prints the numbers from n to 0
   */
  def countDown(i: Int, print: Boolean) {
    forLoop_2(i, print)
  }

  /**
   * EX_2_06.
   *  Write a for loop for computing the product of the Unicode codes of all letters
   * in a string. For example, the product of the characters in "Hello" is 9415087488.
   */
  def stringUnicodeProduct_2(str: String): BigInt = {
    //var product = 1 error, implicit type Int is too small
    var product: BigInt = 1
    for (c <- str) product = product * c
    product
  }

  /**
   * EX_2_07.
   *  Solve the preceding exercise without writing a loop. (Hint: Look at the StringOps
   * Scaladoc.)
   */
  def stringUnicodeProduct_3(str: String): BigInt = {
    str.foldLeft(BigInt("1"))((a, b) => a * b)
  }

  /**
   * EX_2_09.
   *  Write a for loop for computing the product of the Unicode codes of all letters
   * in a string. For example, the product of the characters in "Hello" is 9415087488.
   */
  def stringUnicodeProduct(str: String): BigInt = {
    unicodeProductRecursive(str)
  }

  private def unicodeProductRecursive(str: String, product: BigInt = 1): BigInt = {
    if (str.length() == 0) { product }
    else {
      unicodeProductRecursive(str.tail, product * str.head)
    }

  }

  /**
   *  EX_2_10.
   *  Write a function that computes x^n, where n is an integer. Use the following
   *  recursive definition
   *  xn = y2 if n is even and positive, where y = x ^ n / 2.
   *  xn = x * x ^ n - 1 if n is odd and positive.
   *  x0 = 1
   *  xn = 1 / x ^ -n if n is negative.
   *  Don't use a return statement.
   */
  def xpown(x: Int, n: Int): BigInt = {
    if (n > 0 && n % 2 == 0) xpown(x, n / 2) * xpown(x, n / 2)
    else if (n > 0 && n % 2 != 0) x * xpown(x, n - 1)
    else if (n == 0) 1
    else 1 / xpown(x, -n)
  }

}
