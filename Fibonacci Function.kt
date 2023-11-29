import java.util.Scanner
var a = 0
var b = 1
var fibo = 0

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    print("Enter terms: ")
    var num = scan.nextInt()

    print("${a} ${b} ")
    fiboSeries(num)
}

fun fiboSeries(num:Int) {
    if(num > 2) {
        fibo = a + b
        a = b
        b = fibo
        print("${fibo} ")
        fiboSeries(num - 1)
    }
}