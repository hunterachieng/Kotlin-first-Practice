fun main (){
    add(10,30)
    var subtract = sub (5.4f, 3.4f)
    println(subtract)
    name()
    again()
    still()
    println(hello())
    println(amust())
    println(insist())
    println(greeting())
    println(maths(34,60))

}
fun add (a:Int, b:Int){
    var sum = a + b
    println(sum)
}
fun sub (num1:Float,num2:Float):Float{
    var minus = num1- num2
    return minus
}
fun name (){
    var know = "Achieng"
    println( "Hello " + know)
}
fun again(){
    var she = "never"
    when (she){
        "again" -> println("nkt")
        else -> println("good")
    }
}
fun still (){
    var num = 56
    if (num != 56) {
        println("stupid")
    } else{
        println("nice")
    }

}
fun hello ():String{
    return "always yours"
}
fun amust ():String {
    return "you know yourself"
}
fun insist ():String{
    return "mother"
}
fun greeting () = "Trials"
fun maths (a:Int,b:Int) = a + b