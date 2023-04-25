import java.util.*
import kotlin.time.Duration.Companion.minutes


private val date get() = Calendar.getInstance().time.toString()
fun main() {
    println("Hello World!")
    println("Start $date")
    Thread.sleep(15000).
    println("End $date")
}