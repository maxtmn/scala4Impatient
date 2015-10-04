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
  def swapAdjacentElements(array: Array[Int]): Array[Int] = {
    for (i <- 0 until array.length if (i % 2 == 1)) {
      var tmp = array(i)
      array(i) = array(i - 1)
      array(i - 1) = tmp
    }
    array
  }

  /**
   *  EX_3_03.
   *  Repeat the preceding assignment, but produce a new array with the swapped
   *  values. Use for/yield.
   */
  def swapAdjacentElementsYield(array: Array[Int]) = {
    for (i <- 0 until array.length) yield if (i % 2 == 1) array(i - 1) else {
      if (i == array.length - 1) array(i)
      else array(i + 1)
    }
  }

  /**
   *  EX_3_04.
   *  Given an array of integers, produce a new array that contains all positive
   *  values of the original array, in their original order, followed by all values that
   *  are zero or negative, in their original order.
   */
  def swapArrayIntegers(array: Array[Int]) = {
    array.filter(_ > 0) ++ array.filter(_ == 0) ++ array.filter(_ < 0)
  }
  /**
   * EX_3_05.
   *  How do you compute the average of an Array[Double]?
   */
  def arrayAvarage(array: Array[Double]): Double = {
    array.foldLeft(double2Double(1.0))((a, b) => a + b) / array.length
  }
  def arrayAvarageSum(array: Array[Double]): Double = {
    array.sum / array.length
  }

  /**
   *  EX_3_06.
   *   How do you rearrange the elements of an Array[Int] so that they appear in
   *  reverse sorted order? How do you do the same with an ArrayBuffer[Int]?
   */
  def reverseSortOrder(array: Array[Int]) = {
    array.sorted.reverse
  }

  def reverseSortOrderWith(array: Array[Int]) = {
    array.sortWith(_ > _)
  }

  def reverseSortOrderBuffer(array: ArrayBuffer[Int]) = {
    array.sorted.reverse
  }

  def reverseSortOrderBufferWith(array: ArrayBuffer[Int]) = {
    array.sortWith(_ > _)
  }

  /**
   *  EX_3_07.
   *   Write a code snippet that produces all values from an array with duplicates
   *  removed. (Hint: Look at Scaladoc.)
   */
  def arrayDistinct(array: Array[Int]) = {
    array.distinct.toArray
  }

  /**
   * EX_3_08.
   * Rewrite the example at the end of Section 3.4, "Transforming Arrays," on
   *  page 34 using the drop method for dropping the index of the first match. Look
   *  the method up in Scaladoc.
   */

  /**
   *  EX_3_09.
   *  Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs
   *  that are in America. Strip off the "America/" prefix and sort the result.
   */

  /**
   * EX_3_10.
   *  Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with
   * the call
   *  val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
   *  Then call the getNativesForFlavor method with parameter DataFlavor.imageFlavor
   *  and get the return value as a Scala buffer. (Why this obscure class? It's hard
   *  to find uses of java.util.List in the standard Java library.)
   */
}