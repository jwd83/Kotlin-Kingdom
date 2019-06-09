import kotlin.random.Random

fun flip(): String {
    if (Random.nextInt() % 2 == 0) {
        return "Heads"
    } else {
        return "Tails"
    }
}

fun main() {
    println("Jack's Coin Flipper")
    println("How many flips? ")
    println()
    
    var numberOfLines: Int = constrain(readLine()?.toIntOrNull() ?: 0  , 1, 9999)
    
    while(numberOfLines-- > 0) {
        println(flip())
    }
}

fun constrain(value: Int, min: Int, max: Int): Int
{
    if(value < min)
        return min
    if (value > max)
        return max
    return value
}
