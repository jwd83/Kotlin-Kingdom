
fun main() {
    range("Int",Int.MIN_VALUE, Int.MAX_VALUE)
    
}

fun range(name: String, lower: Any, upper: Any) {
    println("$name: Lower Bound: $lower, Upper Bound: $upper")
}
