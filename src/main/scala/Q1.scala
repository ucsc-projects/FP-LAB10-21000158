object Q1 {

  def calculateAverage(temperatures:List[Double]):Double={
    val convertedTemps=temperatures.map((x)=>(x*9/5)+32);
    val sum=convertedTemps.reduce((a,b)=>a+b);
    val count=temperatures.length
    sum/count
  }
  def main(args: Array[String]): Unit = {
    val temperatures=List(0.0,10.0,20.0,30.0);
    val averageFahrenheit=calculateAverage(temperatures);
    println("Average Fahrenheit temperature is "+averageFahrenheit);
  }

}