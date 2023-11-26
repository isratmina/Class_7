fun main(args: Array<String>) {

    for(year in 2000..2050 step 2) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("${year} is a Leap Year")
        }else {
            println("${year} is not a Leap Year")
        }
    }
}