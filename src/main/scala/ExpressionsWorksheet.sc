// LITERALS -------------------------------------

//123
//123L
//123.0
//true
//"a"
//'a'
//
//"""
//Triple-quoted strings
//can contain quotes
//and can span multiple lines
//"""

// OPERATORS ------------------------------------

//(1 + 2) * (3 + 4)
//1 + 2 * 3 + 4
//
//7 / 3
//7 % 3
//7.0 / 3
//
//"Hello" + "world!"
//true && !false
//
//123 + 456
//123 + 456L
//123 + "456"
//
//"a" == "a"
//"a" != "a"

// FUNCTION AND METHOD CALLS --------------------

//"Hello world!".take(5)
//"Hello world!".length
//"Hello world!".toUpperCase
//
//Math.random
//List(1, 2, 3)
//
//List(1, 2, 3).head
//List(1, 2, 3).tail
//
//123.toString
//"123".toInt

// INFIX OPERATOR SYNTAX ------------------------

//1 + 2
//1.+(2)
//"Hello world".take(5)
//"Hello world" take 5

// What does this line of code mean?
// a b c d e

// IF-EXPRESSIONS -------------------------------

//if(Math.random < 0.5) "Alien" else "Predator"

// BLOCKS ---------------------------------------

//{
//  println("Calculating the answer...")
//  6 * 7
//}

//{
//  val a = 1
//  val b = 2
//  a + b
//}

// VALUE AND METHOD DEFINITIONS -----------------

//val definition1 = "A value"
//def definition2 = "A method"

//def definition3: String = "Another value"
//def definition4: String = "Another method"

//def definition5(a: Int, b: Int) =
//  a + b

//def definition6(a: Int, b: Int): Int =
//  a + b

// val definition7 = {
//   println("Calculating the answer...")
//   6 * 7
// }

// def definitions8 = {
//   println("Calculating the answer...")
//   6 * 7
// }

// BUILT-IN VALUES AND METHODS ------------------

//println("This is how you print things in regular Scala code")
//println(123)
//println(true)

//???
//1 + ???
//"Hello world".take(???)
//println(???)

// EXERCISES ------------------------------------

// Write the following methods and test them here in the worksheet:

// - A method called "average"
//   that takes two numbers as parameters
//   and returns the average

// - A method called "greet"
//   that takes a person's name as a parameter
//   and prints a welcome message such as "Hello Dave"

// - A method called "greeting"
//   that takes a person's name as a parameter
//   and *returns* a welcome message such as "Hello Dave"

// - A method called "circleArea"
//   that takes a radius as input
//   and returns the area of a circle with that radius
//
//   Tips:
//   - The radius of a circle is 2π times the radius
//   - You can find the value of π in math.Pi

// - A method called "clamp"
//   that takes three numbers, x, y, and z, as parameters
//   and returns the closest number to x that is also in the range y to z

// - A method "fizzBuzz"
//   that takes a number as a parameter and prints:
//   - "Fizz" if the number is a multiple of 3
//   - "Buzz" if the number is a multiple of 5
//   - "Fizz Buzz" if the multiple is a number of 3 *and* 5
//   - the number if it is not a multiple of 3 or 5

// SOME PUZZLERS --------------------------------

// What is the type and value of each of the following?

//"Hello world!".toUpperCase.reverse

//println("Hello world!".toUpperCase.reverse.toLowerCase.reverse)

//"Hello " + "world".take(2)

//"Hello " + "world" take 2

//"3".toInt

//"cake".toInt

//if(Math.random < 0.5) "Alien" else 2001

//if(math.random < 0.5) "Hello" else null

//if(math.random < 0.5) "Hello" else throw new Exception("Aaargh!")
