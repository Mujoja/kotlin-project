// a = l*w
import java.util.Scanner

fun main() {

    var read = Scanner(System.`in`)
    
    // Read the width
    println("Enter the width of the rectangle: ")
    val width = read.nextInt()
    println("Width = $width")

    //Read the height
    println("Enter the height of the rectangle: ")
    val height =read.nextInt ()
    println("Width = $width")

    // Calculate the area
    val area = width * height

    // Print the result
    println("The area of the rectangle is: $area")

}