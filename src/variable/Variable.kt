package variable

fun main(args: Array<String>){

    /**
     * This is example of declare normal variable
     * We can declare variable without type
     */
    var ten = 10                //Int
    var name = "kritchat"       //String
    var weight = 68.5           //Float
    // ten = "a"                //Will error because variable ten already reserve to Int

    /**
     * We can also fix type of variable following below
     */
    var age : Int               // Declare age to type Int
    age = 10                    // Assign value 10 to age
    var lastName : String = "b"  //This is way to fix data type,
    // if not fix Kotlin will read from value such as "s" -> should be type String
    // var number : int          //Seem like Kotlin no have primitive data type then we have to use fun Int instead

    /**
     * val is constant and constant cannot be change anymore
     * val same like []static final] in java
     */
    val errorCode = "A0001"     //String
    // errorCode = "2"  //Kotlin not allow to change constant

    println(ten)
    println(name)
    println(weight)
    println(errorCode)
    println(lastName)
    println(age)
}