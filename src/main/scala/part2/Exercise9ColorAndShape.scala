package part2

// PART 1 - COLOR -------------------------------

// Write a definition for Color
//
// Implement a method "isLight" that returns true if
// the average of the colours RGB is >= 0.5
//
// Implement a method "toGreyscale" that returns
// a shade of grey that's the average of the RGB of the current Color

// PART 2 - SHAPE -------------------------------

// Write definitions for Shape, Circle, and Rect here!
//
// Implement two methods on

// PART 3 - BLENDING COLORS ---------------------

// Write a *companion object* for Color
//
// Implement a method "greyscale" that takes a number n as a parameter
// and returns a colour with its RGB values all set to n
//
// Implement a method "blend" that takes two colours as parameters
// and averages them

// (OPTIONAL) Write a companion object for Shape
//
// Implement a method "compare" that takes two shapes x and y as parameters
// and returns a boolean representing whether x should come before y in a sorted list of shapes:
//
// - false means x comes before y
// - true means y comes before x
// - shapes with fewer points always come first
// - larger shapes always come first

// ----------------------------------------------

object Exercise9ColorAndShape {
  def main(args: Array[String]): Unit = {
    println("color")
    // println(Color(1, 1, 0))
    // println(Color(1, 0, 1))
    // println(Color(1, 1, 0).isLight)
    // println(Color(1, 0, 0).isLight)
    // println(Color(1, 0, 1).toGreyscale)
    // println(Color(1, 0, 0).toGreyscale)

    println("circle")
    // val circle = Circle(30, Color(1, 1, 0))
    // println(circle)
    // println(circle.area)
    // println(circle.perimeter)

    println("rect")
    // val rect = Rect(50, 30, Color(1, 0, 1))
    // println(rect)
    // println(rect.area)
    // println(rect.perimeter)
  }
}
