package exercises.chapter3

import scala.collection.mutable.ArrayBuffer

/**
 * @author Tereshchenko
 */
class Tests {

  import org.junit._
  import Assert._

  import exercises.chapter3._

  @Test def fillArray() {
    populate(10)
    assertEquals("array filled with 10 elements", 10, a.length)
  }

  @Test def swapArrayTest() {
    val exp = Array(2, 1, 4, 3, 5)
    val res = swapAdjacentElements(Array(1, 2, 3, 4, 5))
    for (i <- 0 until exp.length) {
      assertEquals("check swap order", exp(i), res(i))
    }
    assertArrayEquals(exp, res);
  }

  @Test def swapArrayYieldTest() {
    val exp = Array[Int](2, 1, 4, 3, 5)
    val res = swapAdjacentElementsYield(Array(1, 2, 3, 4, 5)).toArray
    for (i <- 0 until exp.length) {
      assertEquals("check swap order", exp(i), res(i))
    }
    assertArrayEquals(exp, res);
  }

  @Test def swapArrayIntegersTest() {
    val exp = Array(2, 1, 4, -3, -5)
    val res = swapArrayIntegers(Array(2, -3, 1, 4, -5))
    for (i <- 0 until exp.length) {
      assertEquals("check swap order", exp(i), res(i))
    }
    assertArrayEquals(exp, res);
  }

  @Test def arrayAvarageTest() {
    assertEquals(5.5, arrayAvarage(Array[Double](1, 2, 3, 4, 5, 6, 7, 8, 9, 10)), 0.1)
  }

  @Test def arrayAvarageSumTest() {
    assertEquals(5.5, arrayAvarageSum(Array[Double](1, 2, 3, 4, 5, 6, 7, 8, 9, 10)), 0.001)
  }

  @Test def reverseSortOrderTest() {
    val exp = Array(4, 2, 1, -3, -5)
    val res = reverseSortOrder(Array(2, -3, 1, 4, -5))
    assertArrayEquals(exp, res);
  }

  @Test def reverseSortOrderWithTest() {
    val exp = Array(4, 2, 1, -3, -5)
    val res = reverseSortOrderWith(Array(2, -3, 1, 4, -5))
    assertArrayEquals(exp, res);
  }

  @Test def reverseSortOrderBufferTest() {
    val exp = Array(4, 2, 1, -3, -5)
    val res = reverseSortOrderBuffer(ArrayBuffer(2, -3, 1, 4, -5))
    assertArrayEquals(exp, res.toArray);
  }

  @Test def reverseSortOrderBufferWithTest() {
    val exp = Array(4, 2, 1, -3, -5)
    val res = reverseSortOrderBufferWith(ArrayBuffer(2, -3, 1, 4, -5))
    assertArrayEquals(exp, res.toArray);
  }

  @Test def arrayDistinctTest() {
    val exp = Array(2, -3, 1, 4, -5)
    val res = arrayDistinct(Array(2, -3, 1, 2, 4, -3, -5))
    assertArrayEquals(exp, res);
  }

}