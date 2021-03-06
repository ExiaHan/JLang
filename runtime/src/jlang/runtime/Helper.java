//Copyright (C) 2018 Cornell University

package jlang.runtime;

// Helper functions that implement Java semantics so that the compiler
// doesn't have to. That is, a JLang translation can sometimes call one of
// these helper methods rather than translating everything directly.
class Helper {

    // If o or o.toString() are null, we must substitute "null".
    static String toString(Object o) {
        if (o == null) return "null";
        String res = o.toString();
        return res == null ? "null" : res;
    }

    static void arrayStore(Object[] arr, int i, Object o) {
	arr[i] = o;
    }

    static Object arrayLoad(Object[] arr, int i) {
	return arr[i];
    }

    static Integer autoBoxInt(int i) {
        return new Integer(i);
    }

    static void printString(String s) {
        System.out.println(s);
    }
}
