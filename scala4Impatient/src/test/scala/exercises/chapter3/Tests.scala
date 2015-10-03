package exercises.chapter3

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

}