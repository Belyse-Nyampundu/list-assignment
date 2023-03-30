fun main(){
    var height=listOf(22.0,55.0,66.0,54.0,87.0,33.0)
    var(sum,average)=peopleHeight(height)
    println( "average is $sum,$average")

    identity()
    var countries=countryName(listOf("Rwanda","Kenya","Burundi","America","Tanzania","Congo","zimbabwe","malawi","mozambique","marrocco"))
    println(countries)
    var car1=carMoving()
    println(car1)


}

//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
 fun countryName(name: List<String>):MutableList<String>{
     var newName= mutableListOf<String>()
   name.forEachIndexed{
       namess,name ->
       if(namess%2==0){
      newName.add(name)
       }
   }
    return newName
}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
data class Height(val sum:Double,val average:Double )
    fun peopleHeight(metres:List<Double>): Height{
      var sum=metres.sum()
        var average=metres.average()
        var allMetres=Height(sum,average)
        return allMetres

    }

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
   data class Person(val name: String,val age: Int,val height:Double,val weight:Double)
  fun identity(){
      val first=Person("Belyse",21,62.5,61.7)
      val second=Person("Mugabo",11,17.4,20.4)
      val third=Person("Kirezi",23,55.5,70.5)
      val fourth=Person("Joella",55,23.4,77.5)

      val people=listOf(first,second,third,fourth)
      val sorted=people.sortedByDescending { Person -> Person.age }
      println(sorted)
  }


 //Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.




//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
 data class Car(val registration:Int,val mileage:Double)
  fun carMoving():Double{
      val vehicleOne=Car(364,378.99)
      val vehicleTwo=Car(277,879.99)
      val vehicleThree=Car(776,834.99)

      val vehicles=listOf(vehicleOne,vehicleTwo,vehicleThree)
      var sum=0.0
      for (x in vehicles){
          sum+=x.mileage
      }
      var avg = sum/vehicles.size
      return avg

  }


