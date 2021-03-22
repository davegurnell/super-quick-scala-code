// OBJECTS --------------------------------------

object iceCream {
  val name = "Sundae"
  val inCone = false
  val numCherries = 1

  // Implement this method.
  // We only sell ice creams in cones or glasses,
  // so any ice cream not in a cone must be in a glass

  def inGlass: Int = {
    ???
  }

  // Implement this method.
  // We put raspberry sauce on an ice cream if:
  // - it's in a cone and have more than 2 cherries
  // - it's in a class and have even numbers of cherries

  def hasRaspberrySauce: Boolean = {
    ???
  }

  // Write a method returns the price of an ice cream:
  //
  // - £1 if it's served in a class
  // - 50p if it's served in a cone
  // - 20p each for cherries
  // - 80p for raspberry sauce
  // - add 20% VAT if it's eaten inside
  //
  // Hint: You may need to add a parameter
  // to determine whether to charge VAT.

  def price: Int = {
    ???
  }
}

// Last exercise (for now):
//
// We've decided to refactor the software for the ice cream parlour.
//
// Pricing calculations must no longer live
// in the same objects as ingredients.
//
// Create a new object called priceCalculator
// and move the price method there instead
