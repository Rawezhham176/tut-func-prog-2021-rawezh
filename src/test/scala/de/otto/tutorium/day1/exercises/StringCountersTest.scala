package de.otto.tutorium.day1.exercises

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class StringCountersTest extends AnyWordSpec with Matchers {
  val testString = "foo=bar&snafu=true&funky=time%space"
  "StringCounters" should {

    "split by ampersand" in {
      StringCounters.ampersandSplitter(testString) shouldBe testString.split('&').toList
    }

    "not split by ampersand if it does not contain an ampersand" in {
      StringCounters.ampersandSplitter("funkytime") shouldBe List("funkytime")
    }

    "not split by ampersand if input is empty" in {
      StringCounters.ampersandSplitter("") shouldBe List("")
    }

    "split by special characters" in {
      val testString = "foo=bar&snafu=true&funky=time%space"
      StringCounters.additionalCharSplitter(testString) shouldBe List("foo", "bar", "snafu", "true", "funky", "time", "space")
    }

    "not split by special characters if it does not contain an special characters" in {
      StringCounters.additionalCharSplitter("funkytime") shouldBe List("funkytime")
    }

    "not split by special characters if input is empty" in {
      StringCounters.additionalCharSplitter("") shouldBe List("")
    }

    "count all Elements in a given List" in {
      StringCounters.elementCount(List("foo", "bar", "")) shouldBe 3
    }

    "count all Elements on empty List" in {
      StringCounters.elementCount(List.empty) shouldBe 0
    }

    "count all Characters in a given List" in {
      StringCounters.charCount(List("foo", "bar", "")) shouldBe 6
    }

    "count all Chrarcters on empty List" in {
      StringCounters.charCount(List.empty) shouldBe 0
    }
  }

  "SplitCount" should {
    "split by ampersand and count elements" ignore {
      // foo=bar&snafu=true&funky=time%space => List(foo=bar, snafu=true, funky=time%space) => 3
      // StringCounters.splitCount???(testString) shouldBe 3
    }

    "split by special characters and count elements" ignore {
      // foo=bar&snafu=true&funky=time%space => List(foo, bar, snafu, true, funky, time, space) => 7
      // StringCounters.splitCount???(testString) shouldBe 7
    }
    "split by ampersand and count characters" ignore {
      // foo=bar&snafu=true&funky=time%space => List(foo=bar, snafu=true, funky=time%space) => 33
      // StringCounters.splitCount???(testString) shouldBe 33
    }
    "split by special characters and count characters" ignore {
      // foo=bar&snafu=true&funky=time%space => List(foo, bar, snafu, true, funky, time, space) => 29
      // StringCounters.splitCount???(testString) shouldBe 29
    }
  }
}
