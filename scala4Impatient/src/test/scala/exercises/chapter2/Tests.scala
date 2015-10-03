package exercises.chapter2

import scala.runtime.BoxedUnit

/**
 * @author Tereshchenko
 */
class Tests {

  import org.junit._
  import Assert._

  val signTest = exercises.chapter2.signum(_)

  @Test def signum$positive() {
    assertEquals(" the signum of a number is 1 if the number is positive", 1, signTest(10))
  }

  @Test def signum$negative() {
    assertEquals(" the signum of a number is -1 if the number is negative", -1, signTest(-5))
  }

  @Test def signum$zero() {
    assertEquals(" the signum of a number is 0 if the number is 0", 0, signTest(0))
  }

  val empty = exercises.chapter2.emptyBlock()

  @Test def emptyBlock$type() {
    assertTrue("scala empty block {} type is Unit", empty.isInstanceOf[Unit])
  }

  @Test def emptyBlock$value() {
    assertEquals("empty block {} value is () ", "()", empty.toString)
  }
}