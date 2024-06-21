object DataStructures {
  def main(args:Array[String]):Unit={
    //lIST :- IMMUTABLE,HOMOGENEOUS COLLECTION OF DATAS
    val fruits:List[String] = List("apple","mango","litchi")
    println("First:"+fruits.head)
    println("Value excluding first element:"+fruits.tail)
    println("Last:" + fruits.last)

    val List1=List("Spark","Scala",12345,"IDLE",true)
    println(List1)
    println(List1.getClass)

    //Empty list declaration
    val emptyList:List[Nothing] =List()
    //Array data type: array is mutable/homogeneous collection
    val arrayData = Array("apple","litchi","oranges","watermelon")
    arrayData.foreach(println)
    //list declaration another approach
    val list_2=10::8::7::3::Nil
    println(list_2)

    //CREATE A LIST BUFFER OF MUTABLE TYPE
    import scala.collection.mutable.ListBuffer
    var cities = new ListBuffer[String]()
    cities += "Bangalore"
    cities += ("Delhi","Mumbai","Kolkata")
    cities -= "Delhi"
    println(cities)
    cities.toList    //typecasting in scala is done bt toDatatype function



  }

}
