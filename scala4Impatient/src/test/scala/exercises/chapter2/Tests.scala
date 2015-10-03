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

  val empty = exercises.chapter2.blank()

  @Test def emptyBlock$type() {
    assertTrue("scala empty block {} type is Unit", empty.isInstanceOf[Unit])
  }

  @Test def emptyBlock$value() {
    assertEquals("empty block {} value is () ", "()", empty.toString)
  }

  @Test def validAssignment() {
    exercises.chapter2.assignmentValid()
    assertTrue("valid assignment ", true)
  }

  @Test def forLoop() {
    exercises.chapter2.forLoop(10, false)
    assertTrue("valid assignment ", true)
  }

  @Test def forLoop$2() {
    exercises.chapter2.forLoop_2(5, false)
    assertTrue("valid assignment ", true)
  }

  @Test def countDown() {
    exercises.chapter2.countDown(10, false)
    assertTrue("valid assignment ", true)
  }

  @Test def stringUnicodeProduct$recursive() {
    assertEquals("string 'Hello' unicode product is 9415087488", BigInt("9415087488"), exercises.chapter2.stringUnicodeProduct("Hello"))

  }

  @Test def stringUnicodeProduct$loop() {
    assertEquals("string 'Hello' unicode product is 9415087488", BigInt("9415087488"), exercises.chapter2.stringUnicodeProduct_2("Hello"))

  }

}