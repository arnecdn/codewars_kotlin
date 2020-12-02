import kotlin.math.nextDown

fun gps(s:Int, x:DoubleArray):Int {
    if (x == null|| x.size == 0 ) return 0
    if (x.size == 1) return x.last().toInt()

    val totals = x.toList().windowed(2).map{
             (3600* (it.last() - it.first())) / s
    }
    return totals.max()!!.toInt()
}