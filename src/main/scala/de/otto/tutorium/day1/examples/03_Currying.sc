// Currying Variante der Summen-Funktionen
def sum(f: Int => Int)(a: Int, b: Int): Int =
	if (a > b) 0 else f(a) + sum(f)(a + 1, b)

def fact(x: Int): Int =
	if (x == 0) 1 else x * fact(x - 1)

sum(x => x)(2, 4)
sum(x => x * x * x)(2, 4)
// Fakultät kann nicht anonym definiert werden,
// da der Funktionsname für den rekursiven Aufrufen fehlt
sum(fact)(2, 4)
