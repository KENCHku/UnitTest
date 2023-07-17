package kg.kench.unittest

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class DivideTest {

    var divide: kg.kench.unittest.Divide? = null

    @Before
    fun init() {
        divide = Divide()
    }

    @Test
    fun divide() {
        assertEquals("5", divide?.divide("10", "2"))
    }

    @Test
    fun divideZero() {
        assertEquals("Can't divide by zero", divide?.divide("10", "0"))
    }

    @After
    fun detach() {
        divide = null
    }
}