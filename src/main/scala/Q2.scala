object Q2 {

  def main(args: Array[String]): Unit = {
    val words = List("ucsc", "campus", "colombo", "sri", "lanka");
    val totalOccurrences = countLetterOccurrences(words);
    println("Total number of letter occurrences in the given words is " + totalOccurrences);
  }

  def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map((x) => x.length);
    val sum = wordLengths.reduce((x, y) => x + y);
    sum
  }

}
