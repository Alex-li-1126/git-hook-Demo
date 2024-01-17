package com.LXY.leetCode

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.Random

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
//        assertEquals(4, 2 + 2)
        println( "答案：" + 13/6)
    }
    @Test
    fun main() {
        var rand = Random()
        for (i in 0 .. 23)
        {
            val randomValue = 0 + (3 - 0) * rand.nextDouble()
            println((Math.round(randomValue * 10.0) / 10.0).toString() +  ",")
        }
    }

}
