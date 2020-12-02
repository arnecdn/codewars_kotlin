import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class GpsSpeedKtTest{
    @Test
    fun test1() {
        println("Fixed Tests: gps")
        var x = doubleArrayOf(0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25)
        testing(gps(15, x), 74)
    }

    @Test
    fun test2() {
        println("Fixed Tests: gps")
        var x = doubleArrayOf(0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61)
        testing(gps(20, x), 41)
        x = doubleArrayOf(0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25)
        testing(gps(12, x), 219)

    }

    @Test
    fun test3() {
        println("Fixed Tests: gps")
        var x = doubleArrayOf(0.0)
        testing(gps(15, x), 0)
    }

    companion object {
        private fun randInt(min:Int, max:Int):Int {
            return min + (Math.random() * ((max - min) + 1)).toInt()
        }
        private fun testing(actual:Int, expected:Int) {
            assertEquals(expected, actual)
        }
    }
}