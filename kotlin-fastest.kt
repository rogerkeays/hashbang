//usr/bin/env [ $0 -nt $0.jar ] && kotlinc -d $0.jar $0; [ $0.jar -nt $0 ] && java -cp $0.jar:$CLASSPATH Kotlin_fastestKt "$@"; exit $?

// first run is slow because of compiling
// launched with java instead of kotlin
// requires you to put the kotlin stdlib on the classpath
// export CLASSPATH=.:$HOME/tools/kotlin-1.7.0/lib/kotlin-stdlib.jar
fun main() {
    println("hello kotlin-fastest.kt")
}

