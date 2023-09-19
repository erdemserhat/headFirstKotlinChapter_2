import java.math.BigInteger
import java.util.Scanner

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

    var myFirstArray= arrayOf(1,2,3)
    println(myFirstArray.size)
    myFirstArray.set(0,5)
    println(myFirstArray[0])
    var k=9
    //particularly important
    println("y:${if (k>10) x else y}")

    val scanner = Scanner(System.`in`)
    k=scanner.nextInt()

    //

    var array1= arrayOf("Serhat","Ali","Volkan")
    var array2: Array<Int> = arrayOf(1,2,3)
    var array3:Array<Boolean> = arrayOf(true,false,true)



    for(i in 1..3 ){
        var random1:Int=(Math.random()*3).toInt()
        println("Name:${array1[random1]} Number:${array2[random1]} State:${array3[random1]}")
    }






}