assert 10 + 1 == 11
assert 10 ** 2 == 100

def a = 10
a += 5
assert a == 15
assert 3 != 4

assert -2 < 3
assert  2 <= 2
assert !false
assert true && true
assert true || false


def existResult(String s){
    def result = ''
    if (s != null && s.length() > 0) {
        result = 'Found'
    }else {
        result = 'Not Found'
    }
    return result
}

def existResultShort(String s){
    if (s != null && s.length() > 0) {
        result = 'Found'
    }else {
        result = 'Not Found'
    }
    return (a != null && s.length() > 0) ? 'Found' : 'Not Found'
}

String s = ""

assert existResult(s) == 'Not Found'
assert existResult("no soy pequeñito") == 'Found'


displayName = user.name ? user.name : 'Anonymous'
displayName = user.name ?: 'Anonymous'

Person p = new Person()
if (p.address != null){
    Address address = p.address
    address.first = "1234 Main"
}

def address = p?.address
assert address == null

// So much more
println "http://groovy-lang.org/operators.html"

