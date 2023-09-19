import java.math.BigInteger

fun main(){
    //How to convert a numeric value to another type

    val x=5;
    //Assigning the variable without initializing
    val y:Long
    //Initializing the variable
    y=45678909876
    //Converting the incompatible type
    y.toInt()
    //Executing the relevant process.
    val z=x+y

    //Example char value

    val exChar ='A'
    val exStr="nna"
    val surname ="Erie"
    println(exChar+exStr)
    //Concatenating the String values.
    val fullName="$exChar$exStr $surname"
    println(fullName)

    //Watch-out for overspill

    //no-problem
    var a=42L
    var b :Int=a.toInt()

    var c=1234567890123
    //it will overspill
    var d:Int=c.toInt()
    println(d)

    val f=12.15
    val e:Int=f.toInt()
    println(e)

    var h:Byte;
    h=0b10

    //Store multiple values in an array

}