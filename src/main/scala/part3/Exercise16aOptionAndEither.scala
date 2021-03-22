package part3

import films.{Director, Film}

object Exercise16aOptionAndEither {
  def directorWithLastName(directors: List[Director], lastName: String): Option[Director] = {
    ???
  }

  def yearOfBirthOfDirectorWithLastName(directors: List[Director], lastName: String): Option[Int] = {
    ???
  }

  def filmsByDirectorWithLastName(directors: List[Director], lastName: String): List[Film] = {
    ???
  }

  def earliestFilmByDirectorWithLastName(directors: List[Director], lastName: String): Option[Film] = {
    ???
  }

  def namesOfFilmsByDirectorWithLastName(directors: List[Director], lastName: String): List[String] = {
    ???
  }

  def nameOfEarliestFilmByDirectorWithLastName(directors: List[Director], lastName: String): Option[String] = {
    ???
  }

  def main(args: Array[String]): Unit = {
    println("Ran " + getClass.getSimpleName)
  }
}
