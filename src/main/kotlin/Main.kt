fun main(){

    var countries=countryName(listOf("Rwanda","Kenya","Burundi","America","Tanzania","Congo","Zimbabwe","Malawi","Mozambique","South Africa"))
    println(countries)

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








