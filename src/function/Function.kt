package function

import java.util.*

fun main(args : Array<String>) {

    var name = "Kritchat"                       //Declare variable name with assign "Kritchat"
    printData(name)                             //Call function prindData
    var sum = calculate(1,5)       //Declare variable sum with calling calculate function
    printData(sum.toString())                   //Cll function by sending sum and covert sum to String because printData required String type

    /**
     *  var number = 1              //Create type number and convert to String
     *  number.toString()
     *
     *  var decimal = 5.4           //Create type Float and convert to String
     *  decimal.toString()
     *
     *  var isCheck = true;         //Create type Boolean and convert to String
     *  isCheck.toString()
     *
     *  We can deal with toString like Java do..
     */

}

/**
 * Create function with required a variable with type String
 * this function not return anything
 */
fun printData(data:String){
    println(data)
}

/**
 * Create function with required two parameter with type Int
 * this function return Int
 */
fun calculate(num1 : Int, num2: Int) : Int{

    return num1+num2;
}