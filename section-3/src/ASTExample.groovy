import groovy.transform.Memoized
import groovy.transform.NullCheck

class ASTExample {
    @Memoized
    @NullCheck
    def calculateNumber(Integer num){
        println "calculating $num"
        if (num == 2){
            return 4
        }
        return 1
    }
}
