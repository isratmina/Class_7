import java.util.Scanner
fun main(args: Array<String>) {
    var grade: String
    grade()
}

fun grade() {
    val marks=98
    var result = if(marks >= 91)
        "A+"
    else if(marks >= 81)
        "A"
    else if(marks >= 71)
        "B+"
    else if(marks >= 61)
        "B"
    else if(marks >= 51)
        "C+"
    else if(marks >= 41)
        "C"
    else if(marks >= 33)
        "D"
    else
        "F"
    println("My grade is: ${result}")
}
