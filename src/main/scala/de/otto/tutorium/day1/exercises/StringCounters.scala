package de.otto.tutorium.day1.exercises

object StringCounters {

  /**
    * Teilt den input-String an allen & Zeichen und gibt eine Liste aller Substrings ohne & zurück
    * Hinweise: mit <code>indexOf</code> liefert die Position von Zeichen in einem String.
    * Mit <code>substring</code> kann man ein Stück des Strings ausschneiden.
    *
    * @param input String, der an allen & geteilt werden soll
    * @return List aller Substrings ohne &
    */
  def ampersandSplitter(input: String): List[String] = ???

  /**
    * Teilt den input-String an allen Sonderzeichen ('&', '=', '%') und gibt eine Liste aller Substrings ohne
    * Sonderzeichen zurück
    *
    * @param input String, der an allen Sonderzeichen geteilt werden soll
    * @return List aller Substrings ohne Sonderzeichen
    */
  def additionalCharSplitter(input: String): List[String] = ???


  /**
    * Gibt die Anzahl der Element in der Liste zurück
    *
    * @param input
    * @return
    */
  def elementCount(input: List[String]): Int = ???

  /**
    * Zählt alle character in allen Strings in der Eingabe List
    *
    * @param input
    * @return
    */
  def charCount(input: List[String]): Int = ???


  /*
   * FIXME: Schreibt ein Funktion, die die oben definierten Funktionen als Eingabeparameter nutzen kann.
   * Ziel ist es eine String auf verschiedene Arten zu zerlegen und den zerlegten String auf verschiedene Arten zu zählen.
   * Versucht dabei mit Currying zu arbeiten.
   * def splitCount(....)(input: String): Int = ???
   */

}
