// Summe aller Integer zwischen a und b
def sumInts(a: Int, b: Int): Int =
	if (a > b) 0 else a + sumInts(a + 1, b)

sumInts(2, 4)


// Summe aller Wuerfel aller Integer zwischen a und b
def cube(x: Int) = x * x * x

def sumCubes(a: Int, b: Int): Int =
	if (a > b) 0 else cube(a) + sumCubes(a + 1, b)

cube(2)
cube(3)
cube(4)

sumCubes(2, 4)


// Summe aller Fakultaeten aller Integer zwischen a und b
def fact(x: Int): Int =
	if (x == 0) 1 else x * fact(x - 1)

def sumFact(a: Int, b: Int): Int =
	if (a > b) 0 else fact(a) + sumFact(a + 1, b)

fact(2)
fact(3)
fact(4)
sumFact(2, 4)


// Gemeinsamkeiten heraus gezogen
def sum(f: Int => Int, a: Int, b: Int): Int =
	if (a > b) 0
	else f(a) + sum(f, a + 1, b)

// Summen-Funktionen mit Funktionen als Parameter
def id(x: Int) = x


def sumIntsHigh(a: Int, b: Int) = sum(id, a, b)
def sumCubesHigh(a: Int, b: Int) = sum(cube, a, b)
def sumFactHigh(a: Int, b: Int) = sum(fact, a, b)

sumIntsHigh(2, 4)
sumCubesHigh(2, 4)
sumFactHigh(2, 4)


// Summen-Funktionen mit Anonymen Funktionen
def sumIntsAnon(a: Int, b: Int) = sum(x => x, a, b)
def sumCubesAnon(a: Int, b: Int) = sum(x => x * x * x, a, b)

sumIntsAnon(2, 4)
sumCubesAnon(2, 4)


// Summen-Funktion als Rueckgabe-Wert einer Funktion
def sum(f: Int => Int): (Int, Int) => Int = {
	def sumF(a: Int, b: Int): Int =
		if(a > b) 0
		else f(a) + sumF(a +1, b)
	sumF
}


// Verwendung der neuen Summen-Funktion in unseren Summen-Funktionen
def sumIntsReturnFunc = sum(x => x)
def sumCubesReturnFunc = sum(cube)
def sumFactReturnFunc = sum(fact)

sumIntsReturnFunc(2, 4)
sumCubesReturnFunc(2, 4)
sumFactReturnFunc(2, 4)


// Weglassen der speziellen Funktions definitionen
sum(id)(2, 4)
sum(x => x)(2, 4)
sum(cube)(2, 4)
sum(fact)(2, 4)


// Currying Variante der Summen-Funktionen
def sumCurry(f: Int => Int)(a: Int, b: Int): Int =
	if (a > b) 0 else f(a) + sumCurry(f)(a + 1, b)

sumCurry(id)(2, 4)
sumCurry(cube)(2, 4)
sumCurry(fact)(2, 4)

