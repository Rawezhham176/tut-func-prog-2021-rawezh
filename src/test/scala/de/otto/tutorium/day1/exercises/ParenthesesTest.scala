package de.otto.tutorium.day1.exercises

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ParenthesesTest extends AnyWordSpec with Matchers {

  "Parentheses isWellFormed" should {

    "be true for an empty List" in {
      Parentheses.isWellFormed(List.empty) shouldBe true
    }

    "be true for a balanced list" in {
      Parentheses.isWellFormed("()((()()))".toList) shouldBe true
    }

    "ignore other characters beside parentheses" in {
      Parentheses.isWellFormed("if (x == y) then (foo(bar)) else (snafu)".toList) shouldBe true
    }

    "be false for missing open parentheses" in {
      Parentheses.isWellFormed(";-)".toList) shouldBe false
    }

    "be false if number of parentheses is correct, but not well formed" in {
      Parentheses.isWellFormed("())(".toList) shouldBe false
    }

    "be false starting with close parentheses" in {
      Parentheses.isWellFormed(")(".toList) shouldBe false
    }

  }
}
