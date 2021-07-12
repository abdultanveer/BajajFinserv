package com.abdul.bajajfinserv.collections

class Lists {

}

fun main() {


    val numbers: List<Int> = listOf(1,2,3,4,5,6)
    println("List: $numbers")
    println("Size: ${numbers.size}")
    println("First element is: ${numbers[0]}")
    println("Second element is: ${numbers[1]}")
    println("last  element is: ${numbers[numbers.size-1]}")
    println("Last index is: ${numbers.size-1}")
    println("Contain 4: ${numbers.contains(4)}")
    println("Contain 4: ${numbers.contains(7)}")






}