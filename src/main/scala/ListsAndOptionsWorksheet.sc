
val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

numbers.map(number => number + 1)

numbers.filter(number => number > 5)

// Anatomy of a function expression:
//
//    parameterList => bodyExpression


def contains(numbers: List[Int], num: Int): Boolean = {
  ???
}

def containsEvenNumbers(numbers: List[Int]): Boolean = {
  ???
}

def evenNumbersOnly(numbers: List[Int]): List[Int] = {
  ???
}

def doubleEachNumber(numbers: List[Int]): List[Int] = {
  ???
}

def multiplyEachNumberBy(numbers: List[Int], num: Int): List[Int] = {
  ???
}

def evenNumbersOnlyDoubled(numbers: List[Int]): List[Int] = {
  ???
}

def fizzBuzz(numbers: List[Int]): List[String] = {
  ???
}