
fun main(args: Array<String>) {
    println("Hello world")
    println("10 + 11 is ${add(10,11)}")
    println("10 + 11 is ${addInline(10,11)}")
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun addInline(num1: Int, num2: Int):Int = num1 + num2
