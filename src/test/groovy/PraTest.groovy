import org.example.Pra
import spock.lang.Specification

class PraTest extends Specification {
    Pra target

    def setup(){
        target = new Pra()
    }

    def "Test Add "() {
        expect:
        target.add(1,1) == 2
    }
}
