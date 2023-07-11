//usr/bin/env [ $0 -nt ${0/.java/.class} ] && javac $0; [ ${0/.java/.class} -nt $0 ] && java $(basename $0 .java) $@; exit $?

public class JavaCached {
    public static void main(String [] args) {
        System.out.println("hello JavaCached.java");
    }
}

