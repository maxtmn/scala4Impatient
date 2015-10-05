package exercises

/**
 * Maps and Tuples
 * @author Tereshchenko
 */
package object chapter4 {
  /**
   * EX_4_01
   *  Set up a map of prices for a number of gizmos that you covet. Then produce
   *  a second map with the same keys and the prices at a 10 percent discount.
   */

  /**
   * EX_4_02
   *  Write a program that reads words from a file. Use a mutable map to count
   *  how often each word appears. To read the words, simply use a java.util.Scanner:
   *  val in = new java.util.Scanner(java.io.File("myfile.txt"))
   *  while (in.hasNext()) process in.next()
   *  Or look at Chapter 9 for a Scalaesque way.
   *  At the end, print out all words and their counts.
   */

  /**
   * EX_4_03.
   *  Repeat the preceding exercise with an immutable map.
   *
   */

  /**
   *  EX_4_04.
   *   Repeat the preceding exercise with a sorted map, so that the words are
   *  printed in sorted order.
   */

  /**
   *  EX_4_05.
   *   Repeat the preceding exercise with a java.util.TreeMap that you adapt to the
   *  Scala API.
   */

  /**
   *  EX_4_06.
   *   Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY, and
   *  similarly for the other weekdays. Demonstrate that the elements are visited
   *  in insertion order.
   */

  /**
   * EX_4_07.
   *  Print a table of all Java properties, like this:
   *  java.runtime.name | Java(TM) SE Runtime Environment
   * sun.boot.library.path | /home/apps/jdk1.6.0_21/jre/lib/i386
   *  java.vm.version | 17.0-b16
   *  java.vm.vendor | Sun Microsystems Inc.
   *  java.vendor.url | http://java.sun.com/
   *  path.separator | :
   *  java.vm.name | Java HotSpot(TM) Server VM
   *  You need to find the length of the longest key before you can print the table.
   */

  /**
   * EX_4_08.
   *  Write a function minmax(values: Array[Int]) that returns a pair containing the
   *  smallest and largest values in the array.
   */

  /**
   * EX_4_09.
   *  Write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing
   *  the counts of values less than v, equal to v, and greater than v.
   */

  /**
   * EX_4_10
   *  What happens when you zip together two strings, such as "Hello".zip("World")?
   * // Come up with a plausible use case.
   */
}