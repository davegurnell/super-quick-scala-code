package part1

import films.{Director, Film}
import part3.Exercise16aOptionAndEither.getClass

object Exercise6Films {
  // Complete the following methods.
  // The exercises value gradually more complex as you go on.
  // The idea is to practice chaining methods together.
  // You DO NOT need to reference previous answers in later ones.

  def nameOfFilm(film: Film): String = {
    ???
  }

  def filmsByDirector(director: Director): List[Film] = {
    ???
  }

  def directorsWithBackCatalogOfSize(directors: List[Director], numberOfFilms: Int): List[Director] = {
    ???
  }

  def directorsBornBefore(directors: List[Director], year: Int): List[Director] = {
    ???
  }

  def directorsBornBeforeWithBackCatalogOfSize(
      directors: List[Director],
      year: Int,
      numberOfFilms: Int
  ): List[Director] = {
    ???
  }

  def namesOfFilms(films: List[Film]): List[String] = {
    ???
  }

  def namesOfFilmsByDirector(director: Director): List[String] = {
    ???
  }

  def namesOfFilmsByDirectorScoringAtLeast(director: Director, imdbRating: Double): List[String] = {
    ???
  }

  def main(args: Array[String]): Unit = {
    println("Ran " + getClass.getSimpleName)
  }
}
