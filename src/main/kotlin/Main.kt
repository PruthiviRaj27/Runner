import java.util.*
import kotlin.time.Duration.Companion.minutes


private val date get() = Calendar.getInstance().time.toString()
fun main() {
    println("Hello World!")
    println("Start $date")
    val duration = 10.minutes
    Thread.sleep(duration.inWholeMilliseconds)
    println("End $date")
}