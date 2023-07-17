package kg.kench.unittest

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class ActivityTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleDivide(){
        Espresso.onView(withId(R.id.et_fnum)).perform(ViewActions.typeText("10"))
        Espresso.onView(withId(R.id.et_fnum)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.et_snum)).perform(ViewActions.typeText("0"))
        Espresso.onView(withId(R.id.et_snum)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.btn_divide)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.tv_result)).check(ViewAssertions.matches(ViewMatchers.withText("Can't divide by zero")))
    }
}