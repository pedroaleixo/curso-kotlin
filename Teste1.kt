
    var customers = 10
    val readOnlyShapes = listOf("triangle", "square", "circle")
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")

    fun hello(){
        return println("Hello, world!")
    }

    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun sum2(x: Int, y: Int) = x + y

    fun printMessageWithPrefix(message: String, prefix: String = "Info") {
        println("[$prefix] $message")
    }

    fun printMessage(message: String) {
        println(message)
        // `return Unit` or `return` is optional
    }

    fun toSeconds(time: String): (Int) -> Int = when (time) {
        "hour" -> { value -> value * 60 * 60 }
        "minute" -> { value -> value * 60 }
        "second" -> { value -> value }
        else -> { value -> value }
    }


    fun main() {
        customers= 11
        println("Hello, world ${readOnlyShapes} ${shapes}  ${customers}!!!")
        println(" ${readOnlyShapes[0]} ${shapes[1]}")
        println("circle" in readOnlyShapes)
        shapes.add("pentagon")
        println(shapes)

        val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
        val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
        println(readOnlyFruit)
        println("This set has ${readOnlyFruit.count()} items")
        println("banana" in readOnlyFruit)
        fruit.add("dragonfruit")    // Add "dragonfruit" to the set
        println(fruit)              // [apple, banana, cherry, dragonfruit]
        fruit.remove("dragonfruit") // Remove "dragonfruit" from the set
        println(fruit)              // [apple, banana, cherry]

        val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        println(readOnlyJuiceMenu)
        val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
        println(juiceMenu)
        println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
        println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")
        juiceMenu.put("coconut", 150) // Add key "coconut" with value 150 to the map
        println(juiceMenu)
        juiceMenu.remove("orange")    // Remove key "orange" from the map
        println(juiceMenu)
        println(readOnlyJuiceMenu.containsKey("kiwi"))
        println("orange" in readOnlyJuiceMenu.keys)
        println(200 in readOnlyJuiceMenu.values)
        println(readOnlyJuiceMenu.keys)
        println(readOnlyJuiceMenu.values)


        val d: Int
        val check = true

        if (check) {
            d = 1
        } else {
            d = 2
        }

        println(d)


        val obj = "Hello"

        when (obj) {
            // Checks whether obj equals to "1"
            "1" -> println("One")
            // Checks whether obj equals to "Hello"
            "Hello" -> println("Greeting")
            // Default statement
            else -> println("Unknown")
        }

        val numbers14 = 1..4
        val numbers13 = 1..<4
        val numbers41 = 4 downTo 1
        val numbers15 = 1..5 step 2
        val charsad = 'a'..'d'
        val charszs = 'z' downTo 's' step 2


        for (number in 1..5) {
            // number is the iterator and 1..5 is the range
            print(number)
        }
        println("")

        val cakes = listOf("carrot", "cheese", "chocolate")

        for (cake in cakes) {
            println("Yummy, it's a $cake cake!")
        }


        var cakesEaten = 0
        while (cakesEaten < 3) {
            println("Eat a cake")
            cakesEaten++
        }

        var cakesEaten2 = 0
        var cakesBaked = 0
        while (cakesEaten2 < 3) {
            println("Eat a cake")
            cakesEaten2++
        }
        do {
            println("Bake a cake")
            cakesBaked++
        } while (cakesBaked < cakesEaten2)


        hello()
        println(sum(1, 2))
        printMessageWithPrefix(prefix = "Log", message = "Hello")
        printMessageWithPrefix("Hello")
        printMessage("Hello")


        println({ string: String -> string.uppercase() + "T" }("hello"))

        val upperCaseString = { string: String -> string.uppercase() }

        println(upperCaseString("hello"))

        readOnlyFruit.filter { s -> s == "banana" }

        val numbers = listOf(1, -2, 3, -4, 5, -6)
        val doubled = numbers.map { x -> x * 2 }
        val tripled = numbers.map { x -> x * 3 }

        val upperCaseString2: (String) -> String = { string -> string.uppercase() }
        println(upperCaseString2("hello"))

        val timesInMinutes = listOf(2, 10, 15, 1)
        val min2sec = toSeconds("minute")
        val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
        println("Total time is $totalTimeInSeconds secs")


        // The initial value is zero.
        // The operation sums the initial value with every item in the list cumulatively.
        println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // 6

        // Alternatively, in the form of a trailing lambda
        println(listOf(1, 2, 3).fold(0) { x, item -> x + item })  // 6

    }
