import org.example.Pra
import spock.lang.Specification

class PraTest extends Specification {
    Pra target

    def setup(){
        target = new Pra()
    }

    def "Test Add2 "() {
        expect:
        target.add2(a,b) == expected

        where:
        a | b || expected
        1 | 1 || 2
        2 | 1 || 2
    }
}
