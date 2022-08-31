def c = {}

println c.class.name
println c instanceof Closure

def sayHello = {
    println "hello"
}

sayHello()

def sayHelloWithArguments = { name ->
    println "hello $name"
}

sayHelloWithArguments("Alberto")

def useAClosure = { closure ->
    println "pre closure"
    closure()
    println "post closure"
}

useAClosure(sayHello)

List nums = [1, 4, 7, 10, 12, 3, 4]
nums.each({ println it})

// Closures are objects & last param

def timesTen(num, closure) {
    closure(num * 10)
}

def printInside = { Integer element ->
    println element
}

def printNumber = { Number element ->
    println element
}

timesTen(10, printInside)
timesTen(2, printInside)
timesTen(2) { println it}
timesTen(2, printNumber)