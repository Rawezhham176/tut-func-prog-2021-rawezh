package de.otto.tutorium.day1.exercises

object MoneyChange {
  /**
    * Man geht in den Supermarkt und bezahlt einen zu hohen Betrag. Nun kann das Wechselgeld in unterschiedlichen
    * Münzkombinationen zurück gegeben  werden. Zum Beispiel: Es gibt 3 Wechselgeld-Möglichkeiten für den Betrag 4
    * wenn man die Münzgrößen 1 und 2 kennt: 1+1+1+1, 1+1+2, 2+2.
    * Die Funktion berechnet für das übergebene <code>money</code>, in wieviele Wechselgeld-Variationen man das Geld
    * aufteilen kann, wenn man die Münzgrößen von <code>coins</code> zur Verfügung hat.
    *
    * @param money Geldbetrag, der in Münzen aufgeteilt werden soll.
    * @param coins Münzvariation, die man zum Zerteilen benutzen kann.
    * @return Wieviele Münz-Variation es für den Geldbetrag gibt.
    */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
