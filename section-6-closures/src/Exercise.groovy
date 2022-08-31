println "********* Closures"

def methodThatAcceptsAClosure(Closure closure){
    closure()
}

def multiplyByTen = { it = 0 ->
    println it * 10
}

methodThatAcceptsAClosure multiplyByTen

println "********* Lists"

def newList = [1, 2, 3, 4]

newList.each multiplyByTen

println "********* Maps"

def person = [name: 'Alberto', secondName: 'Eyo', age: 36]

person.each { key, value -> println "$key: $value"}


println "********* Curry"

def add = { x, y -> x + y}
def addOne = add.curry(1)

println addOne(2)
assert addOne(12) == 13


println "********* Explore the GDK"

def numbers = [1, 2, 3, 4]

assert numbers.findAll({ it > 2}) == [3, 4]
assert numbers.find({ it > 2}) == 3

assert !numbers.every({it > 2})
assert numbers.any({it > 2})

assert [0:[2,4,6], 1:[1,3,5]] == [1,2,3,4,5,6].groupBy { it % 2 }
// assert  [false:[1, 2], true: [3, 4]] == numbers.groupBy {it > 2}
