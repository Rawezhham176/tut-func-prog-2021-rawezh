package de.otto.tutorium.day1.examples

class HelloWorld(name: String) {
  def add(x: Int, y: Int): Int =
    x + y

  def sayHello(): String = {
    "Hello " + name
  }

}
