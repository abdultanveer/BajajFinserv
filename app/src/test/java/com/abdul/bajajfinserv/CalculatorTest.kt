package com.abdul.bajajfinserv

import junit.framework.TestCase
import org.junit.Test

class CalculatorTest : TestCase(){
    lateinit var calculator: Calculator

    override fun setUp() {
        super.setUp()
         calculator = Calculator();

    }



    @Test
   fun test_Add()
    {
        var expected = 30
        var actual = calculator.add(10, 20)
        assertEquals(expected,actual)
    }

    override fun tearDown() {
        super.tearDown()
    }

}