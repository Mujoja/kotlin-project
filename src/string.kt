fun main() {

    var firstname = "Mujoja"
    var lastname = "Joshua"

    println(firstname)
    println(firstname[1])

    //Modifying a string
    println(firstname.uppercase())
    println(lastname.lowercase())

    //String concatenation - joining strings
    println(firstname + lastname)
    println(firstname + " " + lastname)

    //String interpolation
    println("My firstname is "+firstname)
        //or...
    println("My firstname is $firstname")

    var num1 =34
    var num2 =20

    println("The sum of $num1 and $num2 is "+(num1 + num2))
}

