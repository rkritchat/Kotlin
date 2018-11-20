package clazz

class ExternalScreen{                       //Class name no need to match with file name

    fun show(data : String){
        println("External : $data ")        //We can user $ for read variable instead of concat
        //In case class we need to add bracket such as ${}, if not Kotlin will print address instead value
        /*  var person = Person()
         *  person.name = "Kritchat"
         *  println("person is ${person.name}")   //System will return person is Kritchat
         *  println("person is $person.name")     //System will return Person@ceca345.name
         */
    }
}
