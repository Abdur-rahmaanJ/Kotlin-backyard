fun main(args: Array<String>) {
	val a:Int = 1;
	val b:Int = 10;
	for (x in a..b)
	{
	    when (x) 
	    {//also 1,10 -> println("end range detected")
          1 -> println("1 detected")
          5 -> println("5 detected");
          10 -> println("10 detected")
          else -> { 
             println("target not found")
          }
       }
	}
}
