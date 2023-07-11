//usr/bin/env [ $0 -nt $0.jar ] && kotlinc -d $0.jar $0; [ $0.jar -nt $0 ] && kotlin -cp $0.jar Kotlin_cached_namedKt $@; exit $?

// compiled class name is hardcoded to keep the startup line shorter
fun main() {
    println("hello kotlin-cached-named.kt");
}

