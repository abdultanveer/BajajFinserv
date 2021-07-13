package com.abdul.bajajfinserv

import androidx.test.espresso.Espresso
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import junit.framework.TestCase
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches





@LargeTest
@RunWith(AndroidJUnit4::class)
class HomeActivityTest1 : TestCase(){
    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(HomeActivity::class.java)

    @Test
    fun homeActivityTest() {
        onView(withId(R.id.etHome)).perform(typeText("abdul"))
        onView(withId(R.id.buttonSend)).perform(click())
        onView(withId(R.id.textViewHome)).check(matches(withText("abdul")))
    }
}