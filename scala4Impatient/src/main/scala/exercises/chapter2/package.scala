package exercises

/**
 * Control structures and functions
 * @author Tereshchenko
 */
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

}
