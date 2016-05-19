package demo

class StringExtensions {

    static String getPigLatin(String s) {
        s[1..-1] + s[0] + 'ay'
    }
}
