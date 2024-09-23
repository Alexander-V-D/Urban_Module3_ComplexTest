import kotlin.math.pow

fun main() {

}

//Функция для задачи 1
fun printSum(n: Int) {
    var sum = 2.0
    if (n == 1) {
        println("Ответ к задаче 1: $sum")
        return
    }
    for (i in 2..n) {
        sum /= i + 1
    }
    println("Ответ к задаче 1: $sum")
}

//Функция для задачи 2
fun printSumOfSquares(a: Int, b: Int) {
    var sum = 0.0
    for (i in a..b) {
        sum += i.toDouble().pow(2.0)
    }
    println("Ответ к задаче 2: ${sum.toInt()}")
}

//Функция для задачи 3
fun printSomeNumbers(a: Int, b: Int) {
    var count = 1
    println("Ответ к задаче 3:")
    for (i in a..b) {
        repeat(count) {
            println(i)
        }
        count++
    }
}

//Функция для задачи 4
fun printIsNumberPrime(n: Int) {
    if (n == 1) {
        println("Ответ к задаче 4: Число $n ни составное, ни простое")
        return
    }
    if (n <= 0) {
        println("Ответ к задаче 4: Ошибка: число $n не является натуральным")
        return
    }
    for (i in 2..<n) {
        if (n % i == 0) {
            println("Ответ к задаче 4: Число $n не является простым")
            return
        }
    }
    println("Ответ к задаче 4: Число $n является простым")
}

//Функция для задачи 5
fun getRiddle() {
    var count = 0
    println("Ответ к задаче 5: \nЧто это такое: синий, большой, с усами и полностью набит зайцами?")
    while (true) {
        when (readln().lowercase()) {
            "троллейбус" -> {
                println("Правильно!")
                return
            }
            "сдаюсь" -> {
                println("Правильный ответ: троллейбус.")
                return
            }
            else -> {
                if (count != 2) {
                    println("Подумай ещё.")
                } else return
                count++
            }
        }
    }
}