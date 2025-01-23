fun main() {
    checkEvenOrOdd()
    findMinimumOfThree()
    multiplicationTable()
    sumFromOneToN()
    fibonacciNumbers()
    checkPrime()
    reverseOrder()
    sumOfEvenNumbers()
    reverseString()
    countDigits()
    factorial()
    sumOfDigits()
    checkPalindrome()
    findMaxInArray()
    sumOfArrayElements()
    countPositivesAndNegatives()
    primeNumbersInRange()
    countVowelsAndConsonants()
    reverseWords()
    checkArmstrongNumber()
}

// Задание 1.1: Четное или нечетное число
fun checkEvenOrOdd() {
    print("Введите число: ")
    val number = readLine()!!.toInt()
    println(if (number % 2 == 0) "Четное" else "Нечетное")
}

// Задание 1.2: Минимальное из трех чисел
fun findMinimumOfThree() {
    print("Введите три числа: ")
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    println("Минимальное число: ${minOf(a, b, c)}")
}

// Задание 1.3: Таблица умножения
fun multiplicationTable() {
    for (i in 1..10) {
        println("5 * $i = ${5 * i}")
    }
}

// Задание 1.4: Сумма чисел от 1 до N
fun sumFromOneToN() {
    print("Введите число N: ")
    val n = readLine()!!.toInt()
    println("Сумма: ${(1..n).sum()}")
}

// Задание 1.5: Число Фибоначчи
fun fibonacciNumbers() {
    print("Введите число N: ")
    val n = readLine()!!.toInt()
    val fibonacci = mutableListOf(0, 1)
    for (i in 2 until n) {
        fibonacci.add(fibonacci[i - 1] + fibonacci[i - 2])
    }
    println("Числа Фибоначчи: ${fibonacci.take(n)}")
}

// Задание 1.6: Проверка простого числа
fun checkPrime() {
    print("Введите число: ")
    val number = readLine()!!.toInt()
    val isPrime = number > 1 && (2..Math.sqrt(number.toDouble()).toInt()).none { number % it == 0 }
    println(if (isPrime) "Простое" else "Не простое")
}

// Задание 1.7: Обратный порядок чисел
fun reverseOrder() {
    print("Введите число N: ")
    val n = readLine()!!.toInt()
    for (i in n downTo 1) {
        print("$i ")
    }
    println()
}

// Задание 1.8: Сумма четных чисел
fun sumOfEvenNumbers() {
    print("Введите два числа A и B: ")
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println("Сумма четных чисел: ${(a..b).filter { it % 2 == 0 }.sum()}")
}

// Задание 1.9: Реверс строки
fun reverseString() {
    print("Введите строку: ")
    val input = readLine()!!
    println("Реверс: ${input.reversed()}")
}

// Задание 1.10: Количество цифр в числе
fun countDigits() {
    print("Введите число: ")
    val number = readLine()!!.toInt()
    println("Количество цифр: ${number.toString().length}")
}

// Задание 1.11: Факториал числа
fun factorial() {
    print("Введите число N: ")
    val n = readLine()!!.toInt()
    println("Факториал: ${(1..n).fold(1L) { acc, i -> acc * i }}")
}

// Задание 1.12: Сумма цифр числа
fun sumOfDigits() {
    print("Введите число: ")
    val number = readLine()!!.toInt()
    println("Сумма цифр: ${number.toString().map { it.digitToInt() }.sum()}")
}

// Задание 1.13: Палиндром
fun checkPalindrome() {
    print("Введите строку: ")
    val input = readLine()!!
    println(if (input == input.reversed()) "Палиндром" else "Не палиндром")
}

// Задание 1.14: Найти максимальное число в массиве
fun findMaxInArray() {
    print("Введите размер массива: ")
    val size = readLine()!!.toInt()
    print("Введите элементы массива: ")
    val array = readLine()!!.split(" ").map { it.toInt() }
    println("Максимальное число: ${array.maxOrNull()}")
}

// Задание 1.15: Сумма всех элементов массива
fun sumOfArrayElements() {
    print("Введите размер массива: ")
    val size = readLine()!!.toInt()
    print("Введите элементы массива: ")
    val array = readLine()!!.split(" ").map { it.toInt() }
    println("Сумма элементов: ${array.sum()}")
}

// Задание 1.16: Количество положительных и отрицательных чисел
fun countPositivesAndNegatives() {
    print("Введите размер массива: ")
    val size = readLine()!!.toInt()
    print("Введите элементы массива: ")
    val array = readLine()!!.split(" ").map { it.toInt() }
    val positives = array.count { it > 0 }
    val negatives = array.count { it < 0 }
    println("Положительных: $positives, Отрицательных: $negatives")
}

// Задание 1.17: Простые числа в диапазоне
fun primeNumbersInRange() {
    print("Введите два числа A и B: ")
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val primes = (a..b).filter { number ->
        number > 1 && (2..Math.sqrt(number.toDouble()).toInt()).none { number % it == 0 }
    }
    println("Простые числа: ${primes.joinToString(", ")}")
}

// Задание 1.18: Подсчет гласных и согласных в строке
fun countVowelsAndConsonants() {
    print("Введите строку: ")
    val input = readLine()!!.lowercase()
    val vowels = "aeiou"
    val consonants = "bcdfghjklmnpqrstvwxyz"
    val vowelCount = input.count { it in vowels }
    val consonantCount = input.count { it in consonants }
    println("Гласные: $vowelCount, Согласные: $consonantCount")
}

// Задание 1.19: Перестановка слов в строке
fun reverseWords() {
    print("Введите строку: ")
    val input = readLine()!!
    println("Реверс слов: ${input.split(" ").reversed().joinToString(" ")}")
}

// Задание 1.20: Число Армстронга
fun checkArmstrongNumber() {
    print("Введите число: ")
    val number = readLine()!!.toInt()
    val digits = number.toString().map { it.digitToInt() }
    val armstrongSum = digits.sumOf { Math.pow(it.toDouble(), digits.size.toDouble()).toInt() }
    println(if (armstrongSum == number) "Число Армстронга" else "Не число Армстронга")
}