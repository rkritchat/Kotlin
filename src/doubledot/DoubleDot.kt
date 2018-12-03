package doubledot

fun main(args: Array<String>){

    var a = 1..10 step 2                // a is list of number from 1 to 10 and increase two[ step 2 ]
    var b = 10 downTo 1 step 2          // b start from ten downTo one and decrease two[ step 2 ]
    var c = 10 until 100 step 10        // c same with double dot, start from ten until one-hundred increase ten
    println(a)                          // If use function print then system will convert it to String = '1..10 step 2'


    for(i in a){
        print("$i,")                    // Result is 1,3,5,7,9,
    }

    println()

    for(i in b){
        print("$i,")                    // Result is 10,8,6,4,2,
    }

    println()

    for(i in c){
        print("$i,")                    // Result is 10,20,30,40,50,60,70,80,90,  not print 100 because when it increase
    }                                   // Until 100 condition will be false, it means finish loop
}