object Q1 {

  def main(args: Array[String]): Unit = {
    val temperatures = List(10.0, 20.0, 30.0, 40.0, 50.0);
    val averageFahrenheit = calculateAverage(temperatures);
    println("Average Fahrenheit temperature is " + averageFahrenheit);
  }

  def calculateAverage(temperatures: List[Double]): Double = {
    val convertedTemps = temperatures.map((x) => (x * 9 / 5) + 32);
    val sum = convertedTemps.reduce((x, y) => x + y);
    val count = temperatures.length
    sum / count
  }

}