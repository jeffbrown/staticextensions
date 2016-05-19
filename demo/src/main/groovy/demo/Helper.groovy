package demo

import groovy.transform.CompileStatic

@CompileStatic
class Helper {

    String convertString(String s) {
        s.pigLatin
    }
}
