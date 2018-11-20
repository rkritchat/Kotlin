package clazz

fun main(args : Array<String>){
    var monitorObj = Screen()              //Declare variable monitorObj with type Screen object

    monitorObj.show("Cartoon")       //Call method show inside Screen class

    var externalMonitorObj = ExternalScreen() //Declare variable externalMonitorObj with external class
    externalMonitorObj.show("Love")     //Call method show inside ExternalScreen class
}


/**
 * This is internal class
 */
class Screen{
    fun show(data : String){
        println(data)
    }
}