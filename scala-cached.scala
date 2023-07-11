//usr/bin/env [ $0 -nt ${0/.scala/.jar} ] && scala -savecompiled $0 || java -jar ${0/.scala/.jar} "$@"; exit $?

object Main extends App {
    println("hello scala-cached.scala")
}

