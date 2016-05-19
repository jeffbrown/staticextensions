package demo

import spock.lang.Specification

class HelperSpec extends Specification {

    void 'test string conversion'() {
        given:
        def helper =new Helper()

        when:
        def result = helper.convertString('jake')

        then:
        result == 'akejay'
    }
}
