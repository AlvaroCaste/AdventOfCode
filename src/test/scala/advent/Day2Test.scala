package advent

import org.scalatest.{FlatSpec, ShouldMatchers}

class Day2Test extends FlatSpec with ShouldMatchers {

  private val example1 = "2x3x4"
  private val example2 = "1x1x10"
  private val example3 = example1 + "\n" + example2 + "\n"

  "Part 1 wrapping paper" should "compute the wrapping paper" in {
    Day2.part1(example1) shouldBe 58
    Day2.part1(example2) shouldBe 43
  }

  it should "add up the area for all presents" in {
    Day2.part1(example3) shouldBe 58 + 43
  }

  "Part 2 wrapping paper" should "compute the ribbon length" in {
    Day2.part2(example1) shouldBe 34
    Day2.part2(example2) shouldBe 14
  }

  it should "add up the length for all presents" in {
    Day2.part2(example3) shouldBe 34 + 14
  }
}
