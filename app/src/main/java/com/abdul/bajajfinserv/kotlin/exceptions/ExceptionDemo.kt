package com.abdul.bajajfinserv.kotlin.exceptions

class ExceptionDemo {
}

fun main() {



    try {
        val a = IntArray(5)
        a[5] = 10 / 1
    } catch (e: ArithmeticException) {
        e.printStackTrace()
        //println("arithmetic exception catch")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("array index outofbounds exception")
    } catch (e: Exception) {
        println("parent exception class")
    }
    finally {
        println("this block of code executes irrespective of occurence of an exception")
    }
    println("code after try catch...")
}