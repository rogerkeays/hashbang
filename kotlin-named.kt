//usr/bin/env kotlinc -d $0.jar $0 && kotlin -cp $0.jar KotlinKt $@; exit $?

// compiled class name is hardcoded to keep the startup line shorter
// no caching
fun main() {
    println("hello kotlin-named.kt");
}

