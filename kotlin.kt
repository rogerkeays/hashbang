//usr/bin/env kotlinc -d $0.jar $0 && kotlin -cp $0.jar $(echo $(basename $0) | sed "s/^./\U&/;s/-/_/g;s/.kt$/Kt/") $@; exit $?

fun main() {
    println("hello kotlin.kt");
}

