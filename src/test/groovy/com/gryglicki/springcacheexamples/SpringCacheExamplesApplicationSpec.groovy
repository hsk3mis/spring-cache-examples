package com.gryglicki.springcacheexamples

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class SpringCacheExamplesApplicationSpec extends Specification {

    def "should load context"() {
        given:
            def s = "abc"
        when:
            def sUpper = s.toUpperCase()
        then:
            sUpper == "ABc"
    }
}
