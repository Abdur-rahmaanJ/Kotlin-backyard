interface Cat {
   fun mew() {
      println("miaaaaaow")
   }
}
interface Dog  {
   fun bark() {
      println("wooooooooooooooof")
   }
}


class Animal: Cat, Dog // implementing 2 interfaces

fun main(args: Array<String>) {
   val weird = Animal()
   weird.mew();
   weird.bark();
}
