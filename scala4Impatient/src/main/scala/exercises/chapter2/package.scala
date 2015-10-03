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
  def emptyBlock(): Unit = {}

}
