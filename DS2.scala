object DS2 {
  def main(args:Array[String]): Unit={
    val arrayData = Array("apple","oranges","guava")
    arrayData.foreach(println)
    println(arrayData.mkString(","))
    arrayData(0)="banana"
    println(arrayData.mkString(","))

    //Declare an empty array
    val arr_1=new Array[String](5)
    val arr_2= Array.ofDim[Int](2,2)
    arr_2(0)(0)=1
    arr_2(0)(1)=10
    arr_2(1)(0)=11
    arr_2(1)(1)=100
    //print the array
    //println(s"arr_1:$arr_1")  --we will get address if we print array directly
    //first approach-flattenArr
    val flattenArr:Array[Int]=arr_2.flatten
    println(flattenArr.mkString(","))
    arr_2(0)(1)=38
    val flattenArr1:Array[Int]=arr_2.flatten
    println(flattenArr1.mkString(","))

    //SET COLLECTION:immutable collection
    //HashSet : mutable collection of sets
    val set_1=Set[String]()
    val set_2=Set("Delhi","Mumbai","Kolkata")
    import scala.collection.mutable.Set
    val mutableSet=Set("pen","paper","pencil","compass")
    mutableSet += "scissor"
    mutableSet -= "compass"
    println(s"mutableSet:$mutableSet")

    //TUPLE DECLARATION
    //In scala tuple is fixed size and can hold multiple data types
    val Tup_1=(9,8,5,4,2,1)
    //Tup_1._1="nine"     --we cant change the values,as tuple is immutable
    println(Tup_1._1)
    println(Tup_1._2)
    println(Tup_1._3)

    //MAP:- map is a collection of key-value pairs ,
    // where each key is unique

    //import scala.collection.immutable.Map    //by default map is immutable so no need to import

    //empty variable declaration
    var mapVar:Map[String,Int]=Map()
    var mapVar1=Map("UST001"->"Shankar","UST002"->"Motesh","UST003"->"Bhagya")

    //ACCESING values using key
    println(mapVar1.get("UST002"))
    //print all keys
    println(mapVar1.keys)

    //print all values
    println(mapVar1.values)
    println(mapVar1.contains("UST002"))   //contains() returns boolean values

    import scala.collection.mutable.Map
    val mapVar2 =Map("UST004"->"Mona","UST005"->"Madhu","UST006"->"Jaylee")
    //updating value
    mapVar2("UST006") = "Sharmistha"
    //inserting new key value pair
    mapVar2 += ("UST004"->"Mona")

    println(mapVar2.keys)
    println(mapVar2.values)

    //Iterators :- it represent a sequence of elements that allow you to traverse
    // through a collection sequentially.

    val myList =List(20,30,40,50)
    val iter = myList.iterator
    //methods of iterator: .hasNext() -to check if there is more elements,
    //.next() - to retrieve next value,
    //.remove - to remove element from mutable iterators
    println(iter.next())
    println(iter.next())

    //LAZY INITIALIZATION
    lazy val donuts:Int = 60
    println(donuts * 2)

    //lazy var cake:Int = 40   --we cant initialize var with lazy(we will get error(ambiguity)

  }

}
