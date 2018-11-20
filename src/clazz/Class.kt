package clazz

fun main(args : Array<String>){
    var monitorObj = Screen()              //Declare variable monitorObj with type Screen object

    monitorObj.show("Cartoon")       //Call method show inside Screen class

    var externalMonitorObj = ExternalScreen() //Declare variable externalMonitorObj with external class
    externalMonitorObj.show("Love")     //Call method show inside ExternalScreen class


    var screenWithParam = ScreenWithParam()
    screenWithParam.tmp = "Assign data to tmp inside ScreenWithParam class"   //Modify property inside ScreenWithParam class
    screenWithParam.show()
}


/**
 * This is internal class
 */
class Screen{
    fun show(data : String){
        println(data)
    }
}


/**
 * This is example how to create class with property
 */
class ScreenWithParam{

    var tmp : String=""                      //property need to initialize
    //var tmp : String     Kotlin not allow to create property without initialize


    fun show(){
        println(tmp)
    }
}