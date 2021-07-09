package com.abdul.bajajfinserv.kotlin.exceptions

import java.lang.ArithmeticException

class Throwkw {
}

fun main() {
    validateAge(18)
    println("code after validation check...")

}

fun validateAge(age: Int){
    if (age<18)
        throw ArithmeticException("underage cant drive")
    else
        println("you can drive")
}