package advent

import java.security.MessageDigest

object Day4 {

  def mineAdventCoin(seed: String, minZeroes: Int): Int = {
    val iteratorNonce = Stream.from(1).iterator
    iteratorNonce.foreach(nonce => {
      if (hasNFirstZeroes(getMD5(seed + nonce), minZeroes)) return nonce
    })
    0
  }

  private def hasNFirstZeroes(hash: String, minZeroes: Int): Boolean = {
    val stringZeroes = "0" * minZeroes
    hash.take(minZeroes) == stringZeroes
  }

  private def getMD5(seed: String): String =
    MessageDigest.getInstance("MD5")
      .digest(seed.getBytes("UTF-8"))
      .map("%02x".format(_)).mkString

  def part1(seed: String): Int = mineAdventCoin(seed, 5)

  def part2(seed: String): Int = mineAdventCoin(seed, 6)

  def main(args: Array[String]): Unit = {
    val seed = "yzbqklnj"
    println("Part 1 result: " + part1(seed))
    println("Part 2 result: " + part2(seed))
  }
}
