/*
* create a function which takes an array of integer as an argument figure out
* which number is bigger number in that array and return the number,
* also create another function which returns the minimum number in that array and
* combine both functions in single function which returns either maximum or
* minimum number
* */
import java.io.Serializable
import java.util.Scanner

fun main() {
    val myNumbers = arrayOf(1, 23, 45, 67, 92, 101, 231, -12, -44, +34, 12)
    println(getMinMax(myNumbers))
}
fun getMinMax(numbers: Array<Int>): Serializable {
    val input = Scanner(System.`in`)

    print("Option :\n1.Max\n2.Min\n:")
    return when(input.nextInt()){
        1 -> findMax(numbers)
        2 -> findMin(numbers)
        else -> "No option selected"
    }

}
fun findMax(numbers: Array<Int>): Int{
    var maxNum = numbers[0]
    for (number in numbers){
        if (number > maxNum){
            maxNum = number
        }
    }
    return maxNum
}
fun findMin(numbers: Array<Int>): Int{
    var minNum = numbers[0]
    for (number in numbers){
        if (number < minNum){
            minNum = number
        }
    }
    return minNum
}