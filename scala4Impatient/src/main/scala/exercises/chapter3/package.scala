package exercises

/**
 * Arrays
 * @author Tereshchenko
 */
import scala.collection.mutable.ArrayBuffer
package object chapter3 {
  /**
   * EX_3_01
   *  Write a code snippet that sets a to an array of n random integers between 0
   * (inclusive) and n (exclusive).
   */
  val a: ArrayBuffer[Int] = new ArrayBuffer[Int]();
  def populate(n: Int) {
    for (n <- 0 until n) a += n
  }

  /**
   * EX_3_02
   * Write a loop that swaps adjacent elements of an array of integers. For example,
   * Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
   */
}