package de.otto.tutorium.day1.exercises

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec


class MoneyChangeTest extends AnyWordSpec with Matchers {

  "MoneyChange.countChange" should {

    "example given in instructions" in {
      MoneyChange.countChange(4, List(1, 2)) shouldBe 3
    }

    "sorted CHF" in {
      MoneyChange.countChange(300, List(5, 10, 20, 50, 100, 200, 500)) shouldBe 1022
    }

    "no pennies" in {
      MoneyChange.countChange(301, List(5, 10, 20, 50, 100, 200, 500)) shouldBe 0
    }

    "unsorted CHF" in {
      MoneyChange.countChange(300, List(500, 5, 50, 100, 20, 200, 10)) shouldBe 1022
    }
  }

}
