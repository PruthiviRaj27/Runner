fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Sleep Start")
    Thread.sleep(5000)
    println("Sleep End")
    println("Program arguments: ${args.joinToString()}")
}