import scala.annotation.tailrec
// Scala Cheat Sheet
// https://github.com/lampepfl/progfun-wiki/blob/gh-pages/CheatSheet.md

// mutable
var str = "foobar"
str = "snafu"

// immutable
val i = 3
val j: Int = 42

// Funcktions definition
def square(x: Int): Int = x * x

// Funktionsaufruf
square(i)

// Sichtbarkeiter
val x = 0
def f(y: Int) = y + 1
val result = {
	val x = f(3)
	x * x
}
// Definitionen innerhalb eines Block sind nur innerhalb des Blocks sichtbar
// Definitionen innerhalb eines Block überlagern Definitionen mit den selben Namen außerhalb des Blocks


// Listen
val l1 = Nil
val l2 = List.empty
val l3 = "a" :: "b" :: "c" :: Nil
val l4: List[Int] = List(1, 2, 3, 4)
val l5: List[Any] = List(1, "a", List(4.2))

val h = l4.head
val t = l4.tail


// Tupel
val t1 = (1, "foo")
val t2 = (1, 3.4, 5L, "funky")
val t3 = 2 -> "bar"

// Elementenzugriff
t2._4

def tupelFoo(x: Int, s: String): (String, Int) = {
	val u = s + "Foo"
	val squ = x * x
	(u, squ)
}


// Map
val m1 = Map(t1, t3, 3 -> "snafu")
val m2 = Map.empty[Int , String]
val m3 = m2 + (2 -> "b")
m3 + (2 -> "c")
m3.+(2 -> "d")
m1 - 3
m1 ++ m3


// Conditionals
def abs(x: Int) =
	if (x >= 0) {
		println("foo")
		x
	} else
		-x

abs(4)
abs(-4)

// Semikolon
val funky = "time";
val hugo = "hektik"


// Vergleichsoperatoren
i == 42
i != 42
i > 42
j <= 42
funky == "snafu"
(1, "foo") == t1


// Boolean
val b1 = !true
val b2 = false && true
val b3 = true || false


def gcd(a: Int, b: Int): Int =
	if (b == 0) a else gcd(b, a % b)

gcd(14, 21)

def factorial(n: Int): Int =
	if (n == 0) 1 else n * factorial(n - 1)

factorial(4)

// Wie koennte die factiorial function tail recursive sein?
def factorial2(n: Int): Int = {
	@tailrec
	def facRec(akku: Int, x: Int): Int = {
		if (x == 0) akku
		else facRec(akku * x, x - 1)
	}

	facRec(1, n)
}

factorial2(4)

